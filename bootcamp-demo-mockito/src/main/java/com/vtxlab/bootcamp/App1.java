package com.vtxlab.bootcamp;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App1 {


    private App2 app2;

    // all argument constructor
    // public App1(App2 app2) {
    //     this.app2 = app2;
    // }

    // Developer A
    // method A call method B + manipulation, then return new value
    // Unit test on whether the + 1000 manipulation can be proceeded correctly
    // test case 1: assume provider(x * 2, y) return 5 -> return 1005
    // test case 2: assume provider(x * 2, y) return 1000 -> return 2000
    // test case 3: assume provider(x * 2, y) return -1 -> return 999
    public int add(int x, int y) { // assert?

        // For Unit Test, we should mock the external call (provider(x * 2, y))
        // because, we don't want the test code of add() method will be changed in the future
        // due to the main code change in other methods
        int result = this.app2.provider(x * 2, y); // unit test: isolate app2.provider()

        // test all possibility of (x > 10 && y < 20)
        // x <= 10, y < 20
        // x <= 10, y >= 20
        // x > 10, y < 20
        // x > 10, y >= 20
       
        // business requirement, agree with user for this logic below
        if (x > 10 && y < 20) {
            return result + 1000;
        }
        return result + 500;

        // assume provider(x * 2, y) return 5, then return 1005
        // assume provider(x * 2, y) return 1000, then return 2000
        // assume provider(x * 2, y) return -1, then return 999

    }
    
    // Developer B
    // public static int provider(int x, int y) {
    // return x + y;
    // }
    

    // Unit Test (test on my single method as an unit)
    // ensure 
    // s.charAt(0) is correct
    // sb.append() can append()
    // sb.toString() is returning correct StringBuilder -> String result
    public String firstCharacters(List<String> strings) {
        StringBuilder sb = new StringBuilder();
        char encoded;
        for (String s : strings) {
            encoded = this.app2.encode(s.charAt(0));
            sb.append(encoded);
        }
        return sb.toString();
    }

    // demo spy
    public int multiply(int x, int y) {
        return this.app2.provider(x,y) + this.app2.provider2(x,y);
    }


}
