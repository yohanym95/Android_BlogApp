package com.example.yohan.blogapp;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private Toolbar mToolbar;
    private ViewPager mViewPager;
    private SectionPagerAdapater sectionPagerAdapater;
    private TabLayout mTablLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = findViewById(R.id.main_app_bar);
        mTablLayout = findViewById(R.id.main_tabs);
        mViewPager = findViewById(R.id.view_pager);

        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("ReadHub");

        mAuth = FirebaseAuth.getInstance();

        sectionPagerAdapater = new SectionPagerAdapater(getSupportFragmentManager());

        mViewPager.setAdapter(sectionPagerAdapater);
        mTablLayout.setupWithViewPager(mViewPager);

    }

    @Override
    protected void onStart() {
        super.onStart();

        FirebaseUser user = mAuth.getCurrentUser();

        if(user == null){
            updateUI();
        }
    }

    private void updateUI(){
        Intent startIntent = new Intent(MainActivity.this,Login.class);
        startActivity(startIntent);
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
         super.onCreateOptionsMenu(menu);
         getMenuInflater().inflate(R.menu.main_menu,menu);

         return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

        if(item.getItemId() == R.id.main_logout){
            FirebaseAuth.getInstance().signOut();;
            updateUI();
        }
        return true;
    }
}
