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


public class RecentFragment extends Fragment implements RecentPostAdapter.onItemClicked {

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
    private String baseURL = "https://readhub.lk/wp-json/wp/v2/";
            //"https://readhub.lk/wp-json/wp/v2/";

    public static final String RENDER_CONTENT = "render";
    public static final String link = "link";

    int cacheSize = 20 * 1024 * 1024; // 10 MB
    Cache cache;
    OkHttpClient okHttpClient;
    private boolean isViewShown = false;
    private DatabaseReference mDatabase;
    private FirebaseAuth mAuth;
    ValueEventListener valueEventListener;


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

        mDatabase = FirebaseDatabase.getInstance().getReference("Articles").child(userId).child("Recent Articles");
       // mDatabase.removeValue();
        list = new ArrayList<RecentModel>();

//        progressDialog1.show();
//        adapter = new RecentPostAdapter(list,getContext());
//        new GetRecentJSON1().execute();

        if(haveNetwork(getContext())){

            progressDialog1.show();
            if(getView() != null){
                mDatabase.removeValue();
                new GetRecentJSON().execute();
                list.clear();
                InitListner();
                mDatabase.addValueEventListener(valueEventListener);

            }

        }else{


            if(getView() != null){
                new GetRecentJSON().execute();
                list.clear();
                InitListner();
                mDatabase.addValueEventListener(valueEventListener);


            }
            progressDialog1.dismiss();
            mDatabase.keepSynced(true);
        }

       // FirebaseDatabase.getInstance().goOffline();

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

//    @Override
//    public void onPause() {
//        super.onPause();
//        if(mDatabase != null){
//            mDatabase.removeEventListener(valueEventListener);
//            valueEventListener = null;
//
//        }
//    }

//    @Override
//    public void onStop() {
//        super.onStop();
//        if(mDatabase != null){
//            mDatabase.removeEventListener(valueEventListener);
//            valueEventListener = null;
//
//        }
//    }

    public class GetRecentJSON extends AsyncTask<Void,Void,Void>{


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

            Call<List<WPPost>> call = retrofitArrayAPI.getPostInfo();

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
                                response.body().get(i).getEmbedded().getWpFeaturedmedia().get(0).getMediaDetails().getSizes().getThumbnail().getSourceUrl(),render,RecentModel.IMAGE_TYPE,response.body().get(i).getEmbedded().getAuthor().get(0).getName(),response.body().get(i).getLink());
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

    public class GetRecentJSON1 extends AsyncTask<Void,Void,Void>{



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

            Call<List<WPPost>> call = retrofitArrayAPI.getPostInfo();


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
                adapter.SetOnItemClickListener(RecentFragment.this);


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

                adapter = new RecentPostAdapter(list,getContext());
                new GetRecentJSON1().execute();
                recyclerView.setAdapter(adapter);
                adapter.SetOnItemClickListener(RecentFragment.this);

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

//package com.example.yohan.blogapp;
//
//import android.app.Dialog;
//import android.app.ProgressDialog;
//import android.content.Context;
//import android.content.Intent;
//import android.net.ConnectivityManager;
//import android.net.NetworkInfo;
//import android.os.AsyncTask;
//import android.os.Bundle;
//import android.support.annotation.Nullable;
//import android.support.v4.app.Fragment;
//import android.support.v4.widget.SwipeRefreshLayout;
//import android.support.v7.widget.LinearLayoutManager;
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Toast;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import okhttp3.Cache;
//import okhttp3.OkHttpClient;
//import retrofit2.Call;
//import retrofit2.Callback;
//import retrofit2.Response;
//import retrofit2.Retrofit;
//import retrofit2.converter.gson.GsonConverterFactory;
//
//import static android.content.Context.CONNECTIVITY_SERVICE;
//
//
//public class RecentFragment extends Fragment implements RecentPostAdapter.onItemClicked {
//
//    private RecyclerView recyclerView;
//    private SwipeRefreshLayout swipeRefreshLayout;
//    // private ProgressBar progressBar;
//    private LinearLayoutManager linearLayoutManager;
//    ProgressDialog progressDialog1,progressDialog2;
//    View view;
//    Context context;
//    Dialog MyDialog1;
//
//    private ArrayList<RecentModel> list;
//    private RecentPostAdapter adapter;
//    //  public String render;
//
//    private String baseURL = "https://readhub.lk/wp-json/wp/v2/";
//
//    public static final String RENDER_CONTENT = "render";
//    public static final String title = "render";
//
//    int cacheSize = 20 * 1024 * 1024; // 10 MB
//    Cache cache;
//    OkHttpClient okHttpClient;
//    private boolean isViewShown = false;
//    private String url ;
//
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//
//        view = inflater.inflate(R.layout.fragment_recent, container, false);
//
//
//        // progressBar = v.findViewById(R.id.)
//
//        return view;
//    }
//
//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//
//        recyclerView = view.findViewById(R.id.recycleView_Recent);
//        //swipeRefreshLayout = view.findViewById(R.id.myswipe);
//        recyclerView.setHasFixedSize(true);
//        linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL,false);
//        recyclerView.setLayoutManager(linearLayoutManager);
//
//
////        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
////            @Override
////            public void onRefresh() {
////                if(haveNetwork(getContext())){
////                    progressDialog1 = new ProgressDialog(getContext());
////                    progressDialog1.setTitle("Recents Posts");
////                    progressDialog1.setMessage("Loading");
////                    progressDialog1.show();
////                    new GetRecentJSON().execute();
////                    list.clear();
////                }else {
////                    connectionDialog1();
////
////                }
////            }
////        });
//
//
//        OkHttpClient client = new OkHttpClient.Builder()
//                .connectTimeout(120, TimeUnit.SECONDS)
//                .writeTimeout(120, TimeUnit.SECONDS)
//                .readTimeout(120, TimeUnit.SECONDS)
//                .build();
//        if(haveNetwork(getContext())){
//
//            if(getView() != null){
//                progressDialog1 = new ProgressDialog(getContext());
//                progressDialog1.setTitle("Recents Posts");
//                progressDialog1.setMessage("Loading");
//                progressDialog1.show();
//                new GetRecentJSON().execute();
//            }
//
//            list = new ArrayList<RecentModel>();
//
//            adapter = new RecentPostAdapter(list,getContext());
//            // new GetRecentJSON().execute();
//            recyclerView.setAdapter(adapter);
//            adapter.SetOnItemClickListener(RecentFragment.this);
//
//        }else{
//
//            connectionDialog1();
//            //   new GetRecentJSON().execute();
//
//        }
//
//
//
//
//
//
//
//    }
//
////    @Override
////    public void setUserVisibleHint(boolean isVisibleToUser) {
////        super.setUserVisibleHint(isVisibleToUser);
////        if(getView() != null && isVisibleToUser){
////
////
////        }else {
////
////            isViewShown = false;
////        }
////    }
//
//
//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//
//    }
//
//    @Override
//    public void onDetach() {
//        super.onDetach();
//
//    }
//
////    @Override
////    public void onStart() {
////        super.onStart();
////        progressDialog1 = new ProgressDialog(getContext());
////        progressDialog1.setTitle("Recents Posts");
////        progressDialog1.setMessage("Loading");
////        progressDialog1.show();
////        new GetRecentJSON().execute();
////    }
//
//    @Override
//    public void OnItemClick(int index) {
//        Intent i = new Intent(getContext(),RecentPostView.class);
//        RecentModel model = list.get(index);
//        i.putExtra(RENDER_CONTENT,model.render);
//        // i.putExtra(title,model.title);
//        startActivity(i);
//
//    }
//
//    public class GetRecentJSON extends AsyncTask<Void,Void,Void>{
//
//
//
//        @Override
//        protected void onPreExecute() {
//            super.onPreExecute();
//
////            progressDialog = new ProgressDialog(getContext());
////            progressDialog.setTitle("Recent Post");
////            progressDialog.setMessage("Loading");
////            progressDialog.show();
//        }
//
//        @Override
//        protected Void doInBackground(Void... voids) {
//
//
//            Retrofit retrofit = new Retrofit.Builder()
//                    .baseUrl(baseURL)
//                    .client(okHttpClient)
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .build();
//
//            RetrofitArrayAPI retrofitArrayAPI = retrofit.create(RetrofitArrayAPI.class);
//
//            Call<List<WPPost>> call = retrofitArrayAPI.getPostInfo();
//
//            call.enqueue(new Callback<List<WPPost>>() {
//                @Override
//                public void onResponse(Call<List<WPPost>> call, Response<List<WPPost>> response) {
//                    //Toast.makeText(getContext(),"done",Toast.LENGTH_LONG).show();
//                    //  progressBar.setVisibility(View.GONE);
//
//                    progressDialog1.dismiss();
//                    swipeRefreshLayout.setRefreshing(false);
//                    for(int i = 0; i<response.body().size(); i++){
//
//                        String temdetails = response.body().get(i).getDate();
//                        String titile = response.body().get(i).getTitle().getRendered().toString();
//                        titile = titile.replace("&#8211;","");
//                        titile = titile.replace("&#x200d;","");
//                        titile = titile.replace("&#8230;","");
//                        titile = titile.replace("&#8220;","");
//                        titile = titile.replace("&#8221;","");
//                        String render = response.body().get(i).getContent().getRendered();
//
//
//                        /// render = render.replace("--aspect-ratio","aspect-ratio");
//
//                        // String profileUrl = response.body().get(i).getLinks().getAuthor().get(0).getHref();
//
//                        list.add(new RecentModel( titile,
//                                temdetails,
//                                response.body().get(i).getEmbedded().getWpFeaturedmedia().get(0).getMediaDetails().getSizes().getThumbnail().getSourceUrl(),render,RecentModel.IMAGE_TYPE,response.body().get(i).getEmbedded().getAuthor().get(0).getName()));
//                    }
//
//                    adapter.notifyDataSetChanged();
//
//
//                }
//
//                @Override
//                public void onFailure(Call<List<WPPost>> call, Throwable t) {
//                    progressDialog1.dismiss();
//                   Toast.makeText(getContext(),t.getMessage(),Toast.LENGTH_LONG).show();
//                }
//            });
//
//            return null;
//        }
//
//        @Override
//        protected void onPostExecute(Void aVoid) {
//            super.onPostExecute(aVoid);
//            //  progressDialog.dismiss();
//        }
//    }
//
//    public void connectionDialog1(){
//        MyDialog1 = new Dialog(getContext());
//        MyDialog1.setContentView(R.layout.customconnectiondialog);
//        MyDialog1.setTitle("Error");
//        MyDialog1.show();
//    }
//
//
//    private boolean haveNetwork(Context context){
//        boolean have_WIFI = false;
//        boolean have_MobileData = false;
//
//        ConnectivityManager connectivityManager = (ConnectivityManager) getContext().getSystemService(CONNECTIVITY_SERVICE);
//        // NetworkInfo [] networkInfos = connectivityManager.getAllNetworkInfo();
//        if (connectivityManager != null)
//        {
//            NetworkInfo[] info = connectivityManager.getAllNetworkInfo();
//            if (info != null)
//                for (int i = 0; i < info.length; i++)
//                    if (info[i].getState() == NetworkInfo.State.CONNECTED)
//                    {
//                        return true;
//                    }
//        }
//        return false;
//    }
//
//
//}
