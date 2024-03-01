package com.vtxlab.bootcamp.model;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

// Can use customized Matcher for reusing logic checking
public class UppercaseStringMatcher extends TypeSafeMatcher<String> {

  // MUST KNOW
  // Pass by reference

  // Show a text when matchesSafely method return false
  @Override
  public void describeTo(Description description) {

    description.appendText("The string should contain upper case only.");

  }

  // define matcher
  @Override
  protected boolean matchesSafely(String item) {

    // regular expression - String pattern description
    // Check if the string characters matches with A-A
    return item.matches("[A-Z]+");

  }

  public static Matcher<String> containsUppercaseOnly() {
    return new UppercaseStringMatcher();
  }

}
