package com.chawki.travelonboarding;

import android.os.Bundle;
import android.widget.Toast;

import agency.tango.materialintroscreen.MaterialIntroActivity;

public class MainActivity extends MaterialIntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enableLastSlideAlphaExitTransition(true);



        hideBackButton();
        addSlide(new CustomSlide1());

        addSlide(new CustomSlide2());

        addSlide(new CustomSlide3());


    }
    @Override
    public void onFinish() {
        super.onFinish();
        Toast.makeText(this, "time to do the work ;)", Toast.LENGTH_SHORT).show();
    }
}
