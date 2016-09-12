package com.example.echozhou.materialdesigntest.Avtivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;

import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setView();
        ButterKnife.bind(this);
        initView();
    }

    protected abstract void setView();

    protected abstract void initView();

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
        doPendingTransition();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode==KeyEvent.KEYCODE_BACK){
            finish();
            doPendingTransition();
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }

    //切换动画 按后退时不按这个执行（第一个activity退出时的动画 另外一部分时第二个activity进入时的动画） 必须在这个位置或finish()后立刻执行
    private void doPendingTransition(){
        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
    }
}
