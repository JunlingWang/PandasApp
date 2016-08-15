package com.example.junlingwang.pandasapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        WebView webView = (WebView) findViewById(R.id.orderWebView);
        webView.loadUrl("http://www.pandatownsville.com/menu/");
    }
}
