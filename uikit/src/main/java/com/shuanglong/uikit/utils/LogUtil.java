package com.shuanglong.uikit.utils;

import android.util.Log;

/**
 * Created by JiangShuanglong on 2017/5/1.
 */

public class LogUtil
{
    private static String TAG = "Shuanglong-uikit";

    public static void debug(String message)
    {
        Log.d(TAG, message);
    }

    public static void debug(String format, Object ...objs)
    {
        String logMsg = String.format(format, objs);
        Log.d(TAG, logMsg);
    }
}
