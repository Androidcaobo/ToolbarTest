package com.caobo.toolbartest;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/**
 * Created by 曹博 on 2016/9/21.
 * 透明状态栏基类，很多童鞋反应，在每个布局文件中都要写上 android:fitsSystemWindows="true" ,
 * 有没有更佳方便的方法，本人当时没有思路。今天收到coder_sharp 童鞋反馈的一种更为简便的思路
 */

public abstract class TranslucentBarActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(getLayoutResId());//把设置布局文件的操作交给继承的子类

        ViewGroup contentFrameLayout = (ViewGroup) findViewById(Window.ID_ANDROID_CONTENT);
        View parentView = contentFrameLayout.getChildAt(0);
        if (parentView != null && Build.VERSION.SDK_INT >= 14) {
            parentView.setFitsSystemWindows(true);
        }
    }

    /**
     * 返回当前Activity布局文件的id
     *
     * @return
     */
    abstract protected int getLayoutResId();
}
