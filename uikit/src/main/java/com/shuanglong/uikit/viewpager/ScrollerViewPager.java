package com.shuanglong.uikit.viewpager;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.DecelerateInterpolator;

import com.shuanglong.uikit.scroller.FixedSpeedScroller;

import java.lang.reflect.Field;

import com.shuanglong.uikit.R;

/**
 * Created by JiangShuanglong on 2017/5/5.
 */

public class ScrollerViewPager extends ViewPager
{
    private static final String TAG = ScrollerViewPager.class.getSimpleName();
    private int duration = 1000;

    public ScrollerViewPager(Context context)
    {
        super(context);
    }

    public ScrollerViewPager(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    public void fixScrollSpeed()
    {
        fixScrollSpeed(duration);
    }

    public void fixScrollSpeed(int duration)
    {
        this.duration = duration;
        setScrollSpeedUsingRefection(duration);
    }

    private void setScrollSpeedUsingRefection(int duration)
    {
        try
        {
            Field localField = ViewPager.class.getDeclaredField("mScroller");
            localField.setAccessible(true);
            FixedSpeedScroller scroller = new FixedSpeedScroller(getContext(), new DecelerateInterpolator(1.5F));
            scroller.setDuration(duration);
            localField.set(this, scroller);
            return;
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
        }
        catch (NoSuchFieldException localNoSuchFieldException)
        {
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev)
    {
        try
        {
            return super.onInterceptTouchEvent(ev);
        }
        catch (IllegalArgumentException e)
        {
            Log.e(TAG, "onInterceptTouchEvent in IllegalArgumentException");
            return false;
        }
    }
}
