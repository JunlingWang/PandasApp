package com.example.junlingwang.pandasapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class CartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        WebView webView = (WebView) findViewById(R.id.cartWebView);
        webView.loadUrl("http://www.pandatownsville.com/cart/");
    }
}
