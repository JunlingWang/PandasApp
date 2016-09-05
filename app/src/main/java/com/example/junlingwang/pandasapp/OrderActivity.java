package com.example.junlingwang.pandasapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        WebView webView = (WebView) findViewById(R.id.orderWebView);
        webView.loadUrl("http://www.pandatownsville.com/mobile_menu/");
    }
    public void go_to_cart (View view) {
        Intent go_to = new Intent(this, CartActivity.class);
        startActivity(go_to);
    }
}
