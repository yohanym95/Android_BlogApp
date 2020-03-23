package com.example.yohan.blogapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CoronaUpdate extends AppCompatActivity {

    private String CoronaBaseURL = "https://hpb.health.gov.lk/";
    private TextView textSlTotalCase,textSlTotalRecovered,textSlTotalDeath,updateDate,textCases,textDeaths,textRecovered,totalHospital,textnewCase,textnewDeaths,newCase,newDeaths;
    ProgressDialog progressDialog1;
    private Toolbar mToolbar;
    private RecyclerView coronaRecyleView,coronaPreventRecycleView,coronaHospitalRecycleView;
    private LinearLayoutManager linearLayoutManager,linearLayoutManager1,linearLayoutManager2;
    private ArrayList<coronaModel> list;
    private ArrayList<coronaModel> list1;
    private ArrayList<CoronaListModel> coronalist;
    private CoronaImageAdapter coronaImageAdapter,coronaImageAdapter1;
    private CoronaAdapter coronaAdapter;
    String totalLocalCase,totalLocalDeaths,totalLocalRecovered,totalGlobalCase,totalGlobalDeaths,totalGlobalRecovered,newLocalCase,newGlobalCases,newGlobalDeaths,newLocalDeaths;
    int localDeaths,globalDeaths;
    private Switch simpleSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corona_update);

        textSlTotalCase = findViewById(R.id.totalCases);
        textSlTotalRecovered = findViewById(R.id.totalRecovered);
        textSlTotalDeath = findViewById(R.id.totalDeaths);
        textCases = findViewById(R.id.textCase);
        textDeaths = findViewById(R.id.textDeaths);
        textRecovered = findViewById(R.id.textRecovered);
        updateDate = findViewById(R.id.updateDate);
        totalHospital = findViewById(R.id.totalNumberHospital);

        textnewCase = findViewById(R.id.newtextCase);
        textnewDeaths = findViewById(R.id.newtextDeaths);
        newCase = findViewById(R.id.newtotalCases);
        newDeaths = findViewById(R.id.newtotalDeaths);

        textCases.setText("Total Local Cases");
        textDeaths.setText("Total Local Deaths");
        textRecovered.setText("Total Local Recovered");
        textnewCase.setText("New Cases");
        textnewDeaths.setVisibility(View.INVISIBLE);
      //  textnewDeaths.setText("New Deaths");

        mToolbar = findViewById(R.id.Coronapost_app_bar);
        // swipeRefreshLayout = findViewById(R.id.angularSwipe);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("COVID-19");
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        simpleSwitch =  findViewById(R.id.simpleSwitch); // initiate Switch

        simpleSwitch.setTextOn("Local"); // displayed text of the Switch whenever it is in checked or on state
        simpleSwitch.setTextOff("Global");
//        progressDialog1.dismiss();

        simpleSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    textCases.setText("Total Local Cases");
                    textDeaths.setText("Total Local Deaths");
                    textRecovered.setText("Total Local Recovered");
                    textSlTotalCase.setText(totalLocalCase);
                    textSlTotalDeath.setText(totalLocalDeaths);
                    textSlTotalRecovered.setText(totalLocalRecovered);
                    newCase.setText(newLocalCase);
                    totalHospital.setVisibility(View.VISIBLE);
                    textnewDeaths.setVisibility(View.INVISIBLE);
                    newDeaths.setVisibility(View.INVISIBLE);
                    if(localDeaths > 0){
                        newLocalDeaths = ""+localDeaths;
                        textnewDeaths.setVisibility(View.VISIBLE);
                        textnewDeaths.setText("New Deaths");
                        newDeaths.setVisibility(View.VISIBLE);
                        newDeaths.setText(newLocalDeaths);

                    }

                }else{
                    textCases.setText("Total Global Cases");
                    textDeaths.setText("Total Global Deaths");
                    textRecovered.setText("Total Global Recovered");
                    textSlTotalCase.setText(totalGlobalCase);
                    textSlTotalDeath.setText(totalGlobalDeaths);
                    textSlTotalRecovered.setText(totalGlobalRecovered);
                    newCase.setText(newGlobalCases);
                    totalHospital.setVisibility(View.INVISIBLE);
                    textnewDeaths.setText("New Deaths");
                    textnewDeaths.setVisibility(View.VISIBLE);
                    newDeaths.setVisibility(View.VISIBLE);
                    newGlobalDeaths = globalDeaths+"";
                    newDeaths.setText(newGlobalDeaths);
                }
            }
        });



        list = new ArrayList<coronaModel>();
        list.add(new coronaModel("Fever",R.mipmap.fever_foreground));
        list.add(new coronaModel("Cough and Sneezes",R.mipmap.cough_foreground));
        list.add(new coronaModel("Sore throat",R.mipmap.sore_foreground));
        list.add(new coronaModel("Sneezing and runny nose",R.mipmap.sneezing_foreground));
        list.add(new coronaModel("Difficulty in Breathing",R.mipmap.breathing_foreground));

        list1 = new ArrayList<coronaModel>();
        list1.add(new coronaModel("Wash your hands often",R.mipmap.wash_foreground));
        list1.add(new coronaModel("Cover your cough and sneeze using elbow",R.mipmap.usingelbow_foreground));
        list1.add(new coronaModel("Cover your cough and sneeze using a tissue and dispose tissue properly",R.mipmap.usingtissue_foreground));
        list1.add(new coronaModel("Avoid crowded places",R.mipmap.crowd));

        coronalist = new ArrayList<>();


        coronaRecyleView = findViewById(R.id.corona_recycleview);
        coronaPreventRecycleView = findViewById(R.id.coronaPrevent_recycleview);
        coronaHospitalRecycleView = findViewById(R.id.coronaHospital_recycleview);

        coronaImageAdapter = new CoronaImageAdapter(list,getApplicationContext());
        coronaImageAdapter1 = new CoronaImageAdapter(list1,getApplicationContext());
        //

        linearLayoutManager = new LinearLayoutManager(CoronaUpdate.this,LinearLayoutManager.HORIZONTAL,false);
        linearLayoutManager1 = new LinearLayoutManager(CoronaUpdate.this,LinearLayoutManager.HORIZONTAL,false);
        linearLayoutManager2 = new LinearLayoutManager(CoronaUpdate.this,LinearLayoutManager.VERTICAL,false);


        coronaRecyleView.setLayoutManager(linearLayoutManager);
        coronaRecyleView.setHasFixedSize(true);
        coronaRecyleView.setAdapter(coronaImageAdapter);

        coronaPreventRecycleView.setLayoutManager(linearLayoutManager1);
        coronaPreventRecycleView.setHasFixedSize(true);
        coronaPreventRecycleView.setAdapter(coronaImageAdapter1);


        coronaHospitalRecycleView.setLayoutManager(linearLayoutManager2);
        coronaHospitalRecycleView.setHasFixedSize(true);

        //


        progressDialog1 = new ProgressDialog(CoronaUpdate.this);
        progressDialog1.setTitle("COVID-19 Live Update");
        progressDialog1.setMessage("Loading");
        progressDialog1.show();

        new GetCoronaUpdate().execute();




    }


    public class GetCoronaUpdate extends AsyncTask<Void,Void,Void> {

       // ProgressDialog progressDialog;


        @Override
        protected void onPreExecute() {
            super.onPreExecute();

//            progressDialog = new ProgressDialog(CoronaUpdate.this);
//            progressDialog.setTitle("Covid-19 Live Update");
//            progressDialog.setMessage("Loading");
//            progressDialog.show();



        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
            //  progressDialog.show();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(CoronaBaseURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            RetrofitArrayAPI retrofitArrayAPI = retrofit. create(RetrofitArrayAPI.class);

            Call<CoronaPost> call = retrofitArrayAPI.getNewsCorona();


            call.enqueue(new Callback<CoronaPost>() {
                @Override
                public void onResponse(Call<CoronaPost> call, Response<CoronaPost> response) {
                    //final

                    progressDialog1.dismiss();

                    totalLocalCase = response.body().getData().getLocalTotalCases().toString();
                    totalLocalDeaths = response.body().getData().getLocalDeaths().toString();
                    totalLocalRecovered = response.body().getData().getLocalRecovered().toString();
                    totalGlobalCase = response.body().getData().getGlobalTotalCases().toString();
                    totalGlobalDeaths = response.body().getData().getGlobalDeaths().toString();
                    totalGlobalRecovered = response.body().getData().getGlobalRecovered().toString();
                    newLocalCase = response.body().getData().getLocalNewCases().toString();
                    localDeaths  = response.body().getData().getLocalNewDeaths();
                    newGlobalCases = response.body().getData().getGlobalNewCases().toString();
                    globalDeaths = response.body().getData().getGlobalNewDeaths();
                  //  newGlobalDeaths = response.body().getData().getGlobalNewDeaths().toString();
                    updateDate.setText("Last Update Time : "+response.body().getData().getUpdateDateTime().toString());
                    totalHospital.setText("Total Number of Individuals in Local Hospital : "+response.body().getData().getLocalTotalNumberOfIndividualsInHospitals().toString());
                    int length = response.body().getData().getHospitalData().size();

                    textSlTotalCase.setText(totalLocalCase);
                    textSlTotalDeath.setText(totalLocalDeaths);
                    textSlTotalRecovered.setText(totalLocalRecovered);
                    newCase.setText(newLocalCase);

                    if(localDeaths >0){
                        newLocalDeaths = ""+localDeaths;
                        textnewDeaths.setText("New Deaths");
                        textnewDeaths.setVisibility(View.VISIBLE);
                        newDeaths.setText(newLocalDeaths);

                    }



                    for(int i=0; i<length;i++){
                       // String title = response.body().getData().getHospitalData().get(i).getHospital().getName();
                      //  String treatCount =response.body().getData().getHospitalData().get(i).getTreatmentTotal().toString();
                       // String treatLocal =response.body().getData().getHospitalData().get(i).getTreatmentLocal().toString();
                   //     String treatForiegn =response.body().getData().getHospitalData().get(i).getTreatmentForeign().toString();

                        coronalist.add(new CoronaListModel(response.body().getData().getHospitalData().get(i).getHospital().getName().toString(),response.body().getData().getHospitalData().get(i).getTreatmentTotal().toString(),response.body().getData().getHospitalData().get(i).getTreatmentLocal().toString(),response.body().getData().getHospitalData().get(i).getTreatmentForeign().toString()));
                    }

                    coronaAdapter = new CoronaAdapter(coronalist,getApplicationContext());
                    coronaHospitalRecycleView.setAdapter(coronaAdapter);
                    coronaAdapter.notifyDataSetChanged();
                }

                @Override
                public void onFailure(Call<CoronaPost> call, Throwable t) {

                }
            });

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
           // progressDialog.dismiss();
        }
    }
}


