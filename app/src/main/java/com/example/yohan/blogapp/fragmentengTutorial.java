package com.example.yohan.blogapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class fragmentengTutorial extends Fragment {
    private CardView crdKotlin,crdNetworking,crdPython,crdCloud,crdGit,crdJavascript,crdFlutter,crdML;
    private TextView crdKotlin1,crdNetworking1,crdPython1,crdCloud1,crdGit1,crdJavascript1,crdFlutter1,crdML1;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragmenteng_tutorial,container,false);


        crdKotlin = v.findViewById(R.id.crdKotlin);
        crdNetworking = v.findViewById(R.id.crdNetwork);
        crdPython = v.findViewById(R.id.crdPython);
        crdCloud = v.findViewById(R.id.crdCloudComputing);
        crdGit = v.findViewById(R.id.crdGit1);
        crdJavascript = v.findViewById(R.id.crdcrdJavascript);
        crdFlutter = v.findViewById(R.id.crdFlutter);
        crdML = v.findViewById(R.id.crdML);


        crdKotlin1 = v.findViewById(R.id.tvKotlin);
        crdNetworking1 = v.findViewById(R.id.tvNetwork);
        crdPython1 = v.findViewById(R.id.tvPython);
        crdCloud1 = v.findViewById(R.id.tvCloud);
        crdGit1 = v.findViewById(R.id.tvGit1);
        crdJavascript1 = v.findViewById(R.id.tvJavaScript);
        crdFlutter1 = v.findViewById(R.id.tvFlutter);
        crdML1 = v.findViewById(R.id.tvML);

        crdKotlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getContext(), KotlinPost.class);
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

        crdPython.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),PythonPost.class);
                startActivity(i);
            }
        });

        crdCloud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getContext(), CloudPost.class);
                startActivity(i);
            }
        });

        crdGit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getContext(),GitEngPost.class);
                startActivity(i);
            }
        });

        crdJavascript.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),JavascriptPost.class);
                startActivity(i);
            }
        });
        crdFlutter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),FlutterPost.class);
                startActivity(i);
            }
        });
        crdML.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(),MLPost.class);
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

        crdNetworking1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getContext(),NetworkingPost.class);
                startActivity(i);
            }
        });

        crdPython1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),PythonPost.class);
                startActivity(i);
            }
        });

        crdCloud1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getContext(), CloudPost.class);
                startActivity(i);
            }
        });

        crdGit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getContext(),GitEngPost.class);
                startActivity(i);
            }
        });

        crdJavascript1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),JavascriptPost.class);
                startActivity(i);
            }
        });
        crdFlutter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),FlutterPost.class);
                startActivity(i);
            }
        });
        crdML1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(),MLPost.class);
                startActivity(i);
            }
        });

        return v;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
