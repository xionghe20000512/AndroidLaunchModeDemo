package com.example.activitylaunchmode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

    }

    public void openFirst(View v){
        //打开第一个Activity
        startActivity(new Intent(this,FirstActivity.class));
    }

    public void openSecond(View v){
        //打开第二个Activity
        startActivity(new Intent(this,SecondActivity.class));
    }
}
