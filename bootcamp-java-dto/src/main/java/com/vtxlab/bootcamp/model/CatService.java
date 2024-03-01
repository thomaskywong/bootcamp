package com.vtxlab.bootcamp.model;

import java.util.ArrayList;
import java.util.List;

public class CatService {

  public List<Cat> getCats() {

    return new ArrayList<Cat>(
        List.of(new Cat("Thomas", 1), new Cat("Bobo", 2), new Cat("Rambo", 3)));

  }

  public List<Cat> getCatList(int index) throws Exception {

    List<Cat> cats = new ArrayList<>();

    // Nothing to do on exception. well checked and not possible to have an exception
    try {
      cats = callJPH();
    } catch (Exception ex) {
      throw new Exception();
    }

    return cats;
  }

  public Cat getCatList2(int index) throws Exception {
    // Check if index is value
    if (index < 0)
      throw new IllegalArgumentException();

    List<Cat> cats = new ArrayList<>();

    // Check if database is available
    try {
      cats = callJPH();

      // if index
      if (index >= cats.size())
        throw new IllegalArgumentException();

      if (cats != null && cats.size() != 0)
        return cats.get(index);

    } catch (Exception ex) {
      throw new Exception();
    }

    return null;

  }

  public List<Cat> callJPH() throws Exception {
    return List.of(new Cat("John", 3), new Cat("Sally", 10));
  }

}


