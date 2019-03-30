package com.example.yohan.blogapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class RecentPostView extends AppCompatActivity {

    private WebView recentpostWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recent_post_view);

        recentpostWebView = findViewById(R.id.recent_postwebview);

        Intent i = getIntent();
        String renderContent = i.getStringExtra(RecentFragment.RENDER_CONTENT);


        String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style><heade>";
        String body = "<html>"+head+"<body>"+renderContent+"</body></html>";

        recentpostWebView.setWebViewClient(new WebViewClient());
        recentpostWebView.getSettings().setJavaScriptEnabled(true);
        recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);


        // webView.getSettings().setLoadWithOverviewMode(true);
        // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        //  webView.getSettings().setUseWideViewPort(true);
        recentpostWebView.getSettings().setSupportZoom(true);
        recentpostWebView.getSettings().setBuiltInZoomControls(true);
        recentpostWebView.getSettings().setDisplayZoomControls(true);
        recentpostWebView.loadData(body,"text/html" ,null);

    }
}
