package com.example.yohan.blogapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class OtherFragment extends Fragment {



    private CardView crdMovies,crdGames,crdSport,crdAnimation,crdTechEnglish,crdTechSinhala,crcTechTamil,crdTechnology,crdOthers,crdKibuli;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_other, container, false);

        crdMovies = v.findViewById(R.id.crdMovies);
        crdGames = v.findViewById(R.id.crdGames);
        crdSport = v.findViewById(R.id.crdSports);
        crdAnimation = v.findViewById(R.id.crdAnimation);
        crdTechEnglish = v.findViewById(R.id.crdtechNewsEnglish);
        crdTechSinhala = v.findViewById(R.id.crdtechNewsSinhala);
        crcTechTamil = v.findViewById(R.id.crdtechNewsTamil);
        crdTechnology = v.findViewById(R.id.crdtechnology);
        crdOthers = v.findViewById(R.id.crdPOther);
        crdKibuli = v.findViewById(R.id.crdKibuli);


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

        crdTechEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getContext(),TechEnglishPost.class);
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

        crdTechnology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),TechnologyPost.class);
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
