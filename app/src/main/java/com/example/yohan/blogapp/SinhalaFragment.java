package com.example.yohan.blogapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;


public class SinhalaFragment extends Fragment {

    private ViewPager mViewPager;
    private SectionPagerAdapater sectionPagerAdapater;
    private EngSectionPagerAdapter engSectionPagerAdapter;
    View view;
    private TabLayout mTablLayout;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_sinhala,container,false);

        return  view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        sectionPagerAdapater = new SectionPagerAdapater(getFragmentManager());
        engSectionPagerAdapter = new EngSectionPagerAdapter(getFragmentManager());
        mViewPager = view.findViewById(R.id.Sinhalaview_pager);
        mTablLayout = view.findViewById(R.id.main_tabs);

        mViewPager.setAdapter(sectionPagerAdapater);
        mTablLayout.setupWithViewPager(mViewPager);
        mViewPager.setOffscreenPageLimit(2);

    }

}
