package com.example.yohan.blogapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class RecentPostView extends AppCompatActivity {

    private WebView recentpostWebView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recent_post_view);

        recentpostWebView = findViewById(R.id.recent_postwebview);
        //textView = findViewById(R.id.webtitle);

        Intent i = getIntent();
        String renderContent = i.getStringExtra(RecentFragment.RENDER_CONTENT);
       // String renderContentt = i.getStringExtra(RecentFragment.);

        String renderContent1 = i.getStringExtra(JavaPost.RENDER_CONTENT);
        String renderContent2 = i.getStringExtra(AngularPost.RENDER_CONTENT);
       // String renderContentt2 = i.getStringExtra(AngularPost.title);
        String renderContent3 = i.getStringExtra(FiverrPost.RENDER_CONTENT);
        String renderContent4 = i.getStringExtra(GitPosts.RENDER_CONTENT);
        String renderContent5 = i.getStringExtra(HtmlPost.RENDER_CONTENT);
        String renderContent6 = i.getStringExtra(KotlinPost.RENDER_CONTENT);
        String renderContent7 = i.getStringExtra(LaravelPost.RENDER_CONTENT);
        String renderContent8 = i.getStringExtra(NetworkingPost.RENDER_CONTENT);
        String renderContent9 = i.getStringExtra(PHPPost.RENDER_CONTENT);
        String renderContent10 = i.getStringExtra(UnityPost.RENDER_CONTENT);
        String renderContent11 = i.getStringExtra(MoviesPost.RENDER_CONTENT);
        String renderContent12 = i.getStringExtra(AnimationPost.RENDER_CONTENT);
        String renderContent13 = i.getStringExtra(GamesPost.RENDER_CONTENT);
        String renderContent14 = i.getStringExtra(SportPost.RENDER_CONTENT);
        String renderContent15 = i.getStringExtra(TechEnglishPost.RENDER_CONTENT);
        String renderContent16 = i.getStringExtra(TechTamilPost.RENDER_CONTENT);
        String renderContent17 =i.getStringExtra(TechSinhalPost.RENDER_CONTENT);
        String renderContent18 =i.getStringExtra(TechnologyPost.RENDER_CONTENT);
        String renderContent19 =i.getStringExtra(KibuliPost.RENDER_CONTENT);
        String renderContent20 =i.getStringExtra(OtherPost.RENDER_CONTENT);


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
        }












    }
}
