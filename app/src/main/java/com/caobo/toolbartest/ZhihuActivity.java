package com.caobo.toolbartest;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

/**
 * Created by 曹博 on 2016/9/21.
 * 我们已经继承了TranslucentBarActivity，已经为我们加在过布局了，所以这里不需要setContentView(R.layout.activity_tool_bar);
 * 实现了抽象方法，返回了Id
 */

public class ZhihuActivity extends TranslucentBarActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_zhihu);

        //toolbar布局文件和菜单文件
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_zhihu);
        toolbar.inflateMenu(R.menu.zhihu_toolbar_menu);

        //导航栏图标
        toolbar.setNavigationIcon(R.mipmap.ic_drawer_home);


        toolbar.setTitle(R.string.home_page);
        toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_zhihu;
    }
}
