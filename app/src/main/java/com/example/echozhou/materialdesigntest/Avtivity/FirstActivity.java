package com.example.echozhou.materialdesigntest.Avtivity;

import android.content.Intent;

import com.example.echozhou.materialdesigntest.R;

import butterknife.OnClick;

/**
 * Created by EchoZhou on 2016/9/9.
 */
public class FirstActivity extends BaseActivity {
    @Override
    protected void setView() {
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void initView() {

    }

    @OnClick(R.id.tv_next)
    void clickNext(){
        Intent i = new Intent(this,SecondActivity.class);
        startActivity(i);
    }
}
