package com.mudhut.software.payoneerchallenge;

import android.view.View;

import org.hamcrest.Matcher;

public class EspressoTestMatchers {
    public static Matcher<View> withDrawable(final int resourceId) {
        return new DrawableMatcher(resourceId);
    }
}
