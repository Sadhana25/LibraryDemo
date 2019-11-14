package com.activa.one.librarydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.activa.one.mylibrary.CustomMath;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int  res=CustomMath.minus(6,8);
        int min=CustomMath.times(8,9);


    }
}
