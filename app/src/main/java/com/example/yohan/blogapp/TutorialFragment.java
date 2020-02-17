package com.example.yohan.blogapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.cardview.widget.CardView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.TextView;


public class TutorialFragment extends Fragment {

    private CardView crdJAVA,crdAngular,crdHTML,crdPHP,crdUnity,crdGIT,crdFiverr,crdLaravel,crdReact,crdLara,crdArduino,crdAndroid,crdXML;
    private TextView crdJAVA1,crdAngular1,crdHTML1,crdPHP1,crdUnity1,crdGIT1,crdFiverr1,crdLaravel1,crdReact1,crdLara1,crdArduino1,crdAndroid1,crdXml1;
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
        View v = inflater.inflate(R.layout.fragment_tutorial, container, false);

        crdJAVA = v.findViewById(R.id.crdJAVA);
        crdAngular = v.findViewById(R.id.crdAngular);
        crdHTML = v.findViewById(R.id.crdHTML);
        crdPHP = v.findViewById(R.id.crdPHP);
        crdUnity = v.findViewById(R.id.crdUnity);
        crdGIT = v.findViewById(R.id.crdGIT);
        crdFiverr = v.findViewById(R.id.crdFiverr);
        crdLaravel = v.findViewById(R.id.crdLaravel);
        crdReact = v.findViewById(R.id.crdreactN);
        crdLara = v.findViewById(R.id.crdLara);
        crdArduino = v.findViewById(R.id.crdArduino);
        crdAndroid = v.findViewById(R.id.crdAndroid);
        crdXML = v.findViewById(R.id.crdxml);


        crdJAVA1 = v.findViewById(R.id.tvJava);
        crdAngular1 = v.findViewById(R.id.tvAngular);
        crdHTML1 = v.findViewById(R.id.tvHTML);
        crdPHP1 = v.findViewById(R.id.tvPHP);
        crdUnity1 = v.findViewById(R.id.tvUnity);
        crdGIT1 = v.findViewById(R.id.tvGit);
        crdFiverr1 = v.findViewById(R.id.tvFiver);
        crdLaravel1 = v.findViewById(R.id.tvLaravel);
        crdReact1 = v.findViewById(R.id.tvReactN);
        crdLara1 = v.findViewById(R.id.tvLara1);
        crdArduino1 = v.findViewById(R.id.tvArduino);
        crdAndroid1 = v.findViewById(R.id.tvAndroid);
        crdXml1 = v.findViewById(R.id.tvxml);

//        GridLayout gridLayout = v.findViewById(R.id.tutorialgrid);
//        gridLayout.setColumnCount(2);
//        gridLayout.setOrientation(GridLayout.VERTICAL);






        crdJAVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getContext(), JavaPost.class);
                startActivity(i);

            }
        });

        crdAngular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(getContext(), AngularPost.class);
                startActivity(i);
            }
        });



        crdHTML.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getContext(), HtmlPost.class);
                startActivity(i);
            }
        });

        crdPHP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getContext(),PHPPost.class);
                startActivity(i);
            }
        });

        crdUnity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getContext(),UnityPost.class);
                startActivity(i);
            }
        });

        crdGIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getContext(),GitPosts.class);
                startActivity(i);
            }
        });



        crdFiverr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),FiverrPost.class);
                startActivity(i);

            }
        });

        crdLaravel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getContext(),LaravelPost.class);
                startActivity(i);
            }
        });

        crdReact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ReactNativePost.class);
                startActivity(i);
            }
        });

        crdLara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),Laravelpost1.class);
                startActivity(i);
            }
        });



        crdArduino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ArduinoPost.class);
                startActivity(i);
            }
        });

        crdAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),AndroidPost.class);
                startActivity(i);
            }
        });

        crdXML.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),XMLPost.class);
                startActivity(i);
            }
        });




        crdJAVA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getContext(), JavaPost.class);
                startActivity(i);

            }
        });

        crdAngular1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(getContext(), AngularPost.class);
                startActivity(i);
            }
        });



        crdHTML1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getContext(), HtmlPost.class);
                startActivity(i);
            }
        });

        crdPHP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getContext(),PHPPost.class);
                startActivity(i);
            }
        });

        crdUnity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getContext(),UnityPost.class);
                startActivity(i);
            }
        });

        crdGIT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getContext(),GitPosts.class);
                startActivity(i);
            }
        });



        crdFiverr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),FiverrPost.class);
                startActivity(i);

            }
        });

        crdLaravel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getContext(),LaravelPost.class);
                startActivity(i);
            }
        });

        crdReact1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ReactNativePost.class);
                startActivity(i);
            }
        });

        crdLara1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),Laravelpost1.class);
                startActivity(i);
            }
        });



        crdArduino1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ArduinoPost.class);
                startActivity(i);
            }
        });

        crdAndroid1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),AndroidPost.class);
                startActivity(i);
            }
        });

        crdXml1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),XMLPost.class);
                startActivity(i);
            }
        });


        return v;
    }






}
