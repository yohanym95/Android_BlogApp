package com.example.yohan.blogapp;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class SectionPagerAdapater extends FragmentPagerAdapter {


    public SectionPagerAdapater(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch(position){
            case 0 :
                RecentFragment recentFragment = new RecentFragment();
                return recentFragment;

            case 1 :
                TutorialFragment tutorialFragment = new TutorialFragment();
                return tutorialFragment;
            case 2 :
                OtherFragment otherFragment = new OtherFragment();
                return otherFragment;
            default :
                return null;
        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "RECENT";
            case 1:
                return "TUTORIALS";
            case 2:
                return "OTHERS";
            default:
                return null;
        }
    }


}
