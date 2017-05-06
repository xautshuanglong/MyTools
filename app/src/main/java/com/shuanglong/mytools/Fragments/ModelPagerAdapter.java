package com.shuanglong.mytools.Fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by JiangShuanglong on 2017/5/6.
 */

public class ModelPagerAdapter extends FragmentStatePagerAdapter
{
    protected PagerModelManager mPagerModelManager = null;

    public ModelPagerAdapter(FragmentManager fm, PagerModelManager pagerModelManager)
    {
        super(fm);
        mPagerModelManager = pagerModelManager;
    }

    @Override
    public Fragment getItem(int position)
    {
        return mPagerModelManager.getItem(position);
    }

    @Override
    public int getCount()
    {
        return mPagerModelManager.getFragmentCount();
    }

    public CharSequence getPageTitle(int position)
    {
        CharSequence pageTitle;
        if(mPagerModelManager.hasTitles())
        {
            pageTitle = mPagerModelManager.getTitle(position);
        }
        else
        {
            pageTitle = super.getPageTitle(position);
        }

        return pageTitle;
    }
}
