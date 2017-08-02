package com.bwie.app1505d;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * 主界面
 */
public class MainActivity extends AppCompatActivity {

    TextView hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        feature1();



    }

    /**
     * 这是第一个功能
     */
    private void feature1() {
        hello = (TextView) findViewById(R.id.hello);
        hello.setText("这是第一个功能");
    }
}
