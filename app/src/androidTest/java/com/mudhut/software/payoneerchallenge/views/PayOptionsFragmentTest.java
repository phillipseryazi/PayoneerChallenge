package com.mudhut.software.payoneerchallenge.views;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.fragment.app.testing.FragmentScenario;
import androidx.lifecycle.Lifecycle;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.mudhut.software.payoneerchallenge.R;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class PayOptionsFragmentTest {
    FragmentScenario<PayOptionsFragment> scenario;

    @Before
    public void setUp() {
        scenario = FragmentScenario.launchInContainer(PayOptionsFragment.class);
        scenario.moveToState(Lifecycle.State.STARTED);
    }

    @Test
    public void testRecyclerViewIsDisplayed() {
        onView(withId(R.id.payment_options_recyclerview)).check(matches(isDisplayed()));
    }

    @Test
    public void testProgressBarIsDisplayed() {
        onView(withId(R.id.payment_options_progressbar)).check(matches(isDisplayed()));
    }
}
