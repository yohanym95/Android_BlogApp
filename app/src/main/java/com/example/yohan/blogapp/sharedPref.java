package com.example.yohan.blogapp;

import android.content.Context;
import android.content.SharedPreferences;

public class sharedPref {
    SharedPreferences mySharedPref;

    public sharedPref(Context context){
        mySharedPref = context.getSharedPreferences("filename",Context.MODE_PRIVATE);

    }

    //this method will save the nightMode state : True or False
    public void setNightModeState(Boolean state){
        SharedPreferences.Editor editor = mySharedPref.edit();
        editor.putBoolean("NightMode",state);
        editor.commit();
    }

    //this method will load the Night Mode State
    public Boolean loadNightModeState(){
        Boolean state = mySharedPref.getBoolean("NightMode",false);
        return state;
    }
}
