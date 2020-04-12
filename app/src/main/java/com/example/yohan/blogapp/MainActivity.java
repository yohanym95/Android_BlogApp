package com.example.yohan.blogapp;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.widget.PopupMenu;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Adapter;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;

import java.util.List;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private FirebaseAuth mAuth;
    private Toolbar mToolbar,mToolbar1;
    private ViewPager mViewPager;
    private SectionPagerAdapater sectionPagerAdapater;
    private TabLayout mTablLayout;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private Dialog MyDialog1;
    int cacheSize = 20 * 1024 * 1024; // 10 MB
    private EngSectionPagerAdapter engSectionPagerAdapter;
    PagerAdapter adapter;
    boolean boolAdap;
    FragmentManager manager;
    boolean mode;
    sharedPref sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        sharedPreferences = new sharedPref(this);
        if (sharedPreferences.loadNightModeState() == true){
            setTheme(R.style.darkTheme);
        }else
            setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = findViewById(R.id.main_app_bar);
        mToolbar1 = findViewById(R.id.engmain_app_bar);

//        setSupportActionBar(mToolbar);
//        getSupportActionBar().setTitle("ReadHub");
//        getSupportActionBar().setDisplayShowCustomEnabled(true);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent intent = new Intent();

        String manufacturer = android.os.Build.MANUFACTURER;

        switch (manufacturer) {

            case "xiaomi":
                intent.setComponent(new ComponentName("com.miui.securitycenter",
                        "com.miui.permcenter.autostart.AutoStartManagementActivity"));
                break;
            case "oppo":
                intent.setComponent(new ComponentName("com.coloros.safecenter",
                        "com.coloros.safecenter.permission.startup.StartupAppListActivity"));

                break;
            case "vivo":
                intent.setComponent(new ComponentName("com.vivo.permissionmanager",
                        "com.vivo.permissionmanager.activity.BgStartUpManagerActivity"));
                break;
            case "huawei":
                intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.optimize.process.ProtectActivity"));
                break;
        }

        List<ResolveInfo> arrayList =  getPackageManager().queryIntentActivities(intent,
                PackageManager.MATCH_DEFAULT_ONLY);

        if (arrayList.size() > 0) {
            startActivity(intent);
        }




        selectLanguage1(boolAdap);

        FirebaseInstanceId.getInstance().getInstanceId().addOnSuccessListener(MainActivity.this,new OnSuccessListener<InstanceIdResult>() {
            @Override
            public void onSuccess(InstanceIdResult instanceIdResult) {
                String newToken = instanceIdResult.getToken();
               FirebaseDatabase.getInstance().getReference("fcm-token").child(newToken).child("token").setValue(newToken).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful()){


                           // progressDialog1.dismiss();
                        }else {

                           // progressDialog1.dismiss();

                        }

                    }
                });
            }
        });


    }



    public void selectLanguage1(boolean bool){
        if(bool){
            setSupportActionBar(mToolbar);
            getSupportActionBar().setTitle("ReadHub");
            getSupportActionBar().setDisplayShowCustomEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
           // final PopupMenu popupMenu = new PopupMenu(getBaseContext())

            drawerLayout = findViewById(R.id.drawerlayout);
            navigationView = findViewById(R.id.nav_view);


            navigationView.setNavigationItemSelectedListener(this );
            navigationView.setItemIconTintList(null);
           // navigationView.getMenu().getItem(R.id.nav_Mode).setTitle("Light Mode");
            if (sharedPreferences.loadNightModeState() == true){
                navigationView.getMenu().findItem(R.id.nav_Mode).setTitle("Light Mode");
            }else
                navigationView.getMenu().findItem(R.id.nav_Mode).setTitle("Night Mode");




            mAuth = FirebaseAuth.getInstance();

            ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,mToolbar,
                    R.string.navigation_drawer_open,R.string.navigation_drawer_close);

            drawerLayout.addDrawerListener(toggle);
            toggle.syncState();

            manager = this.getSupportFragmentManager();
            manager.beginTransaction()
                    .show(manager.findFragmentById(R.id.fragsinhala))
                    .hide(manager.findFragmentById(R.id.frageng))
                    .commit();
        }else{

            setSupportActionBar(mToolbar1);
            getSupportActionBar().setTitle("ReadHub");
            getSupportActionBar().setDisplayShowCustomEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            drawerLayout = findViewById(R.id.drawerlayout);
            navigationView = findViewById(R.id.nav_view);


            navigationView.setNavigationItemSelectedListener(this );
            navigationView.setItemIconTintList(null);

            if (sharedPreferences.loadNightModeState() == true){
                navigationView.getMenu().findItem(R.id.nav_Mode).setTitle("Light Mode");
            }else
                navigationView.getMenu().findItem(R.id.nav_Mode).setTitle("Night Mode");


            mAuth = FirebaseAuth.getInstance();

            ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,mToolbar1,
                    R.string.navigation_drawer_open,R.string.navigation_drawer_close);

            drawerLayout.addDrawerListener(toggle);
            toggle.syncState();

            manager = this.getSupportFragmentManager();
            manager.beginTransaction()
                    .show(manager.findFragmentById(R.id.frageng))
                    .hide(manager.findFragmentById(R.id.fragsinhala))
                    .commit();
        }

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
    protected void onDestroy() {
        super.onDestroy();
        //FirebaseDatabase.getInstance().goOffline();
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
               // FirebaseDatabase.getInstance().goOffline();
              //  finish();
            }
        }

        mViewPager.setCurrentItem(0);



    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.nav_english:
                selectLanguage1(false);
               // throw new RuntimeException("Test Crash");
                break;
            case R.id.nav_sinhala:
                selectLanguage1(true);
                break;
            case R.id.nav_Mode :
                //menuItem.setTitle("Light Mode");
                if(sharedPreferences.loadNightModeState() == true){
                  //  menuItem.setTitle("Dark Mode");
                    sharedPreferences.setNightModeState(false);
                    restartApp();
                }else{
                   // menuItem.setTitle("Light Mode");
                    sharedPreferences.setNightModeState(true);
                    restartApp();
                }
                break;
            case  R.id.coronaMode:
                Intent corona = new Intent(getApplicationContext(),CoronaUpdate.class);
                startActivity(corona);
                break;
            case R.id.nav_facebook:
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

    public void restartApp(){
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
        finish();
    }



}

//
