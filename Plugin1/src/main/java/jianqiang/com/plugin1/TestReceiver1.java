package jianqiang.com.plugin1;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.example.jianqiang.mypluginlibrary.BasePluginReceiver;

public class TestReceiver1 extends BasePluginReceiver {

    private static final String TAG = "TestReceiver1";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e(TAG, "TestReceiver1 onReceive");
    }
}
