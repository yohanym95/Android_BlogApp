package com.example.yohan.blogapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.cardview.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class OtherFragment extends Fragment {



    private CardView crdMovies,crdGames,crdSport,crdAnimation,crdTechEnglish,crdTechSinhala,crcTechTamil,crdTechnology,crdOthers,crdKibuli;
    private TextView crdMovies1,crdGames1,crdSport1,crdAnimation1,crdTechEnglish1,crdTechSinhala1,crcTechTamil1,crdTechnology1,crdOthers1,crdKibuli1;
    sharedPref sharedPreferences;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        sharedPreferences = new sharedPref(getContext());
        if (sharedPreferences.loadNightModeState() == true){
            getContext().setTheme(R.style.darkTheme);
        }else
            getContext().setTheme(R.style.AppTheme);

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_other, container, false);

        crdMovies = v.findViewById(R.id.crdMovies);
        crdGames = v.findViewById(R.id.crdGames);
        crdSport = v.findViewById(R.id.crdSports);
        crdAnimation = v.findViewById(R.id.crdAnimation);

        crdTechSinhala = v.findViewById(R.id.crdtechNewsSinhala);
        crcTechTamil = v.findViewById(R.id.crdtechNewsTamil);

        crdOthers = v.findViewById(R.id.crdPOther);
        crdKibuli = v.findViewById(R.id.crdKibuli);

        crdMovies1 = v.findViewById(R.id.tvmovies);
        crdGames1 = v.findViewById(R.id.tvGames);
        crdSport1 = v.findViewById(R.id.tvSports);
        crdAnimation1 = v.findViewById(R.id.tvAnimation);

        crdTechSinhala1 = v.findViewById(R.id.tvTechSinhala);
        crcTechTamil1 = v.findViewById(R.id.tvTechTamil);

        crdOthers1 = v.findViewById(R.id.tvOthers);
        crdKibuli1 = v.findViewById(R.id.tvKibuli);


        crdMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),MoviesPost.class);
                startActivity(i);
            }
        });

        crdAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),AnimationPost.class);
                startActivity(i);
            }
        });

        crdGames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),GamesPost.class);
                startActivity(i);
            }
        });

        crdSport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),SportPost.class);
                startActivity(i);
            }
        });



        crcTechTamil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),TechTamilPost.class);
                startActivity(i);
            }
        });

        crdTechSinhala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),TechSinhalPost.class);
                startActivity(i);
            }
        });



        crdKibuli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),KibuliPost.class);
                startActivity(i);
            }
        });

        crdOthers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),OtherPost.class);
                startActivity(i);
            }
        });

        crdMovies1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),MoviesPost.class);
                startActivity(i);
            }
        });

        crdAnimation1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),AnimationPost.class);
                startActivity(i);
            }
        });

        crdGames1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),GamesPost.class);
                startActivity(i);
            }
        });

        crdSport1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),SportPost.class);
                startActivity(i);
            }
        });

        crcTechTamil1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),TechTamilPost.class);
                startActivity(i);
            }
        });

        crdTechSinhala1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),TechSinhalPost.class);
                startActivity(i);
            }
        });


        crdKibuli1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),KibuliPost.class);
                startActivity(i);
            }
        });

        crdOthers1 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),OtherPost.class);
                startActivity(i);
            }
        });


        return v;
    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }




}
