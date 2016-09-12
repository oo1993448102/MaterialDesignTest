package com.example.echozhou.materialdesigntest.Avtivity;

import android.content.Intent;
import android.widget.TextView;

import com.example.echozhou.materialdesigntest.R;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by EchoZhou on 2016/9/9.
 */
public class SecondActivity extends BaseActivity {

    @BindView(R.id.tv_second)
    TextView tv_second;

    @Override
    protected void setView() {
        setContentView(R.layout.act_second);
    }

    @Override
    protected void initView() {

    }

    @OnClick(R.id.tv_second)
    void clickNext(){
        Intent i = new Intent(this,FirstActivity.class);
        startActivity(i);
    }
}
