package com.vtxlab.bootcamp.model;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class AmountMatcher extends TypeSafeMatcher<String> {

  @Override
  public void describeTo(Description description) {
    // TODO Auto-generated method stub
    description.appendText("Invalid double value string");
  }

  @Override
  protected boolean matchesSafely(String item) {
    // TODO Auto-generated method stub
    return item.matches("^[0]|([1-9]+\\d*)|([0]\\.\\d+)|([1-9]+\\d*+\\.\\d+)$");
  }

  public static Matcher<String> validAmount() {
    return new AmountMatcher();
  }
  
}
