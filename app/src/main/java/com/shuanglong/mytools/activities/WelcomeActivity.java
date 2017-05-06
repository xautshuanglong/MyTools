package com.shuanglong.mytools.activities;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.shuanglong.mytools.Fragments.GuideFragment;
import com.shuanglong.mytools.Fragments.ModelPagerAdapter;
import com.shuanglong.mytools.Fragments.PagerModelManager;
import com.shuanglong.mytools.R;
import com.shuanglong.uikit.framelayout.CircleIndicator;
import com.shuanglong.uikit.viewpager.ScrollerViewPager;

import java.util.ArrayList;
import java.util.List;

public class WelcomeActivity extends FragmentActivity
{
    private ScrollerViewPager scrollPager = null;
    private CircleIndicator circleIndicator = null;
    private ActionBar mActionBar = null;

    private boolean mShowFlag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);                  // 隐藏标题栏
        int flag = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;  // 状态栏透明
        getWindow().setFlags(flag, flag);
        flag = WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION;  // 导航栏透明
        getWindow().setFlags(flag, flag);

        setContentView(R.layout.activity_welcome);
        initView();
    }

    private void initView()
    {
        scrollPager = (ScrollerViewPager)findViewById(R.id.view_pager);
        circleIndicator = (CircleIndicator)findViewById(R.id.view_indicator);

        PagerModelManager manager = new PagerModelManager();

        manager.addCommonFragment(GuideFragment.class, getBgList(), getTitleList());
        ModelPagerAdapter adapter = new ModelPagerAdapter(getSupportFragmentManager(), manager);
        scrollPager.setAdapter(adapter);
        scrollPager.fixScrollSpeed();
        circleIndicator.setViewPager(scrollPager);
    }

    private List<String> getTitleList()
    {
        List<String> titleList = new ArrayList<String>();
        titleList.add("1");
        titleList.add("2");
        titleList.add("3");
        titleList.add("4");

        return titleList;
    }

    private List<Integer> getBgList()
    {
        List<Integer> backImgList = new ArrayList<Integer>();
        backImgList.add(R.mipmap.bg1);
        backImgList.add(R.mipmap.bg2);
        backImgList.add(R.mipmap.bg3);
        backImgList.add(R.mipmap.bg4);

        return backImgList;
    }
}
