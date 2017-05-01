package com.shuanglong.mytools.app;

import android.app.Application;

import com.shuanglong.mytools.utils.LogUtil;

/**
 * Created by JiangShuanglong on 2017/5/1.
 */

public class ShuanglongApp extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();

        LogUtil.debug("ShuanglongApp.java onCreate --------------- 0000");
    }

    @Override
    public void onTerminate()
    {
        super.onTerminate();
        LogUtil.debug("ShuanglongApp.java onTerminate --------------- 9999");
    }
}
