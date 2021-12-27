package com.mudhut.software.payoneerchallenge.views;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static com.mudhut.software.payoneerchallenge.EspressoTestMatchers.withDrawable;

import androidx.fragment.app.testing.FragmentScenario;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.Navigation;
import androidx.navigation.testing.TestNavHostController;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.google.common.truth.Truth;
import com.mudhut.software.payoneerchallenge.R;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(AndroidJUnit4.class)
public class HomeFragmentTest {
    FragmentScenario<HomeFragment> scenario;
    TestNavHostController navController;

    @Before
    public void setUp() {
        scenario = FragmentScenario.launchInContainer(HomeFragment.class);
        scenario.moveToState(Lifecycle.State.STARTED);

        navController = new TestNavHostController(ApplicationProvider.getApplicationContext());
    }

    @Test
    public void testPayHereButton() {
        onView(withId(R.id.pay_here_button)).check(matches(isDisplayed()));

        scenario.onFragment(homeFragment -> {
            navController.setGraph(R.navigation.nav_graph);
            Navigation.setViewNavController(homeFragment.requireView(), navController);
        });
        onView(withId(R.id.pay_here_button)).perform(click());
        Truth.assertThat(navController.getCurrentDestination().getId()).isEqualTo(R.id.payOptionsFragment);
    }

    @Test
    public void testPayoneerImageView() {
        onView(withId(R.id.payoneer_imageview)).check(matches(isDisplayed()));
        onView(withId(R.id.payoneer_imageview)).check(matches(withDrawable(R.drawable.payoneer_logo)));
    }

}
