package com.refueltwo.operating;

/**
 * @ClassName Animator
 * @See
 * @Author tanji
 * @Date 2019/12/14 0:32
 * @Version V1.0
 **/

public class Animator {
    public static interface AnimatorListener {
        void onAnimationStart(Animator animation);

        void onAnimationEnd(Animator animation);

        void onAnimationCancel(Animator animation);

        void onAnimationRepeat(Animator animation);
    }

}
