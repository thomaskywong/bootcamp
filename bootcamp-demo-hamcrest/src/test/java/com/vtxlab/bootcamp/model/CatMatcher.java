package com.vtxlab.bootcamp.model;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import com.vtxlab.bootcamp.Animal;
import com.vtxlab.bootcamp.Cat;
import com.vtxlab.bootcamp.Dog;

public class CatMatcher extends TypeSafeMatcher<Animal>{

  @Override
  public void describeTo(Description description) {
    description.appendText("This is not an Animal Object");
  }

  @Override
  protected boolean matchesSafely(Animal item) {
    return item instanceof Cat ;
  }
  
  public static Matcher<Animal> validAnimal() {
    return new CatMatcher();
  }

}
