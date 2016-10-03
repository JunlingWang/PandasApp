package com.example.junlingwang.pandasapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class PickupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pickup);

        WebView webView = (WebView) findViewById(R.id.orderWebView);
        webView.loadUrl("http://www.pandatownsville.com/pick-up/");
    }

    public void go_to_home (View view) {
        Intent go_to = new Intent(this, HomeActivity.class);
        startActivity(go_to);
    }
}
