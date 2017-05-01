package com.shuanglong.mytools.utils;

import android.util.Log;

/**
 * Created by JiangShuanglong on 2017/5/1.
 */

public final class LogUtil
{
    private static String TAG = "Shuanglong";

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
