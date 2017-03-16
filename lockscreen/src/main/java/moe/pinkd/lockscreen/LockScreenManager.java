package moe.pinkd.lockscreen;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public class LockScreenManager {

    private Context context;
    private LockScreenReceiver lockScreenReceiver;
    private IntentFilter intentFilter;
    private boolean isEnabled;

    public LockScreenManager(Context context, LockScreenReceiver lockScreenReceiver) {
        this.lockScreenReceiver = lockScreenReceiver;
        this.context = context;
        intentFilter = new IntentFilter(Intent.ACTION_SCREEN_OFF);
    }

    public void enableLockScreen() {
        context.registerReceiver(lockScreenReceiver, intentFilter);
        isEnabled = true;
    }

    public void disableLockScreen() {
        context.unregisterReceiver(lockScreenReceiver);
        isEnabled = false;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public IntentFilter getIntentFilter() {
        return intentFilter;
    }

    public void setIntentFilter(IntentFilter intentFilter) {
        this.intentFilter = intentFilter;
    }

    public LockScreenReceiver getLockScreenReceiver() {
        return lockScreenReceiver;
    }

    public void setLockScreenReceiver(LockScreenReceiver lockScreenReceiver) {
        this.lockScreenReceiver = lockScreenReceiver;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
