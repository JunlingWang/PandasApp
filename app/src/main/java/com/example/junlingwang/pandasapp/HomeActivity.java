package com.example.junlingwang.pandasapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void go_to_order (View view) {
        Intent go_to = new Intent(this, OrderActivity.class);
        startActivity(go_to);
    }

    public void go_to_pick_up (View view) {
        Intent go_to = new Intent(this, PickupActivity.class);
        startActivity(go_to);
    }


}

