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
import android.widget.TextView;


public class TutorialFragment extends Fragment {

    private CardView crdJAVA,crdAngular,crdKotlin,crdHTML,crdPHP,crdUnity,crdGIT,crdNetworking,crdFiverr,crdLaravel;
    private TextView crdJAVA1,crdAngular1,crdKotlin1,crdHTML1,crdPHP1,crdUnity1,crdGIT1,crdNetworking1,crdFiverr1,crdLaravel1;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_tutorial, container, false);

        crdJAVA = v.findViewById(R.id.crdJAVA);
        crdAngular = v.findViewById(R.id.crdAngular);
        crdKotlin = v.findViewById(R.id.crdKotlin);
        crdHTML = v.findViewById(R.id.crdHTML);
        crdPHP = v.findViewById(R.id.crdPHP);
        crdUnity = v.findViewById(R.id.crdUnity);
        crdGIT = v.findViewById(R.id.crdGIT);
        crdNetworking = v.findViewById(R.id.crdNetwork);
        crdFiverr = v.findViewById(R.id.crdFiverr);
        crdLaravel = v.findViewById(R.id.crdLaravel);

        crdJAVA1 = v.findViewById(R.id.tvJava);
        crdAngular1 = v.findViewById(R.id.tvAngular);
        crdKotlin1 = v.findViewById(R.id.tvKotlin);
        crdHTML1 = v.findViewById(R.id.tvHTML);
        crdPHP1 = v.findViewById(R.id.tvPHP);
        crdUnity1 = v.findViewById(R.id.tvUnity);
        crdGIT1 = v.findViewById(R.id.tvGit);
        crdNetworking1 = v.findViewById(R.id.tvNetwork);
        crdFiverr1 = v.findViewById(R.id.tvFiver);
        crdLaravel1 = v.findViewById(R.id.tvLaravel);




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

        crdKotlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getContext(), KotlinPost.class);
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

        crdNetworking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getContext(),NetworkingPost.class);
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

        crdKotlin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getContext(), KotlinPost.class);
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

        crdNetworking1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getContext(),NetworkingPost.class);
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

        return v;
    }






}
