package com.example.star.viewanimatordemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView alphaView;
    TextView contentView;
    TextView rotateView;
    TextView translateView;
    @NonNull
    private View.OnClickListener mAlphaOnclickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            AlphaAnimation alphaAnimation=new AlphaAnimation(0,1);//alpha 渐变
            alphaAnimation.setDuration(1000);
            contentView.startAnimation(alphaAnimation);
        }
    };
    @NonNull
    private View.OnClickListener mRotateOnClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            RotateAnimation rotateAnimation=new RotateAnimation(0,360,RotateAnimation.RELATIVE_TO_SELF,0.5f, Animation.RELATIVE_TO_SELF,0.5f);//旋转效果
            rotateAnimation.setDuration(1000);
            contentView.startAnimation(rotateAnimation);
        }
    };
    @NonNull
    private View.OnClickListener mTranslateOnClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TranslateAnimation translateAnimation =new TranslateAnimation(0,200,0,300);
            translateAnimation.setDuration(1000);
            contentView.startAnimation(translateAnimation);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alphaView= (TextView) findViewById(R.id.alpha_view);
        contentView= (TextView) findViewById(R.id.content_view);
        rotateView= (TextView) findViewById(R.id.rotate_view);
        translateView = (TextView) findViewById(R.id.translate_view);
        alphaView.setOnClickListener(mAlphaOnclickListener);
        rotateView.setOnClickListener(mRotateOnClickListener);
        translateView.setOnClickListener(mTranslateOnClickListener);
    }
}
