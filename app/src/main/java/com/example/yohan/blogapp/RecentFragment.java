package com.example.yohan.blogapp;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RecentFragment extends Fragment implements RecentPostAdapter.onItemClicked {

    private RecyclerView recyclerView;
   // private ProgressBar progressBar;
    private LinearLayoutManager linearLayoutManager;
    ProgressDialog progressDialog1;
    View view;

    private ArrayList<RecentModel> list;
    private RecentPostAdapter adapter;
    //  public String render;

    private String baseURL = "https://readhublk.com/wp-json/wp/v2/";

    public static final String RENDER_CONTENT = "render";
    public static final String title = "render";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

         view = inflater.inflate(R.layout.fragment_recent, container, false);


       // progressBar = v.findViewById(R.id.)

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        recyclerView = view.findViewById(R.id.recycleView_Recent);
        recyclerView.setHasFixedSize(true);
        linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        list = new ArrayList<RecentModel>();

        adapter = new RecentPostAdapter(list,getContext());
        new GetRecentJSON().execute();
        recyclerView.setAdapter(adapter);
        adapter.SetOnItemClickListener(RecentFragment.this);
        progressDialog1 = new ProgressDialog(getContext());
        progressDialog1.setTitle("Recents Posts");
        progressDialog1.setMessage("Loading");
        progressDialog1.show();


    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }

    @Override
    public void OnItemClick(int index) {
        Intent i = new Intent(getContext(),RecentPostView.class);
        RecentModel model = list.get(index);
        i.putExtra(RENDER_CONTENT,model.render);
        // i.putExtra(title,model.title);
        startActivity(i);

    }

    public class GetRecentJSON extends AsyncTask<Void,Void,Void>{
        ProgressDialog progressDialog;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            progressDialog = new ProgressDialog(getContext());
            progressDialog.setTitle("Recent Post");
            progressDialog.setMessage("Loading");
            progressDialog.show();
        }

        @Override
        protected Void doInBackground(Void... voids) {

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(baseURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            RetrofitArrayAPI retrofitArrayAPI = retrofit.create(RetrofitArrayAPI.class);

            Call<List<WPPost>> call = retrofitArrayAPI.getPostInfo();

            call.enqueue(new Callback<List<WPPost>>() {
                @Override
                public void onResponse(Call<List<WPPost>> call, Response<List<WPPost>> response) {
                    Toast.makeText(getContext(),"done",Toast.LENGTH_LONG).show();
                  //  progressBar.setVisibility(View.GONE);

                    progressDialog1.dismiss();
                    for(int i = 0; i<response.body().size(); i++){

                        String temdetails = response.body().get(i).getDate();
                        String titile = response.body().get(i).getTitle().getRendered().toString();
                        titile = titile.replace("&#8211;","");
                        String render = response.body().get(i).getContent().getRendered();
                       /// render = render.replace("--aspect-ratio","aspect-ratio");

                       // String profileUrl = response.body().get(i).getLinks().getAuthor().get(0).getHref();

                        list.add(new RecentModel( titile,
                                temdetails,
                                response.body().get(i).getBetterFeaturedImage().getMediaDetails().getSizes().getTieMedium().getSourceUrl(),render,RecentModel.IMAGE_TYPE));
                    }

                    adapter.notifyDataSetChanged();


                }

                @Override
                public void onFailure(Call<List<WPPost>> call, Throwable t) {

                }
            });

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            progressDialog.dismiss();
        }
    }


}
