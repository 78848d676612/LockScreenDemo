package com.helloworld.lockscreendemo;

import android.os.Bundle;
import android.view.WindowManager;

import moe.pinkd.lockscreen.LockScreenActivity;

public class TestActivity extends LockScreenActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //optional
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_test);
    }
}
