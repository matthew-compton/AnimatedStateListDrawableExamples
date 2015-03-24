package com.ambergleam.animatedstatelistdrawableexample;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;


public class MainActivity extends Activity {

    @InjectView(R.id.heart_animation_list_emptying) ImageView mEmptying;
    @InjectView(R.id.heart_animation_list_filling) ImageView mFilling;
    @InjectView(R.id.heart_animated_selector) ImageView mSelector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
    }

    @OnClick(R.id.heart_animation_list_emptying)
    public void onClickEmptying() {
        ((AnimationDrawable) mEmptying.getBackground()).start();
    }

    @OnClick(R.id.heart_animation_list_filling)
    public void onClickFilling() {
        ((AnimationDrawable) mFilling.getBackground()).start();
    }

    @OnClick(R.id.heart_animated_selector)
    public void onClickSelector() {
        mSelector.setActivated(!mSelector.isActivated());
    }

}