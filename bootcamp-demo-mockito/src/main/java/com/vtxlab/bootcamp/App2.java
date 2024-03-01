package com.vtxlab.bootcamp;

public class App2 {
  
    // Developer B

    public char encode(char c) {
        return (char) (c % 7 * 100 % 26 + 65);  // (0 - 25) + 65 -> [65, 90] or [A, Z]
    }

    public int provider(int x, int y) {
        return x/y;
    }

    public int provider2(int x, int y) {
        return x * y;
    }


}
