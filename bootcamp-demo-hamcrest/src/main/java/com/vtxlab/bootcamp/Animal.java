package com.vtxlab.bootcamp;

public interface Animal {
  
  static Animal get(int ind) {
    return ind % 2 == 0 ? new Cat() : new Dog();
  }
  
}
