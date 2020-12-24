package com.example.android_studio_14_IntentAdvence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click_phoneBTN(View v){
        Intent phone = new Intent(this, PhoneActivity.class);
        startActivity(phone);
    }
    public void click_mapGTN(View v){
        Intent map = new Intent(this, MapActivity.class);
        startActivity(map);
    }
    public void click_webBTN(View v){
        Intent web = new Intent(this, WebActivity.class);
        startActivity(web);
    }
}