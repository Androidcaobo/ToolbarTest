package com.caobo.toolbartest;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Created by 曹博 on 2016/9/20.
 * 我们已经继承了TranslucentBarActivity，已经为我们加在过布局了，所以这里不需要setContentView(R.layout.activity_tool_bar);
 * 实现了抽象方法，返回了Id
 */

public class ToolbarActivity extends TranslucentBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_tool_bar);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        //设置导航栏图标
        toolbar.setNavigationIcon(R.drawable.home);
        //设置app的logo
        toolbar.setLogo(R.mipmap.ic_launcher);
        //设置主标题
        toolbar.setTitle("Title");
        //设置副标题
        toolbar.setSubtitle("Subtitle");

        //设置右上角的填充菜单
        toolbar.inflateMenu(R.menu.base_toolbar_menu);
        //设置点击Menu点击事件
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int menuItemId = item.getItemId();
                if (menuItemId == R.id.action_search) {
                    Toast.makeText(ToolbarActivity.this, "R.id.action_search:" + R.id.action_search, Toast.LENGTH_SHORT).show();
                }else if (menuItemId == R.id.action_notification) {
                    Toast.makeText(ToolbarActivity.this, "R.id.action_notification:" + R.id.action_notification, Toast.LENGTH_SHORT).show();
                } else if (menuItemId == R.id.action_item1) {
                    Toast.makeText(ToolbarActivity.this, "R.id.action_item1:" + R.id.action_item1, Toast.LENGTH_SHORT).show();
                } else if (menuItemId == R.id.action_item2) {
                    Toast.makeText(ToolbarActivity.this, "R.id.action_item2:" + R.id.action_item2, Toast.LENGTH_SHORT).show();
                }

                return true;

            }
        });

    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_tool_bar;
    }
}
