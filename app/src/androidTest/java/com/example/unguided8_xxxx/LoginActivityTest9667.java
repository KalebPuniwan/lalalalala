package com.example.unguided8_xxxx;


import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class LoginActivityTest9667 {

    @Rule
    public ActivityTestRule<LoginActivity> mActivityTestRule = new ActivityTestRule<>(LoginActivity.class);

    @Test
    public void loginActivityTest9667() {
        ViewInteraction materialButton = onView(
                allOf(withId(R.id.btnLogin), withText("LOGIN"),
                        childAtPosition(
                                allOf(withId(R.id.footer),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                2)),
                                0),
                        isDisplayed()));
        materialButton.perform(click());

        ViewInteraction textInputEditText = onView(
                allOf(withId(R.id.loginNim),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.twNim),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText.perform(replaceText("admin"), closeSoftKeyboard());

        ViewInteraction materialButton2 = onView(
                allOf(withId(R.id.btnLogin), withText("LOGIN"),
                        childAtPosition(
                                allOf(withId(R.id.footer),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                2)),
                                0),
                        isDisplayed()));
        materialButton2.perform(click());

        ViewInteraction textInputEditText2 = onView(
                allOf(withId(R.id.loginNim), withText("admin"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.twNim),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText2.perform(click());

        ViewInteraction textInputEditText3 = onView(
                allOf(withId(R.id.loginNim), withText("admin"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.twNim),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText3.perform(replaceText(""));

        ViewInteraction textInputEditText4 = onView(
                allOf(withId(R.id.loginNim),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.twNim),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText4.perform(closeSoftKeyboard());

        ViewInteraction textInputEditText5 = onView(
                allOf(withId(R.id.loginPassword),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.twPassword),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText5.perform(replaceText("admin"), closeSoftKeyboard());

        ViewInteraction materialButton3 = onView(
                allOf(withId(R.id.btnLogin), withText("LOGIN"),
                        childAtPosition(
                                allOf(withId(R.id.footer),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                2)),
                                0),
                        isDisplayed()));
        materialButton3.perform(click());

        ViewInteraction textInputEditText6 = onView(
                allOf(withId(R.id.loginNim),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.twNim),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText6.perform(replaceText("admins"), closeSoftKeyboard());

        ViewInteraction materialButton4 = onView(
                allOf(withId(R.id.btnLogin), withText("LOGIN"),
                        childAtPosition(
                                allOf(withId(R.id.footer),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                2)),
                                0),
                        isDisplayed()));
        materialButton4.perform(click());

        ViewInteraction textInputEditText7 = onView(
                allOf(withId(R.id.loginNim), withText("admins"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.twNim),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText7.perform(click());

        ViewInteraction textInputEditText8 = onView(
                allOf(withId(R.id.loginNim), withText("admins"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.twNim),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText8.perform(replaceText("admin"));

        ViewInteraction textInputEditText9 = onView(
                allOf(withId(R.id.loginNim), withText("admin"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.twNim),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText9.perform(closeSoftKeyboard());

        ViewInteraction materialButton5 = onView(
                allOf(withId(R.id.btnLogin), withText("LOGIN"),
                        childAtPosition(
                                allOf(withId(R.id.footer),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                2)),
                                0),
                        isDisplayed()));
        materialButton5.perform(click());
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
