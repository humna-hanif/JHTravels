//Authors: Julia Woeste and Humna Hanif
//SER210
//May 4th 2022
//Instrumental Testing of Application
package edu.quinnipiac.ser210.jhtravels;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.hasToString;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.junit.Assert.*;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {


    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testApp() {
        onView(withId(R.id.continueBtn)).perform(click());
        onView(withId(R.id.locSpinner)).perform(click());
        onData(allOf(is(instanceOf(String.class)),is("Dubai, UAE"))).perform(click());
        onView(withId(R.id.enterBtn)).perform(click());
        onView(withId(R.id.locBtn)).perform(click());
        onView(withId(R.id.locationTitle)).check(matches(withText("Dubai, UAE")));
        onView(withId(R.id.back)).perform(click());
        onView(withId(R.id.hotelBtn)).perform(click());
        onView(withId(R.id.back)).perform(click());
        onView(withId(R.id.resturantBtn)).perform(click());
        onView(withId(R.id.back)).perform(click());
        onView(withId(R.id.back)).perform(click());
        onView(withId(R.id.back)).perform(click());
        onView(withId(R.id.settings)).perform(click());
        onView(withId(R.id.settings)).perform(click());
        onView(withId(R.id.settings)).perform(click());
        onView(withId(R.id.settings)).perform(click());



    }

}