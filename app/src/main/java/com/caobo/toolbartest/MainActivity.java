package com.caobo.toolbartest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends TranslucentBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button toToolbarActivity = (Button) findViewById(R.id.skip_toolbar_activity);

        Button toZhihuActivity = (Button) findViewById(R.id.skip_zhihu_activity);

        toZhihuActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ZhihuActivity.class);
                startActivity(intent);
            }
        });

        toToolbarActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ToolbarActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_main;
    }
}
