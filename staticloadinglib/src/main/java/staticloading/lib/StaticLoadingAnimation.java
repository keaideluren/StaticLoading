package staticloading.lib;

import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;

/**
 * Created by Administrator 可爱的路人 on 2017/5/9.
 * 菊花一张图转得像帧动画一样
 */

public class StaticLoadingAnimation extends RotateAnimation {

    /**
     * @param petalCount 菊花的花瓣数量
     */
    public StaticLoadingAnimation(final int petalCount) {
        super(0f, 360f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        setInterpolator(new Interpolator() {
            @Override
            public float getInterpolation(float input) {
                return (float)(int) (input * petalCount) / petalCount;
            }
        });
        setRepeatMode(Animation.RESTART);
        setRepeatCount(Animation.INFINITE);
        setDuration(800);
    }
}

