package com.example.yohan.blogapp;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.util.Base64;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class RecentPostView extends AppCompatActivity {

  private WebView recentpostWebView;
  private TextView textView;
  String ShareLink;
  private Toolbar mToolbar;
  sharedPref sharedPreferences;
  AdView bannerAdView2;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    sharedPreferences = new sharedPref(this);
    if (sharedPreferences.loadNightModeState() == true){
      setTheme(R.style.darkTheme);
    }else
      setTheme(R.style.AppTheme);
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_recent_post_view);

    mToolbar = findViewById(R.id.WebViewpost_app_bar);
    bannerAdView2 = findViewById(R.id.banneradView2);

    AdRequest adRequest = new AdRequest.Builder().build();
    bannerAdView2.loadAd(adRequest);
    bannerAdView2.setAdListener(new AdListener(){
      @Override
      public void onAdFailedToLoad(int i) {
        super.onAdFailedToLoad(i);
        bannerAdView2.setVisibility(View.GONE);
        // onAdLoaded();

      }



      @Override
      public void onAdLoaded() {
        super.onAdLoaded();
        bannerAdView2.setVisibility(View.VISIBLE);

      }
    });


    // swipeRefreshLayout = findViewById(R.id.angularSwipe);
    setSupportActionBar(mToolbar);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    getSupportActionBar().setDisplayShowHomeEnabled(true);
    getSupportActionBar().setTitle("ReadHub");
    mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        onBackPressed();
      }
    });

    recentpostWebView = findViewById(R.id.recent_postwebview);
//    recentpostWebView.setBackgroundColor(R.attr.navmenucolor);

    //textView = findViewById(R.id.webtitle);

    Intent i = getIntent();


    String renderContent = i.getStringExtra(RecentFragment.RENDER_CONTENT);
    String link = i.getStringExtra(RecentFragment.link);
    // String renderContentt = i.getStringExtra(RecentFragment.);

    String renderContent1 = i.getStringExtra(JavaPost.RENDER_CONTENT);
    String link1 = i.getStringExtra(JavaPost.link);
    String renderContent2 = i.getStringExtra(AngularPost.RENDER_CONTENT);
    String link2 = i.getStringExtra(AngularPost.link);
    // String renderContentt2 = i.getStringExtra(AngularPost.title);
    String renderContent3 = i.getStringExtra(FiverrPost.RENDER_CONTENT);
    String link3 = i.getStringExtra(FiverrPost.link);
    String renderContent4 = i.getStringExtra(GitPosts.RENDER_CONTENT);
    String link4 = i.getStringExtra(GitPosts.link);
    String renderContent5 = i.getStringExtra(HtmlPost.RENDER_CONTENT);
    String link5 = i.getStringExtra(HtmlPost.link);
    String renderContent6 = i.getStringExtra(KotlinPost.RENDER_CONTENT);
    String link6 = i.getStringExtra(KotlinPost.link);
    String renderContent7 = i.getStringExtra(LaravelPost.RENDER_CONTENT);
    String link7 = i.getStringExtra(LaravelPost.link);
    String renderContent8 = i.getStringExtra(NetworkingPost.RENDER_CONTENT);
    String link8 = i.getStringExtra(NetworkingPost.link);
    String renderContent9 = i.getStringExtra(PHPPost.RENDER_CONTENT);
    String link9 = i.getStringExtra(PHPPost.link);
    String renderContent10 = i.getStringExtra(UnityPost.RENDER_CONTENT);
    String link10 = i.getStringExtra(UnityPost.link);
    String renderContent11 = i.getStringExtra(MoviesPost.RENDER_CONTENT);
    String link11 = i.getStringExtra(MoviesPost.link);
    String renderContent12 = i.getStringExtra(AnimationPost.RENDER_CONTENT);
    String link12 = i.getStringExtra(AnimationPost.link);
    String renderContent13 = i.getStringExtra(GamesPost.RENDER_CONTENT);
    String link13 = i.getStringExtra(GamesPost.link);
    String renderContent14 = i.getStringExtra(SportPost.RENDER_CONTENT);
    String link14 = i.getStringExtra(SportPost.link);
    String renderContent15 = i.getStringExtra(TechEnglishPost.RENDER_CONTENT);
    String link15 = i.getStringExtra(TechEnglishPost.link);
    String renderContent16 = i.getStringExtra(TechTamilPost.RENDER_CONTENT);
    String link16 = i.getStringExtra(TechTamilPost.link);
    String renderContent17 =i.getStringExtra(TechSinhalPost.RENDER_CONTENT);
    String link17 = i.getStringExtra(TechSinhalPost.link);
    String renderContent18 =i.getStringExtra(TechnologyPost.RENDER_CONTENT);
    String link18 = i.getStringExtra(TechnologyPost.link);
    String renderContent19 =i.getStringExtra(KibuliPost.RENDER_CONTENT);
    String link19 = i.getStringExtra(KibuliPost.link);
    String renderContent20 =i.getStringExtra(OtherPost.RENDER_CONTENT);
    String link20 = i.getStringExtra(OtherPost.link);
    String renderContent21 = i.getStringExtra(ReactNativePost.RENDER_CONTENT);
    String link21 = i.getStringExtra(ReactNativePost.link);
    String renderContent22 = i.getStringExtra(Laravelpost1.RENDER_CONTENT);
    String link22 = i.getStringExtra(Laravelpost1.link);
    String renderContent23 = i.getStringExtra(PythonPost.RENDER_CONTENT);
    String link23 = i.getStringExtra(PythonPost.link);
    String renderContent24 = i.getStringExtra(ArduinoPost.RENDER_CONTENT);
    String link24 = i.getStringExtra(ArduinoPost.link);
    String renderContent25 = i.getStringExtra(JavascriptPost.RENDER_CONTENT);
    String link25 = i.getStringExtra(JavascriptPost.link);
    String renderContent26 = i.getStringExtra(LawBasicPost.RENDER_CONTENT);
    String link26 = i.getStringExtra(LawBasicPost.link);
    String renderContent27 = i.getStringExtra(fragmentengRecent.RENDER_CONTENT);
    String link27 = i.getStringExtra(fragmentengRecent.link);
    String renderContent28 = i.getStringExtra(CloudPost.RENDER_CONTENT);
    String link28 = i.getStringExtra(CloudPost.link);
    String renderContent29 = i.getStringExtra(GitEngPost.RENDER_CONTENT);
    String link29 = i.getStringExtra(GitEngPost.link);
    String renderContent30 = i.getStringExtra(EngDevicePost.RENDER_CONTENT);
    String link30 = i.getStringExtra(EngDevicePost.link);



    if(renderContent != null){
      String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
      String body = "<html>"+head+"<body>"+renderContent+"</body></html>";
      String bodyrender = Base64.encodeToString(body.getBytes(),Base64.NO_PADDING);
      //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

      //  WebSettings webSettings = recentpostWebView.getSettings();
      recentpostWebView.setWebViewClient(new WebViewClient());
      recentpostWebView.getSettings().setJavaScriptEnabled(true);
      recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
      recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
      recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
      recentpostWebView.getSettings().setDomStorageEnabled(true);

//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
      // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
      // webView.getSettings().setLoadWithOverviewMode(true);
      // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
      //  recentpostWebView.getSettings().setUseWideViewPort(true);
      recentpostWebView.getSettings().setSupportZoom(true);
      recentpostWebView.getSettings().setBuiltInZoomControls(true);
      recentpostWebView.getSettings().setDisplayZoomControls(true);
      recentpostWebView.loadData(bodyrender,"text/html","base64");
      ShareLink = link;
    }else if(renderContent1 != null){
      String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
      String body = "<html>"+head+"<body>"+renderContent1+"</body></html>";
      String bodyrender = Base64.encodeToString(body.getBytes(),Base64.NO_PADDING);
      //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

      //  WebSettings webSettings = recentpostWebView.getSettings();
      recentpostWebView.setWebViewClient(new WebViewClient());
      recentpostWebView.getSettings().setJavaScriptEnabled(true);
      recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
      recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
      recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
      recentpostWebView.getSettings().setDomStorageEnabled(true);


//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
      // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
      // webView.getSettings().setLoadWithOverviewMode(true);
      // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
      //  recentpostWebView.getSettings().setUseWideViewPort(true);
      recentpostWebView.getSettings().setSupportZoom(true);
      recentpostWebView.getSettings().setBuiltInZoomControls(true);
      recentpostWebView.getSettings().setDisplayZoomControls(true);
      recentpostWebView.loadData(bodyrender,"text/html","base64");
      ShareLink = link1;
    }else if(renderContent2 != null ){
      //  textView.setText(renderContentt2);
      String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
      String body = "<html>"+head+"<body>"+renderContent2+"</body></html>";
      String bodyrender = Base64.encodeToString(body.getBytes(),Base64.NO_PADDING);
      //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

      //  WebSettings webSettings = recentpostWebView.getSettings();
      recentpostWebView.setWebViewClient(new WebViewClient());
      recentpostWebView.getSettings().setJavaScriptEnabled(true);
      recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
      recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
      recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
      recentpostWebView.getSettings().setDomStorageEnabled(true);


//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
      // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
      // webView.getSettings().setLoadWithOverviewMode(true);
      // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
      //  recentpostWebView.getSettings().setUseWideViewPort(true);
      recentpostWebView.getSettings().setSupportZoom(true);
      recentpostWebView.getSettings().setBuiltInZoomControls(true);
      recentpostWebView.getSettings().setDisplayZoomControls(true);
      recentpostWebView.loadData(bodyrender,"text/html","base64");
      ShareLink = link2;
    }else if(renderContent3 != null){
      String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
      String body = "<html>"+head+"<body>"+renderContent3+"</body></html>";
      String bodyrender = Base64.encodeToString(body.getBytes(),Base64.NO_PADDING);
      //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

      //  WebSettings webSettings = recentpostWebView.getSettings();
      recentpostWebView.setWebViewClient(new WebViewClient());
      recentpostWebView.getSettings().setJavaScriptEnabled(true);
      recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
      recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
      recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
      recentpostWebView.getSettings().setDomStorageEnabled(true);


//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
      // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
      // webView.getSettings().setLoadWithOverviewMode(true);
      // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
      //  recentpostWebView.getSettings().setUseWideViewPort(true);
      recentpostWebView.getSettings().setSupportZoom(true);
      recentpostWebView.getSettings().setBuiltInZoomControls(true);
      recentpostWebView.getSettings().setDisplayZoomControls(true);
      recentpostWebView.loadData(bodyrender,"text/html","base64");
      ShareLink = link3;
    }else if(renderContent4 != null){
      String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
      String body = "<html>"+head+"<body>"+renderContent4+"</body></html>";
      String bodyrender = Base64.encodeToString(body.getBytes(),Base64.NO_PADDING);
      //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

      //  WebSettings webSettings = recentpostWebView.getSettings();
      recentpostWebView.setWebViewClient(new WebViewClient());
      recentpostWebView.getSettings().setJavaScriptEnabled(true);
      recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
      recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
      recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
      recentpostWebView.getSettings().setDomStorageEnabled(true);


//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
      // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
      // webView.getSettings().setLoadWithOverviewMode(true);
      // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
      //  recentpostWebView.getSettings().setUseWideViewPort(true);
      recentpostWebView.getSettings().setSupportZoom(true);
      recentpostWebView.getSettings().setBuiltInZoomControls(true);
      recentpostWebView.getSettings().setDisplayZoomControls(true);
      recentpostWebView.loadData(bodyrender,"text/html","base64");
      ShareLink = link4;
    }else if(renderContent5 != null){
      String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
      String body = "<html>"+head+"<body>"+renderContent5+"</body></html>";
      String bodyrender = Base64.encodeToString(body.getBytes(),Base64.NO_PADDING);
      //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

      //  WebSettings webSettings = recentpostWebView.getSettings();
      recentpostWebView.setWebViewClient(new WebViewClient());
      recentpostWebView.getSettings().setJavaScriptEnabled(true);
      recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
      recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
      recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
      recentpostWebView.getSettings().setDomStorageEnabled(true);


//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
      // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
      // webView.getSettings().setLoadWithOverviewMode(true);
      // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
      //  recentpostWebView.getSettings().setUseWideViewPort(true);
      recentpostWebView.getSettings().setSupportZoom(true);
      recentpostWebView.getSettings().setBuiltInZoomControls(true);
      recentpostWebView.getSettings().setDisplayZoomControls(true);
      recentpostWebView.loadData(bodyrender,"text/html","base64");
      ShareLink = link5;
    }else if(renderContent6 != null){
      String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
      String body = "<html>"+head+"<body>"+renderContent6+"</body></html>";
      String bodyrender = Base64.encodeToString(body.getBytes(),Base64.NO_PADDING);
      //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

      //  WebSettings webSettings = recentpostWebView.getSettings();
      recentpostWebView.setWebViewClient(new WebViewClient());
      recentpostWebView.getSettings().setJavaScriptEnabled(true);
      recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
      recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
      recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
      recentpostWebView.getSettings().setDomStorageEnabled(true);


//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
      // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
      // webView.getSettings().setLoadWithOverviewMode(true);
      // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
      //  recentpostWebView.getSettings().setUseWideViewPort(true);
      recentpostWebView.getSettings().setSupportZoom(true);
      recentpostWebView.getSettings().setBuiltInZoomControls(true);
      recentpostWebView.getSettings().setDisplayZoomControls(true);
      recentpostWebView.loadData(bodyrender,"text/html","base64");
      ShareLink = link6;
    }else if(renderContent7 != null){
      String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
      String body = "<html>"+head+"<body>"+renderContent7+"</body></html>";
      String bodyrender = Base64.encodeToString(body.getBytes(),Base64.NO_PADDING);
      //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

      //  WebSettings webSettings = recentpostWebView.getSettings();
      recentpostWebView.setWebViewClient(new WebViewClient());
      recentpostWebView.getSettings().setJavaScriptEnabled(true);
      recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
      recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
      recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
      recentpostWebView.getSettings().setDomStorageEnabled(true);


//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
      // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
      // webView.getSettings().setLoadWithOverviewMode(true);
      // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
      //  recentpostWebView.getSettings().setUseWideViewPort(true);
      recentpostWebView.getSettings().setSupportZoom(true);
      recentpostWebView.getSettings().setBuiltInZoomControls(true);
      recentpostWebView.getSettings().setDisplayZoomControls(true);
      recentpostWebView.loadData(bodyrender,"text/html","base64");
      ShareLink = link7;
    }else if(renderContent8 != null){
      String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
      String body = "<html>"+head+"<body>"+renderContent8+"</body></html>";
      String bodyrender = Base64.encodeToString(body.getBytes(),Base64.NO_PADDING);
      //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

      //  WebSettings webSettings = recentpostWebView.getSettings();
      recentpostWebView.setWebViewClient(new WebViewClient());
      recentpostWebView.getSettings().setJavaScriptEnabled(true);
      recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
      recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
      recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
      recentpostWebView.getSettings().setDomStorageEnabled(true);


//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
      // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
      // webView.getSettings().setLoadWithOverviewMode(true);
      // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
      //  recentpostWebView.getSettings().setUseWideViewPort(true);
      recentpostWebView.getSettings().setSupportZoom(true);
      recentpostWebView.getSettings().setBuiltInZoomControls(true);
      recentpostWebView.getSettings().setDisplayZoomControls(true);
      recentpostWebView.loadData(bodyrender,"text/html","base64");
      ShareLink = link8;
    }else if(renderContent9 != null){
      String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
      String body = "<html>"+head+"<body>"+renderContent9+"</body></html>";
      String bodyrender = Base64.encodeToString(body.getBytes(),Base64.NO_PADDING);
      //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

      //  WebSettings webSettings = recentpostWebView.getSettings();
      recentpostWebView.setWebViewClient(new WebViewClient());
      recentpostWebView.getSettings().setJavaScriptEnabled(true);
      recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
      recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
      recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
      recentpostWebView.getSettings().setDomStorageEnabled(true);


//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
      // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
      // webView.getSettings().setLoadWithOverviewMode(true);
      // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
      //  recentpostWebView.getSettings().setUseWideViewPort(true);
      recentpostWebView.getSettings().setSupportZoom(true);
      recentpostWebView.getSettings().setBuiltInZoomControls(true);
      recentpostWebView.getSettings().setDisplayZoomControls(true);
      recentpostWebView.loadData(bodyrender,"text/html","base64");
      ShareLink = link9;
    }else if(renderContent10 != null){
      String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
      String body = "<html>"+head+"<body>"+renderContent10+"</body></html>";
      String bodyrender = Base64.encodeToString(body.getBytes(),Base64.NO_PADDING);
      //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

      //  WebSettings webSettings = recentpostWebView.getSettings();
      recentpostWebView.setWebViewClient(new WebViewClient());
      recentpostWebView.getSettings().setJavaScriptEnabled(true);
      recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
      recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
      recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
      recentpostWebView.getSettings().setDomStorageEnabled(true);


//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
      // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
      // webView.getSettings().setLoadWithOverviewMode(true);
      // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
      //  recentpostWebView.getSettings().setUseWideViewPort(true);
      recentpostWebView.getSettings().setSupportZoom(true);
      recentpostWebView.getSettings().setBuiltInZoomControls(true);
      recentpostWebView.getSettings().setDisplayZoomControls(true);
      recentpostWebView.loadData(bodyrender,"text/html","base64");
      ShareLink = link10;
    }else if(renderContent11 != null){
      String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
      String body = "<html>"+head+"<body>"+renderContent11+"</body></html>";
      String bodyrender = Base64.encodeToString(body.getBytes(),Base64.NO_PADDING);
      //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

      //  WebSettings webSettings = recentpostWebView.getSettings();
      recentpostWebView.setWebViewClient(new WebViewClient());
      recentpostWebView.getSettings().setJavaScriptEnabled(true);
      recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
      recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
      recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
      recentpostWebView.getSettings().setDomStorageEnabled(true);


//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
      // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
      // webView.getSettings().setLoadWithOverviewMode(true);
      // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
      //  recentpostWebView.getSettings().setUseWideViewPort(true);
      recentpostWebView.getSettings().setSupportZoom(true);
      recentpostWebView.getSettings().setBuiltInZoomControls(true);
      recentpostWebView.getSettings().setDisplayZoomControls(true);
      recentpostWebView.loadData(bodyrender,"text/html","base64");
      ShareLink = link11;
    }else if(renderContent12 != null){
      String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
      String body = "<html>"+head+"<body>"+renderContent12+"</body></html>";
      String bodyrender = Base64.encodeToString(body.getBytes(),Base64.NO_PADDING);
      //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

      //  WebSettings webSettings = recentpostWebView.getSettings();
      recentpostWebView.setWebViewClient(new WebViewClient());
      recentpostWebView.getSettings().setJavaScriptEnabled(true);
      recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
      recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
      recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
      recentpostWebView.getSettings().setDomStorageEnabled(true);


//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
      // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
      // webView.getSettings().setLoadWithOverviewMode(true);
      // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
      //  recentpostWebView.getSettings().setUseWideViewPort(true);
      recentpostWebView.getSettings().setSupportZoom(true);
      recentpostWebView.getSettings().setBuiltInZoomControls(true);
      recentpostWebView.getSettings().setDisplayZoomControls(true);
      recentpostWebView.loadData(bodyrender,"text/html","base64");
      ShareLink = link12;
    }else if(renderContent13 != null){
      String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
      String body = "<html>"+head+"<body>"+renderContent13+"</body></html>";
      String bodyrender = Base64.encodeToString(body.getBytes(),Base64.NO_PADDING);
      //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

      //  WebSettings webSettings = recentpostWebView.getSettings();
      recentpostWebView.setWebViewClient(new WebViewClient());
      recentpostWebView.getSettings().setJavaScriptEnabled(true);
      recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
      recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
      recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
      recentpostWebView.getSettings().setDomStorageEnabled(true);


//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
      // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
      // webView.getSettings().setLoadWithOverviewMode(true);
      // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
      //  recentpostWebView.getSettings().setUseWideViewPort(true);
      recentpostWebView.getSettings().setSupportZoom(true);
      recentpostWebView.getSettings().setBuiltInZoomControls(true);
      recentpostWebView.getSettings().setDisplayZoomControls(true);
      recentpostWebView.loadData(bodyrender,"text/html","base64");
      ShareLink = link13;
    }else if(renderContent14 != null){
      String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
      String body = "<html>"+head+"<body>"+renderContent14+"</body></html>";
      String bodyrender = Base64.encodeToString(body.getBytes(),Base64.NO_PADDING);
      //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

      //  WebSettings webSettings = recentpostWebView.getSettings();
      recentpostWebView.setWebViewClient(new WebViewClient());
      recentpostWebView.getSettings().setJavaScriptEnabled(true);
      recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
      recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
      recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
      recentpostWebView.getSettings().setDomStorageEnabled(true);


//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
      // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
      // webView.getSettings().setLoadWithOverviewMode(true);
      // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
      //  recentpostWebView.getSettings().setUseWideViewPort(true);
      recentpostWebView.getSettings().setSupportZoom(true);
      recentpostWebView.getSettings().setBuiltInZoomControls(true);
      recentpostWebView.getSettings().setDisplayZoomControls(true);
      recentpostWebView.loadData(bodyrender,"text/html","base64");
      ShareLink = link14;
    }else if(renderContent15 != null){
      String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
      String body = "<html>"+head+"<body>"+renderContent15+"</body></html>";
      String bodyrender = Base64.encodeToString(body.getBytes(),Base64.NO_PADDING);
      //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

      //  WebSettings webSettings = recentpostWebView.getSettings();
      recentpostWebView.setWebViewClient(new WebViewClient());
      recentpostWebView.getSettings().setJavaScriptEnabled(true);
      recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
      recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
      recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
      recentpostWebView.getSettings().setDomStorageEnabled(true);


//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
      // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
      // webView.getSettings().setLoadWithOverviewMode(true);
      // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
      //  recentpostWebView.getSettings().setUseWideViewPort(true);
      recentpostWebView.getSettings().setSupportZoom(true);
      recentpostWebView.getSettings().setBuiltInZoomControls(true);
      recentpostWebView.getSettings().setDisplayZoomControls(true);
      recentpostWebView.loadData(bodyrender,"text/html","base64");
      ShareLink = link15;
    }else if(renderContent16 != null){
      String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
      String body = "<html>"+head+"<body>"+renderContent16+"</body></html>";
      String bodyrender = Base64.encodeToString(body.getBytes(),Base64.NO_PADDING);
      //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

      //  WebSettings webSettings = recentpostWebView.getSettings();
      recentpostWebView.setWebViewClient(new WebViewClient());
      recentpostWebView.getSettings().setJavaScriptEnabled(true);
      recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
      recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
      recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
      recentpostWebView.getSettings().setDomStorageEnabled(true);


//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
      // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
      // webView.getSettings().setLoadWithOverviewMode(true);
      // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
      //  recentpostWebView.getSettings().setUseWideViewPort(true);
      recentpostWebView.getSettings().setSupportZoom(true);
      recentpostWebView.getSettings().setBuiltInZoomControls(true);
      recentpostWebView.getSettings().setDisplayZoomControls(true);
      recentpostWebView.loadData(bodyrender,"text/html","base64");
      ShareLink = link16;
    }else  if(renderContent17!= null){
      String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
      String body = "<html>"+head+"<body>"+renderContent17+"</body></html>";
      String bodyrender = Base64.encodeToString(body.getBytes(),Base64.NO_PADDING);
      //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

      //  WebSettings webSettings = recentpostWebView.getSettings();
      recentpostWebView.setWebViewClient(new WebViewClient());
      recentpostWebView.getSettings().setJavaScriptEnabled(true);
      recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
      recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
      recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
      recentpostWebView.getSettings().setDomStorageEnabled(true);


//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
      // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
      // webView.getSettings().setLoadWithOverviewMode(true);
      // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
      //  recentpostWebView.getSettings().setUseWideViewPort(true);
      recentpostWebView.getSettings().setSupportZoom(true);
      recentpostWebView.getSettings().setBuiltInZoomControls(true);
      recentpostWebView.getSettings().setDisplayZoomControls(true);
      recentpostWebView.loadData(bodyrender,"text/html","base64");
      ShareLink = link17;
    }else if(renderContent18!= null){
      String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
      String body = "<html>"+head+"<body>"+renderContent18+"</body></html>";
      String bodyrender = Base64.encodeToString(body.getBytes(),Base64.NO_PADDING);
      //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

      //  WebSettings webSettings = recentpostWebView.getSettings();
      recentpostWebView.setWebViewClient(new WebViewClient());
      recentpostWebView.getSettings().setJavaScriptEnabled(true);
      recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
      recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
      recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
      recentpostWebView.getSettings().setDomStorageEnabled(true);


//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
      // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
      // webView.getSettings().setLoadWithOverviewMode(true);
      // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
      //  recentpostWebView.getSettings().setUseWideViewPort(true);
      recentpostWebView.getSettings().setSupportZoom(true);
      recentpostWebView.getSettings().setBuiltInZoomControls(true);
      recentpostWebView.getSettings().setDisplayZoomControls(true);
      recentpostWebView.loadData(bodyrender,"text/html","base64");
      ShareLink = link18;
    }else if(renderContent19!= null){
      String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
      String body = "<html>"+head+"<body>"+renderContent19+"</body></html>";
      String bodyrender = Base64.encodeToString(body.getBytes(),Base64.NO_PADDING);
      //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

      //  WebSettings webSettings = recentpostWebView.getSettings();
      recentpostWebView.setWebViewClient(new WebViewClient());
      recentpostWebView.getSettings().setJavaScriptEnabled(true);
      recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
      recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
      recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
      recentpostWebView.getSettings().setDomStorageEnabled(true);


//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
      // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
      // webView.getSettings().setLoadWithOverviewMode(true);
      // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
      //  recentpostWebView.getSettings().setUseWideViewPort(true);
      recentpostWebView.getSettings().setSupportZoom(true);
      recentpostWebView.getSettings().setBuiltInZoomControls(true);
      recentpostWebView.getSettings().setDisplayZoomControls(true);
      recentpostWebView.loadData(bodyrender,"text/html","base64");
      ShareLink = link19;

    }else if(renderContent20!= null){
      String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
      String body = "<html>"+head+"<body>"+renderContent20+"</body></html>";
      String bodyrender = Base64.encodeToString(body.getBytes(),Base64.NO_PADDING);
      //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

      //  WebSettings webSettings = recentpostWebView.getSettings();
      recentpostWebView.setWebViewClient(new WebViewClient());
      recentpostWebView.getSettings().setJavaScriptEnabled(true);
      recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
      recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
      recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
      recentpostWebView.getSettings().setDomStorageEnabled(true);


//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
      // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
      // webView.getSettings().setLoadWithOverviewMode(true);
      // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
      //  recentpostWebView.getSettings().setUseWideViewPort(true);
      recentpostWebView.getSettings().setSupportZoom(true);
      recentpostWebView.getSettings().setBuiltInZoomControls(true);
      recentpostWebView.getSettings().setDisplayZoomControls(true);
      recentpostWebView.loadData(bodyrender,"text/html","base64");
      ShareLink = link20;
    }else if(renderContent21!= null){
      String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
      String body = "<html>"+head+"<body>"+renderContent21+"</body></html>";
      String bodyrender = Base64.encodeToString(body.getBytes(),Base64.NO_PADDING);
      //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

      //  WebSettings webSettings = recentpostWebView.getSettings();
      recentpostWebView.setWebViewClient(new WebViewClient());
      recentpostWebView.getSettings().setJavaScriptEnabled(true);
      recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
      recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
      recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
      recentpostWebView.getSettings().setDomStorageEnabled(true);


//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
      // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
      // webView.getSettings().setLoadWithOverviewMode(true);
      // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
      //  recentpostWebView.getSettings().setUseWideViewPort(true);
      recentpostWebView.getSettings().setSupportZoom(true);
      recentpostWebView.getSettings().setBuiltInZoomControls(true);
      recentpostWebView.getSettings().setDisplayZoomControls(true);
      recentpostWebView.loadData(bodyrender,"text/html","base64");
      ShareLink = link21;
    }else if(renderContent22!= null){
      String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
      String body = "<html>"+head+"<body>"+renderContent22+"</body></html>";
      String bodyrender = Base64.encodeToString(body.getBytes(),Base64.NO_PADDING);
      //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

      //  WebSettings webSettings = recentpostWebView.getSettings();
      recentpostWebView.setWebViewClient(new WebViewClient());
      recentpostWebView.getSettings().setJavaScriptEnabled(true);
      recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
      recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
      recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
      recentpostWebView.getSettings().setDomStorageEnabled(true);


//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
      // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
      // webView.getSettings().setLoadWithOverviewMode(true);
      // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
      //  recentpostWebView.getSettings().setUseWideViewPort(true);
      recentpostWebView.getSettings().setSupportZoom(true);
      recentpostWebView.getSettings().setBuiltInZoomControls(true);
      recentpostWebView.getSettings().setDisplayZoomControls(true);
      recentpostWebView.loadData(bodyrender,"text/html","base64");
      ShareLink = link22;
    }else if(renderContent23!= null){
      String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
      String body = "<html>"+head+"<body>"+renderContent23+"</body></html>";
      String bodyrender = Base64.encodeToString(body.getBytes(),Base64.NO_PADDING);
      //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

      //  WebSettings webSettings = recentpostWebView.getSettings();
      recentpostWebView.setWebViewClient(new WebViewClient());
      recentpostWebView.getSettings().setJavaScriptEnabled(true);
      recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
      recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
      recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
      recentpostWebView.getSettings().setDomStorageEnabled(true);


//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
      // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
      // webView.getSettings().setLoadWithOverviewMode(true);
      // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
      //  recentpostWebView.getSettings().setUseWideViewPort(true);
      recentpostWebView.getSettings().setSupportZoom(true);
      recentpostWebView.getSettings().setBuiltInZoomControls(true);
      recentpostWebView.getSettings().setDisplayZoomControls(true);
      recentpostWebView.loadData(bodyrender,"text/html","base64");
      ShareLink = link23;
    }else if(renderContent24!= null){
      String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
      String body = "<html>"+head+"<body>"+renderContent24+"</body></html>";
      String bodyrender = Base64.encodeToString(body.getBytes(),Base64.NO_PADDING);
      //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

      //  WebSettings webSettings = recentpostWebView.getSettings();
      recentpostWebView.setWebViewClient(new WebViewClient());
      recentpostWebView.getSettings().setJavaScriptEnabled(true);
      recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
      recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
      recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
      recentpostWebView.getSettings().setDomStorageEnabled(true);


//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
      // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
      // webView.getSettings().setLoadWithOverviewMode(true);
      // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
      //  recentpostWebView.getSettings().setUseWideViewPort(true);
      recentpostWebView.getSettings().setSupportZoom(true);
      recentpostWebView.getSettings().setBuiltInZoomControls(true);
      recentpostWebView.getSettings().setDisplayZoomControls(true);
      recentpostWebView.loadData(bodyrender,"text/html","base64");
      ShareLink = link24;
    }else if(renderContent25!= null){
      String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
      String body = "<html>"+head+"<body>"+renderContent25+"</body></html>";
      String bodyrender = Base64.encodeToString(body.getBytes(),Base64.NO_PADDING);
      //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

      //  WebSettings webSettings = recentpostWebView.getSettings();
      recentpostWebView.setWebViewClient(new WebViewClient());
      recentpostWebView.getSettings().setJavaScriptEnabled(true);
      recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
      recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
      recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
      recentpostWebView.getSettings().setDomStorageEnabled(true);


//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
      // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
      // webView.getSettings().setLoadWithOverviewMode(true);
      // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
      //  recentpostWebView.getSettings().setUseWideViewPort(true);
      recentpostWebView.getSettings().setSupportZoom(true);
      recentpostWebView.getSettings().setBuiltInZoomControls(true);
      recentpostWebView.getSettings().setDisplayZoomControls(true);
      recentpostWebView.loadData(bodyrender,"text/html","base64");
      ShareLink = link25;
    }else if(renderContent26!= null) {
      String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
      String body = "<html>" + head + "<body>" + renderContent26 + "</body></html>";
      String bodyrender = Base64.encodeToString(body.getBytes(), Base64.NO_PADDING);
      //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

      //  WebSettings webSettings = recentpostWebView.getSettings();
      recentpostWebView.setWebViewClient(new WebViewClient());
      recentpostWebView.getSettings().setJavaScriptEnabled(true);
      recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
      recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
      recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
      recentpostWebView.getSettings().setDomStorageEnabled(true);


//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
      // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
      // webView.getSettings().setLoadWithOverviewMode(true);
      // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
      //  recentpostWebView.getSettings().setUseWideViewPort(true);
      recentpostWebView.getSettings().setSupportZoom(true);
      recentpostWebView.getSettings().setBuiltInZoomControls(true);
      recentpostWebView.getSettings().setDisplayZoomControls(true);
      recentpostWebView.loadData(bodyrender, "text/html", "base64");
      ShareLink = link26;

    }else if(renderContent27!= null) {
      String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
      String body = "<html>" + head + "<body>" + renderContent27 + "</body></html>";
      String bodyrender = Base64.encodeToString(body.getBytes(), Base64.NO_PADDING);
      //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

      //  WebSettings webSettings = recentpostWebView.getSettings();
      recentpostWebView.setWebViewClient(new WebViewClient());
      recentpostWebView.getSettings().setJavaScriptEnabled(true);
      recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
      recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
      recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
      recentpostWebView.getSettings().setDomStorageEnabled(true);


//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
      // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
      // webView.getSettings().setLoadWithOverviewMode(true);
      // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
      //  recentpostWebView.getSettings().setUseWideViewPort(true);
      recentpostWebView.getSettings().setSupportZoom(true);
      recentpostWebView.getSettings().setBuiltInZoomControls(true);
      recentpostWebView.getSettings().setDisplayZoomControls(true);
      recentpostWebView.loadData(bodyrender, "text/html", "base64");
      ShareLink = link27;

    }else if(renderContent28!= null) {
      String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
      String body = "<html>" + head + "<body>" + renderContent28 + "</body></html>";
      String bodyrender = Base64.encodeToString(body.getBytes(), Base64.NO_PADDING);
      //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

      //  WebSettings webSettings = recentpostWebView.getSettings();
      recentpostWebView.setWebViewClient(new WebViewClient());
      recentpostWebView.getSettings().setJavaScriptEnabled(true);
      recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
      recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
      recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
      recentpostWebView.getSettings().setDomStorageEnabled(true);


//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
      // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
      // webView.getSettings().setLoadWithOverviewMode(true);
      // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
      //  recentpostWebView.getSettings().setUseWideViewPort(true);
      recentpostWebView.getSettings().setSupportZoom(true);
      recentpostWebView.getSettings().setBuiltInZoomControls(true);
      recentpostWebView.getSettings().setDisplayZoomControls(true);
      recentpostWebView.loadData(bodyrender, "text/html", "base64");
      ShareLink = link28;

    }else if(renderContent29!= null) {
      String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
      String body = "<html>" + head + "<body>" + renderContent29 + "</body></html>";
      String bodyrender = Base64.encodeToString(body.getBytes(), Base64.NO_PADDING);
      //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

      //  WebSettings webSettings = recentpostWebView.getSettings();
      recentpostWebView.setWebViewClient(new WebViewClient());
      recentpostWebView.getSettings().setJavaScriptEnabled(true);
      recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
      recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
      recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
      recentpostWebView.getSettings().setDomStorageEnabled(true);


//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
      // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
      // webView.getSettings().setLoadWithOverviewMode(true);
      // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
      //  recentpostWebView.getSettings().setUseWideViewPort(true);
      recentpostWebView.getSettings().setSupportZoom(true);
      recentpostWebView.getSettings().setBuiltInZoomControls(true);
      recentpostWebView.getSettings().setDisplayZoomControls(true);
      recentpostWebView.loadData(bodyrender, "text/html", "base64");
      ShareLink = link29;

    }else if(renderContent30!= null) {
      String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
      String body = "<html>" + head + "<body>" + renderContent30 + "</body></html>";
      String bodyrender = Base64.encodeToString(body.getBytes(), Base64.NO_PADDING);
      //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

      //  WebSettings webSettings = recentpostWebView.getSettings();
      recentpostWebView.setWebViewClient(new WebViewClient());
      recentpostWebView.getSettings().setJavaScriptEnabled(true);
      recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
      recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
      recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
      recentpostWebView.getSettings().setDomStorageEnabled(true);


//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
      // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
      // webView.getSettings().setLoadWithOverviewMode(true);
      // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
      //  recentpostWebView.getSettings().setUseWideViewPort(true);
      recentpostWebView.getSettings().setSupportZoom(true);
      recentpostWebView.getSettings().setBuiltInZoomControls(true);
      recentpostWebView.getSettings().setDisplayZoomControls(true);
      recentpostWebView.loadData(bodyrender, "text/html", "base64");
      ShareLink = link30;

    }



  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    super.onCreateOptionsMenu(menu);
    getMenuInflater().inflate(R.menu.menu_view,menu);

    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    super.onOptionsItemSelected(item);

    if(item.getItemId() == R.id.main_share){
      openDialog();

    }
    return true;
  }

  public void openDialog(){

   Intent i = new Intent();
   i.setAction(Intent.ACTION_SEND);
   i.putExtra(Intent.EXTRA_TEXT, ShareLink);
   i.setType("text/plain");
   startActivity(i);


  }
}
