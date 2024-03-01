package com.vtxlab.bootcamp.model;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class PhoneNumberMatcher extends TypeSafeMatcher<String> {

  @Override
  public void describeTo(Description description) {
    description.appendText("Invalid Phone Number.");
  }

  @Override
  protected boolean matchesSafely(String item) {
    return item.matches("^[2]+\\d{7}|[3]+\\d{7}|[5]+\\d{7}|[6]+\\d{7}|[9]+\\d{7}$");
  }

  public static Matcher<String> validPhoneNumber() {
    return new PhoneNumberMatcher();
  }
  
}
