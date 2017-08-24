package com.chawki.travelonboarding;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import agency.tango.materialintroscreen.SlideFragment;

/**
 * Created by DEV-PC on 24/08/2017.
 */

class CustomSlide3 extends SlideFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_custom_slide3, container, false);
        final Typeface helvetica = Typeface.createFromAsset(getActivity().getAssets(), "Helvetica-Rounded-LT-Bold.ttf");
        TextView title = (TextView) view.findViewById(R.id.title);
        title.setTypeface(helvetica);
        final Typeface bariol = Typeface.createFromAsset(getActivity().getAssets(), "Bariol-Regular.ttf");
        TextView text = (TextView) view.findViewById(R.id.text);
        text.setTypeface(helvetica);
        return view;
    }

    @Override
    public int backgroundColor() {
        return R.color.custom_slide_background;
    }

    @Override
    public int buttonsColor() {
        return R.color.unselected;
    }
}
