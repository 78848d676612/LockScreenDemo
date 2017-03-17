package moe.pinkd.lockscreen;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class LockScreenReceiver extends BroadcastReceiver {

    private static final String TAG = "LockScreenReceiver";
    private Class<? extends Activity> cls;

    public LockScreenReceiver(Class<? extends Activity> cls) {
        this.cls = cls;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "LockScreenReceiver onReceive");
        if (cls == null) {
            throw new NullPointerException("Activity to start is null");
        }
        intent = new Intent(context, cls);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

}
