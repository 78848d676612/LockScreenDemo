package com.helloworld.lockscreendome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.helloworld.lockscreendome.service.LockScreenService;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startService(new Intent(this, LockScreenService.class));
    }
}