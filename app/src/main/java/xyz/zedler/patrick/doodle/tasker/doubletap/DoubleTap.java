package xyz.zedler.patrick.doodle.tasker.doubletap;

import android.content.Context;

import com.joaomgcd.taskerpluginlibrary.extensions.PublicKt;

public class DoubleTap {
    public static void triggerEvent(Context context) {
        PublicKt.requestQuery(DoubleTapConfigActivity.class, context, null);
    }
}
