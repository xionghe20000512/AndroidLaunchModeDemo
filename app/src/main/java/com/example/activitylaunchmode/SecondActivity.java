package com.example.activitylaunchmode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class SecondActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
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
