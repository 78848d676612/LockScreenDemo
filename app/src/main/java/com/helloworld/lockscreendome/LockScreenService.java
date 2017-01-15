package com.helloworld.lockscreendome;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.helloworld.lockscreen.LockScreenManager;
import com.helloworld.lockscreen.LockScreenReceiver;


public class LockScreenService extends Service {
    private LockScreenManager lockScreenManager;

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (lockScreenManager == null) {
            lockScreenManager = new LockScreenManager(this, new LockScreenReceiver<>(TestActivity.class));
        }
        if (!lockScreenManager.isEnabled()) {
            lockScreenManager.enableLockScreen();
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        lockScreenManager.disableLockScreen();
        super.onDestroy();
    }
}
