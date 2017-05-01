package com.shuanglong.mytools.activities;

import android.os.Bundle;
import android.view.View;

import com.shuanglong.mytools.R;
import com.shuanglong.mytools.utils.LogUtil;

public class MainActivity extends BaseActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        LogUtil.debug("MainActivity.java before super.onCreate -------------- 0001");
        super.onCreate(savedInstanceState);

        LogUtil.debug("MainActivity.java onCreate -------------- 0004");
    }

    @Override
    protected int getLayoutID()
    {
        return R.layout.activity_main;
    }

    @Override
    protected void initView()
    {
        LogUtil.debug("MainActivity.java initView -------------- 0002");
    }

    @Override
    protected void initListener()
    {
        LogUtil.debug("MainActivity.java initListener -------------- 0003");
    }

    @Override
    protected void processClick(View view)
    {
        ;
    }
}
