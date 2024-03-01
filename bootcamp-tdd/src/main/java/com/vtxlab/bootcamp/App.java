package com.vtxlab.bootcamp;

/**
 * Hello world!
 *
 */
public class App 
{
    private String base;

  
    public String concat(String s) {
        if (s == null || this.base == null) {
            throw new IllegalArgumentException();
        }
        return this.base.concat(s);
    }

    public String getBase() {
        return this.base;
    }

    public void setBase(String base) {
        this.base = base;
    }  


}
