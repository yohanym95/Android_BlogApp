package com.example.yohan.blogapp;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static android.content.Context.CONNECTIVITY_SERVICE;

public class fragmentengRecent extends Fragment implements RecentPostAdapter.onItemClicked {

    private RecyclerView recyclerView;
    // private SwipeRefreshLayout swipeRefreshLayout;
    // private ProgressBar progressBar;
    private LinearLayoutManager linearLayoutManager;
    ProgressDialog progressDialog1;
    View view;
    Context context;
    Dialog MyDialog1;
    private ArrayList<RecentModel> list;
    private RecentPostAdapter adapter;
    // Stupublic String render;
    private String baseURL = "https://english.readhub.lk/wp-json/wp/v2/";

    public static final String RENDER_CONTENT = "render";
    public static final String link = "link";

    int cacheSize = 20 * 1024 * 1024; // 10 MB
    Cache cache;
    OkHttpClient okHttpClient;
    private boolean isViewShown = false;
    private DatabaseReference mDatabase;
    private FirebaseAuth mAuth;
    ValueEventListener valueEventListener;
  //  FloatingActionButton fab1;
    SectionPagerAdapater section;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fragmenteng_recent,container,false);

//        fab1 = view.findViewById(R.id.fab_1);
//
//        fab1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        recyclerView = view.findViewById(R.id.EngrecycleView_Recent);
        //fab1 = view.findViewById(R.id.fab_1);
        // swipeRefreshLayout = view.findViewById(R.id.myswipe);
        recyclerView.setHasFixedSize(true);
        linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        progressDialog1 = new ProgressDialog(getContext());
        progressDialog1.setTitle("Recents Posts");
        progressDialog1.setMessage("Loading");
        okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(120, TimeUnit.SECONDS)
                .readTimeout(120, TimeUnit.SECONDS)
                .build();

        mAuth = FirebaseAuth.getInstance();

        String userId = mAuth.getUid();


        mDatabase = FirebaseDatabase.getInstance().getReference("Articles").child(userId).child("Recent English Articles");

//        fab1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(getContext(),MainActivity.class);
//
//            }
//        });


        // mDatabase.removeValue();
        list = new ArrayList<RecentModel>();
        progressDialog1.show();
        if(haveNetwork(getContext())){


            if(getView() != null){
                mDatabase.removeValue();
                new GetEngRecentJSON().execute();
                list.clear();
                InitListner();
                mDatabase.addValueEventListener(valueEventListener);

            }

        }else{


            if(getView() != null){
                new GetEngRecentJSON().execute();
                list.clear();
                InitListner();
                mDatabase.addValueEventListener(valueEventListener);


            }
            progressDialog1.dismiss();
            mDatabase.keepSynced(true);
        }


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
        i.putExtra(link,model.link);
        startActivity(i);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        // databaseReference.removeEventListener(valueEventListener);
        //   mDatabase.removeEventListener(getContext());
        if(mDatabase != null){
            mDatabase.removeEventListener(valueEventListener);
            valueEventListener = null;
            //FirebaseDatabase.getInstance().goOffline();
        }
    }


    public class GetEngRecentJSON extends AsyncTask<Void,Void,Void> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();


        }

        @Override
        protected Void doInBackground(Void... voids) {


            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(baseURL)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            RetrofitArrayAPI retrofitArrayAPI = retrofit.create(RetrofitArrayAPI.class);

            Call<List<WPPost>> call = retrofitArrayAPI.getEngPostInfo();

            call.enqueue(new Callback<List<WPPost>>() {
                @Override
                public void onResponse(Call<List<WPPost>> call, Response<List<WPPost>> response) {

                    for(int i = 0; i<response.body().size(); i++){

                        String temdetails = response.body().get(i).getDate();
                        String titile = response.body().get(i).getTitle().getRendered().toString();
                        titile = titile.replace("&#8211;","");
                        titile = titile.replace("&#x200d;","");
                        titile = titile.replace("&#8230;","");
                        titile = titile.replace("&#8220;","");
                        titile = titile.replace("&#8221;","");
                        String render = response.body().get(i).getContent().getRendered();

                        Model model = new Model( titile,
                                temdetails,
                                response.body().get(i).getEmbedded().getWpFeaturedmedia().get(0).getMediaDetails().getSizes().getMedium().getSourceUrl(),render,RecentModel.IMAGE_TYPE,response.body().get(i).getEmbedded().getAuthor().get(0).getName(),response.body().get(i).getLink());
                        progressDialog1.dismiss();
                        mDatabase.push().setValue(model).addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if(task.isSuccessful()){

                                    progressDialog1.dismiss();
                                    //FirebaseDatabase.getInstance().goOffline();

                                }else {

                                    progressDialog1.dismiss();
                                    //FirebaseDatabase.getInstance().goOffline();

                                }

                            }
                        });

                    }

                }

                @Override
                public void onFailure(Call<List<WPPost>> call, Throwable t) {
                    progressDialog1.dismiss();
                    Toast.makeText(getContext(),t.getMessage(),Toast.LENGTH_LONG).show();
                }
            });

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);

        }
    }

    public class GetEngRecentJSON1 extends AsyncTask<Void,Void,Void>{



        @Override
        protected void onPreExecute() {
            super.onPreExecute();

//            progressDialog = new ProgressDialog(getContext());
//            progressDialog.setTitle("Recent Post");
//            progressDialog.setMessage("Loading");
//            progressDialog.show();
        }

        @Override
        protected Void doInBackground(Void... voids) {


            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(baseURL)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            RetrofitArrayAPI retrofitArrayAPI = retrofit.create(RetrofitArrayAPI.class);

            Call<List<WPPost>> call = retrofitArrayAPI.getEngPostInfo();


            call.enqueue(new Callback<List<WPPost>>() {
                @Override
                public void onResponse(Call<List<WPPost>> call, Response<List<WPPost>> response) {
                    list.clear();
                    progressDialog1.dismiss();
                    for(int i = 0; i<response.body().size(); i++){

                        String temdetails = response.body().get(i).getDate();
                        String titile = response.body().get(i).getTitle().getRendered().toString();
                        titile = titile.replace("&#8211;","");
                        titile = titile.replace("&#x200d;","");
                        titile = titile.replace("&#8230;","");
                        titile = titile.replace("&#8220;","");
                        titile = titile.replace("&#8221;","");
                        String render = response.body().get(i).getContent().getRendered();

                        /// render = render.replace("--aspect-ratio","aspect-ratio");
                        // String profileUrl = response.body().get(i).getLinks().getAuthor().get(0).getHref();

                        list.add(new RecentModel( titile,
                                temdetails,
                                response.body().get(i).getEmbedded().getWpFeaturedmedia().get(0).getMediaDetails().getSizes().getThumbnail().getSourceUrl(),render,RecentModel.IMAGE_TYPE,response.body().get(i).getEmbedded().getAuthor().get(0).getName(),response.body().get(i).getLink()));
                    }

                    adapter.notifyDataSetChanged();
//                    recyclerView.setAdapter(adapter);
//                    adapter.SetOnItemClickListener(RecentFragment.this);


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
            //  progressDialog.dismiss();
        }
    }

    public void connectionDialog1(){
        MyDialog1 = new Dialog(getContext());
        MyDialog1.setContentView(R.layout.customconnectiondialog);
        MyDialog1.setTitle("Error");
        MyDialog1.show();
    }

    private void InitListner(){
        valueEventListener = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {



                list.clear();
                for (DataSnapshot data : dataSnapshot.getChildren()){

                    RecentModel model = data.getValue(RecentModel.class);
                    list.add(model);


                }

                adapter = new RecentPostAdapter(list,getContext());
                recyclerView.setAdapter(adapter);
                adapter.SetOnItemClickListener(fragmentengRecent.this);


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

                adapter = new RecentPostAdapter(list,getContext());
                new GetEngRecentJSON1().execute();
                recyclerView.setAdapter(adapter);
                adapter.SetOnItemClickListener(fragmentengRecent.this);

            }

        };
    }


    private boolean haveNetwork(Context context){
        boolean have_WIFI = false;
        boolean have_MobileData = false;

        ConnectivityManager connectivityManager = (ConnectivityManager) getContext().getSystemService(CONNECTIVITY_SERVICE);

        if (connectivityManager != null)
        {
            NetworkInfo[] info = connectivityManager.getAllNetworkInfo();
            if (info != null)
                for (int i = 0; i < info.length; i++)
                    if (info[i].getState() == NetworkInfo.State.CONNECTED)
                    {
                        return true;
                    }
        }
        return false;
    }


}



