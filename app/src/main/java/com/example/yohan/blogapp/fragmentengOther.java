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


public class fragmentengOther extends Fragment {

    private CardView crdlaw,crdDevices,crdTechNews,crdEnglishLife;
    private TextView crdlaw1,crdDevices1,crdTechNews1,crdEnglishLife1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View v = inflater.inflate(R.layout.fragment_fragmenteng_other,container,false);

        crdlaw = v.findViewById(R.id.crdLawBasics);
        crdDevices = v.findViewById(R.id.crdDevices);
        crdTechNews = v.findViewById(R.id.crdTechNews);
        crdEnglishLife = v.findViewById(R.id.crdEnglishForLife);

        crdlaw1 = v.findViewById(R.id.tvLawBasics);
        crdDevices1 = v.findViewById(R.id.tvDevices);
        crdTechNews1 = v.findViewById(R.id.tvTechNews);
        crdEnglishLife1 = v.findViewById(R.id.tvEnglishForLife);

        crdlaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),LawBasicPost.class);
                startActivity(i);
            }
        });
        crdDevices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),EngDevicePost.class);
                startActivity(i);
            }
        });
        crdTechNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),TechEnglishPost.class);
                startActivity(i);
            }
        });

        crdEnglishLife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getContext(),EnglishLifePost.class);
                startActivity(i);
            }
        });

        crdlaw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),LawBasicPost.class);
                startActivity(i);
            }
        });
        crdDevices1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),EngDevicePost.class);
                startActivity(i);
            }
        });
        crdTechNews1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),TechEnglishPost.class);
                startActivity(i);
            }
        });

        crdEnglishLife1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(),EnglishLifePost.class);
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
