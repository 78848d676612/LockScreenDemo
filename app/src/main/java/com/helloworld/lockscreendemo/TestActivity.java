package com.helloworld.lockscreendemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import moe.pinkd.lockscreen.LockScreenManager;

public class TestActivity  extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //optional
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        LockScreenManager.onCreate(getWindow());
        setContentView(R.layout.activity_test);
    }
}
