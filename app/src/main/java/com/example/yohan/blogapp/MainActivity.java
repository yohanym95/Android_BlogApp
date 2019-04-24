package com.example.yohan.blogapp;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private FirebaseAuth mAuth;
    private Toolbar mToolbar;
    private ViewPager mViewPager;
    private SectionPagerAdapater sectionPagerAdapater;
    private TabLayout mTablLayout;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private Dialog MyDialog1;
    int cacheSize = 20 * 1024 * 1024; // 10 MB



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = findViewById(R.id.main_app_bar);
        mTablLayout = findViewById(R.id.main_tabs);
        mViewPager = findViewById(R.id.view_pager);

        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("ReadHub");
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        drawerLayout = findViewById(R.id.drawerlayout);
        navigationView = findViewById(R.id.nav_view);


        navigationView.setNavigationItemSelectedListener(this );
        navigationView.setItemIconTintList(null);



        mAuth = FirebaseAuth.getInstance();

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,mToolbar,
                R.string.navigation_drawer_open,R.string.navigation_drawer_close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        sectionPagerAdapater = new SectionPagerAdapater(getSupportFragmentManager());

        mViewPager.setAdapter(sectionPagerAdapater);
        mTablLayout.setupWithViewPager(mViewPager);
        mViewPager.setOffscreenPageLimit(2);


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

            openDialog();

        }
        return true;
    }

    public void openDialog(){

        logoutDialog logoutdialog = new logoutDialog();
        logoutdialog.show(getSupportFragmentManager(),"Logoutdialog");

    }



    @Override
    public void onBackPressed() {

        Boolean doubleBacktoExitPressedOnce = false;
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else if(mViewPager.getCurrentItem() >0){

            doubleBacktoExitPressedOnce = false;

        }else if(mViewPager.getCurrentItem() == 0) {
            doubleBacktoExitPressedOnce = true;

            if(doubleBacktoExitPressedOnce){
                super.onBackPressed();
            }
        }

        mViewPager.setCurrentItem(0);



    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.nav_facebook:
               // Toast.makeText(getApplicationContext(),"Like us on Facebook",Toast.LENGTH_LONG).show();

                try{
                  Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("fb://page/2660854717474049"));
                  startActivity(i);
                }catch (Exception e){ startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/readhublk")));

                }
                break;
            case R.id.nav_lindin:
               // Toast.makeText(getApplicationContext(),"Like us on Linkedin",Toast.LENGTH_LONG).show();

                    Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/company/readhub/"));
                    startActivity(i1);
                break;
            case R.id.nav_youtube:
                //Toast.makeText(getApplicationContext(),"Like us on Youtube",Toast.LENGTH_LONG).show();
                Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCbEkMN8pKtoV24vrhBrChhA"));
                startActivity(i2);
                break;
            case R.id.nav_twiter:
               // Toast.makeText(getApplicationContext(),"Like us on Youtube",Toast.LENGTH_LONG).show();
                Intent i3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/readhublk"));
                startActivity(i3);
                break;
            case R.id.nav_rate:
                try{
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id="+getPackageName())));
                }
                catch (ActivityNotFoundException e){
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id="+getPackageName())));
                }
                break;
            case R.id.nav_contact:
                Intent i4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://readhub.lk/contact-us/"));
                startActivity(i4);
                break;
            case R.id.nav_about:
               // Toast.makeText(getApplicationContext(),"about us",Toast.LENGTH_LONG).show();
                customMyDialog1();
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    public void customMyDialog1(){
        MyDialog1 = new Dialog(MainActivity.this);
        MyDialog1.setContentView(R.layout.aboutus);
        MyDialog1.setTitle("About Us");
        MyDialog1.show();


    }



}

//
