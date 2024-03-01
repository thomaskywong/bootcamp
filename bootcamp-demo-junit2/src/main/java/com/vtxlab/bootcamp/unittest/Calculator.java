package com.vtxlab.bootcamp.unittest;

public class Calculator {


  public static String concat(String x, String y) {
    return new StringBuilder(x).append(" ").append(new StringBuilder(y)).toString();
  }

  public static int add(int x, int y) {
    return x + y;
  }

  public static int subtract(int x, int y) {
    return x - y;
  }
  
}
