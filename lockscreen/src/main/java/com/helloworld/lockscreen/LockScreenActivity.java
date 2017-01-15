package com.helloworld.lockscreen;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager.LayoutParams;

import com.helloworld.lockscreen.R;

public class LockScreenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(
                LayoutParams.FLAG_DISMISS_KEYGUARD
                        | LayoutParams.FLAG_SHOW_WHEN_LOCKED
                        | LayoutParams.FLAG_ALLOW_LOCK_WHILE_SCREEN_ON
        );
    }
}
