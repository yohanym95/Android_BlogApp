package com.example.yohan.blogapp;

import android.content.Context;
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
