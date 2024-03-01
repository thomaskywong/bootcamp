package com.vtxlab.bootcamp.model;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class EmailMatcher extends TypeSafeMatcher<String> {

  @Override
  public void describeTo(Description description) {
    description.appendText("Invalid email address format.");
  }

  @Override
  protected boolean matchesSafely(String item) {

    // ^ means start of string, $ means end of string, {2,} means at least 2 characters

    return item.matches("^[a-zA-Z0-9_.-]+[a-zA-Z0-9]+\\@[a-zA-Z0-9-]+\\.[a-z|A-Z]{2,}$");  
  }

    public static Matcher<String> validEmailAddress() {
    return new EmailMatcher();
  }
  
}
