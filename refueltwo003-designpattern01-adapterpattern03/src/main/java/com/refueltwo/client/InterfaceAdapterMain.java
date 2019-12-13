package com.refueltwo.client;

import com.refueltwo.adapter.AnimatorListenerAdapter;
import com.refueltwo.operating.Animator;
import com.refueltwo.operating.ValueAnimator;

/**
 * @ClassName InterfaceAdapterMain
 * @See
 * @Author tanji
 * @Date 2019/12/14 0:35
 * @Version V1.0
 **/

public class InterfaceAdapterMain {
    public static void main(String[] args) {
        ValueAnimator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {

            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
        //这时我们只想实现一个方法,就可以用接口适配器类
        ValueAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationStart(Animator animation) {
                //这里就只要实现一个方法了
            }
        });
    }
}
