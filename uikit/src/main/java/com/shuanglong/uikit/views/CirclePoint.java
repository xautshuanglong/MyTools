package com.shuanglong.uikit.views;

import android.graphics.Color;

/**
 * Created by JiangShuanglong on 2017/5/1.
 */

public class CirclePoint
{
    private float mFloatX;
    private float mFloatY;
    private float mRadius;
    private int mColor;

    public CirclePoint()
    {
        this(0, 0, 1, Color.BLACK);
    }

    public CirclePoint(float x, float y)
    {
        this(x, y, 1, Color.BLACK);
    }

    public CirclePoint(float x, float y, float radius)
    {
        this(x, y, radius, Color.BLACK);
    }

    public CirclePoint(float x, float y, float radius, int color)
    {
        mFloatX = x;
        mFloatY = y;
        mRadius = radius;
        mColor = color;
    }

    public float getX()
    {
        return mFloatX;
    }

    public void setX(float x)
    {
        mFloatX = x;
    }

    public float getY()
    {
        return mFloatY;
    }

    public void setY(float y)
    {
        mFloatY = y;
    }

    public float getRadius()
    {
        return mRadius;
    }

    public void setRadius(float radius)
    {
        mRadius = radius;
    }

    public int getColor()
    {
        return mColor;
    }

    public void setColor(int color)
    {
        mColor = color;
    }
}
