package com.example.yohan.blogapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

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

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class EnglishLifePost extends AppCompatActivity implements RecentPostAdapter.onItemClicked {

    private Toolbar mToolbar;
    // private SwipeRefreshLayout swipeRefreshLayout;
    private RecyclerView angularrecyclerView;
    private LinearLayoutManager linearLayoutManager;
    private ArrayList<RecentModel> list;
    private RecentPostAdapter recentPostAdapter;

    ProgressDialog progressDialog1;


    private String JavaBaseURL = "https://readhub.lk/wp-json/wp/v2/";
    public static final String RENDER_CONTENT = "RENDER";
    public  static final String link = "link";

    Dialog MyDialog1;

    private String url;
    private DatabaseReference mDatabase;
    private FirebaseAuth mAuth;
    ValueEventListener valueEventListener;
    OkHttpClient okHttpClient;
    sharedPref sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        sharedPreferences = new sharedPref(this);
        if (sharedPreferences.loadNightModeState() == true){
            setTheme(R.style.darkTheme);
        }else
            setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_life_post);

        mToolbar = findViewById(R.id.Englishpost_app_bar);
        // swipeRefreshLayout = findViewById(R.id.angularSwipe);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("ReadHub - English For Life");
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });



        progressDialog1 = new ProgressDialog(EnglishLifePost.this);
        progressDialog1.setTitle("English For Life Post");
        progressDialog1.setMessage("Loading");
        okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(120, TimeUnit.SECONDS)
                .readTimeout(120, TimeUnit.SECONDS)
                .build();


        mAuth = FirebaseAuth.getInstance();

        String userId = mAuth.getUid();

        mDatabase = FirebaseDatabase.getInstance().getReference("Articles").child(userId).child("English Articles");

        angularrecyclerView = findViewById(R.id.Englishrecycleview);

        linearLayoutManager = new LinearLayoutManager(EnglishLifePost.this,LinearLayoutManager.VERTICAL,false);
        angularrecyclerView.setLayoutManager(linearLayoutManager);
        list = new ArrayList<RecentModel>();

        progressDialog1.show();
        if(haveNetwork(getApplicationContext())){

            mDatabase.removeValue();
            new GetEnglishJson().execute();
            list.clear();
            InitListner();
            mDatabase.addValueEventListener(valueEventListener);
            //     mDatabase.keepSynced(true);



        }else{

            new GetEnglishJson().execute();
            list.clear();
            InitListner();
            mDatabase.addValueEventListener(valueEventListener);
            progressDialog1.dismiss();
            mDatabase.keepSynced(true);

        }
    }

    public class GetEnglishJson extends AsyncTask<Void,Void,Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
            //  progressDialog.show();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(JavaBaseURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            RetrofitArrayAPI retrofitArrayAPI = retrofit. create(RetrofitArrayAPI.class);

            Call<List<WPPost>> call = retrofitArrayAPI.getEnglishForLife();


            call.enqueue(new Callback<List<WPPost>>() {
                @Override
                public void onResponse(Call<List<WPPost>> call, Response<List<WPPost>> response) {

                    for (int i =0;i<response.body().size(); i++){

                        String temdetails = response.body().get(i).getDate();
                        String titile = response.body().get(i).getTitle().getRendered().toString();
                        titile = titile.replace("&#8211;","");
                        titile = titile.replace("&#x200d;","");
                        titile = titile.replace("&#8230;","");
                        titile = titile.replace("&amp;","");
                        titile = titile.replace("&#8220;","");
                        titile = titile.replace("&#8221;","");
                        String render = response.body().get(i).getContent().getRendered();
                        /// render = render.replace("--aspect-ratio","aspect-ratio");


                        Model model = new Model( titile,
                                temdetails,
                                response.body().get(i).getEmbedded().getWpFeaturedmedia().get(0).getSourceUrl(),render,RecentModel.IMAGE_TYPE,response.body().get(i).getEmbedded().getAuthor().get(0).getName(),response.body().get(i).getLink());

                        mDatabase.push().setValue(model).addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if(task.isSuccessful()){


                                    progressDialog1.dismiss();
                                }else {

                                    progressDialog1.dismiss();

                                }

                            }
                        });
                    }

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

        }
    }

    public class GetEnglishJson1 extends AsyncTask<Void,Void,Void> {

        ProgressDialog progressDialog;


        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            progressDialog = new ProgressDialog(EnglishLifePost.this);
            progressDialog.setTitle("English For Life Post");
            progressDialog.setMessage("Loading");
            progressDialog.show();



        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
            //  progressDialog.show();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(JavaBaseURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            RetrofitArrayAPI retrofitArrayAPI = retrofit. create(RetrofitArrayAPI.class);

            Call<List<WPPost>> call = retrofitArrayAPI.getEnglishForLife();


            call.enqueue(new Callback<List<WPPost>>() {
                @Override
                public void onResponse(Call<List<WPPost>> call, Response<List<WPPost>> response) {

                    progressDialog1.dismiss();
                    for (int i =0;i<response.body().size(); i++){

                        String temdetails = response.body().get(i).getDate();
                        String titile = response.body().get(i).getTitle().getRendered().toString();
                        titile = titile.replace("&#8211;","");
                        titile = titile.replace("&#x200d;","");
                        titile = titile.replace("&#8230;","");
                        titile = titile.replace("&amp;","");
                        titile = titile.replace("&#8220;","");
                        titile = titile.replace("&#8221;","");
                        String render = response.body().get(i).getContent().getRendered();
                        /// render = render.replace("--aspect-ratio","aspect-ratio");


                        list.add(new RecentModel( titile,
                                temdetails,
                                response.body().get(i).getEmbedded().getWpFeaturedmedia().get(0).getSourceUrl(),render,RecentModel.IMAGE_TYPE,response.body().get(i).getEmbedded().getAuthor().get(0).getName(),response.body().get(i).getLink()));

                    }
                    recentPostAdapter.notifyDataSetChanged();
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


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mDatabase != null){
            mDatabase.removeEventListener(valueEventListener);
            valueEventListener = null;
            //  FirebaseDatabase.getInstance().goOffline();

        }
    }

    private void InitListner(){
        valueEventListener = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {



                list.clear();
                for (DataSnapshot data : dataSnapshot.getChildren()){


                    data.getKey();
                    RecentModel model = data.getValue(RecentModel.class);
                    list.add(model);




                }

                recentPostAdapter = new RecentPostAdapter(list,getApplicationContext());

                angularrecyclerView.setAdapter(recentPostAdapter);
                recentPostAdapter.SetOnItemClickListener(EnglishLifePost.this);


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

                recentPostAdapter = new RecentPostAdapter(list,getApplicationContext());
                new GetEnglishJson1().execute();
                angularrecyclerView.setAdapter(recentPostAdapter);
                recentPostAdapter.SetOnItemClickListener(EnglishLifePost.this);

            }

        };
    }

    @Override
    public void OnItemClick(int index) {
        Intent i = new Intent(this,RecentPostView.class);
        RecentModel model = list.get(index);
        i.putExtra(RENDER_CONTENT,model.render);
        i.putExtra(link,model.link);

        startActivity(i);
    }

    private void updateUI(){
        Intent startIntent = new Intent(EnglishLifePost.this,Login.class);
        startActivity(startIntent);
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.main_menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

        if(item.getItemId() == R.id.main_logout){
            openDialog();

        }
        return true;
    }
    public void openDialog(){

        logoutDialog logoutdialog = new logoutDialog();
        logoutdialog.show(getSupportFragmentManager(),"Logoutdialog");


    }

    public void connectionDialog1(){
        MyDialog1 = new Dialog(EnglishLifePost.this);
        MyDialog1.setContentView(R.layout.customconnectiondialog);
        MyDialog1.setTitle("Error");
        MyDialog1.show();
    }

    private boolean haveNetwork(Context context){
        boolean have_WIFI = false;
        boolean have_MobileData = false;

        ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(CONNECTIVITY_SERVICE);
        // NetworkInfo [] networkInfos = connectivityManager.getAllNetworkInfo();
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
