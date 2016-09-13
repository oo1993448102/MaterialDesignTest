package com.example.echozhou.materialdesigntest.Avtivity;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.example.echozhou.materialdesigntest.R;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by EchoZhou on 2016/9/9.
 */
public class FirstActivity extends BaseActivity {

    @BindView(R.id.btn_enter)
    Button btn_enter;

    @Override
    protected void setView() {
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void initView() {
        startAnim();
    }

    private void startAnim() {
//        Animation animation = AnimationUtils.loadAnimation(this, R.anim.btn_go_up);   //视图动画 点击事件位置不变
//        btn_enter.startAnimation(animation);

//        Animator mAnimator = AnimatorInflater.loadAnimator(this, R.animator.btn_go_up);  //属性动画(1) 点击事件随动画位置改变而改变
//        btn_enter.invalidate();
//        mAnimator.setTarget(btn_enter);
//        mAnimator.start();
        ObjectAnimator animator = ObjectAnimator.ofFloat(btn_enter, "translationY", 350.0f, 0.0f);  //属性动画（2）
        animator.setDuration(2500).start();
    }

    @OnClick(R.id.btn_enter)
    void clickEnter(){
        showToast("点击进入");
    }

//    @OnClick(R.id.tv_next)
//    void clickNext(View v){
//        Intent i = new Intent(this,SecondActivity.class);
//        startActivity(i);
//    }
}
