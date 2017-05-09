package com.luren;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import staticloading.lib.StaticLoadingAnimation;

public class MainActivity extends AppCompatActivity {

    private  StaticLoadingAnimation staticLoadingAnimation1;
    private  StaticLoadingAnimation staticLoadingAnimation2;
    private  StaticLoadingAnimation staticLoadingAnimation3;
    private  StaticLoadingAnimation staticLoadingAnimation4;
    private  StaticLoadingAnimation staticLoadingAnimation5;
    private ImageView iv1;
    private ImageView iv2;
    private ImageView iv3;
    private ImageView iv4;
    private ImageView iv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        iv1 = (ImageView) findViewById(R.id.iv_loading_1);
        iv2 = (ImageView) findViewById(R.id.iv_loading_2);
        iv3 = (ImageView) findViewById(R.id.iv_loading_3);
        iv4 = (ImageView) findViewById(R.id.iv_loading_4);
        iv5 = (ImageView) findViewById(R.id.iv_loading_5);
        staticLoadingAnimation1 = new StaticLoadingAnimation(14);
        staticLoadingAnimation2 = new StaticLoadingAnimation(12);
        staticLoadingAnimation3 = new StaticLoadingAnimation(12);
        staticLoadingAnimation4 = new StaticLoadingAnimation(8);
        staticLoadingAnimation5 = new StaticLoadingAnimation(14);
        //一瓣菊花100毫秒比较合适
        staticLoadingAnimation1.setDuration(1400);
        staticLoadingAnimation2.setDuration(1200);
        staticLoadingAnimation3.setDuration(1200);
        staticLoadingAnimation4.setDuration(800);
        staticLoadingAnimation5.setDuration(1400);

    }

    public void startRound(View view) {

        iv1.startAnimation(staticLoadingAnimation1);
        iv2.startAnimation(staticLoadingAnimation2);
        iv3.startAnimation(staticLoadingAnimation3);
        iv4.startAnimation(staticLoadingAnimation4);
        iv5.startAnimation(staticLoadingAnimation5);

    }
}
