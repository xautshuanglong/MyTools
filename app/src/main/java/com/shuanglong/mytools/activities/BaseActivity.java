package com.shuanglong.mytools.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by JiangShuanglong on 2017/5/1.
 */

public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(getLayoutID());
        initView();
        initListener();
    }

    @Override
    public void onClick(View v)
    {
        processClick(v);
    }

    protected abstract int getLayoutID();
    protected abstract void initView();
    protected abstract void initListener();
    protected abstract void processClick(View view);
}
