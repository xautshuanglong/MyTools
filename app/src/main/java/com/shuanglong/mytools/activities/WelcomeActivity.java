package com.shuanglong.mytools.activities;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import com.shuanglong.mytools.R;
import com.shuanglong.mytools.utils.LogUtil;
import com.shuanglong.uikit.views.CirclePoint;

public class WelcomeActivity extends AppCompatActivity
{
    private View mContentView = null;
    private View mControlView = null;
    private ActionBar mActionBar = null;

    private boolean mShowFlag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        LogUtil.debug("WelcomeActivity.java onCreate ------ 0010");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        initView();
    }

    private void initView()
    {
        mContentView = findViewById(R.id.fullscreen_content);
        mControlView = findViewById(R.id.fullscreen_content_controls);
        mActionBar = getSupportActionBar();

        CirclePoint sf;
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        hideActionBar();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        if (event.getAction()==MotionEvent.ACTION_DOWN)
        {
            if(mShowFlag)
            {
                mShowFlag = false;
                hideActionBar();
            }
            else
            {
                mShowFlag = true;
                showActionBar();
            }
        }
        return super.onTouchEvent(event);
    }

    private void showActionBar()
    {
        mContentView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
                View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);
        if (mActionBar != null)
        {
            mActionBar.show();
        }
        mControlView.setVisibility(View.VISIBLE);
    }

    private void hideActionBar()
    {
        if (mActionBar != null)
        {
            mActionBar.hide();
        }
//        mControlView.setVisibility(View.GONE);
        mContentView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LOW_PROFILE |
                View.SYSTEM_UI_FLAG_FULLSCREEN |
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE |
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY |
                View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION |
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
    }
}
