package com.example.yohan.blogapp;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class EngSectionPagerAdapter extends FragmentPagerAdapter {
    public EngSectionPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                fragmentengRecent recent = new fragmentengRecent();
                return recent;
            case 1:
                fragmentengTutorial tutorial = new fragmentengTutorial();
                return tutorial;
            case 2:
                fragmentengOther other = new fragmentengOther();
                return other;
            default:
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
