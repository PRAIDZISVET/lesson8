package com.itacademy.lesson8;

public class Outer {

    private String value;

    public Outer(String value) {
        this.value = value;
    }

    public static class Inner {

        private String value = "inner";
        public void print () {
            Outer outer = new Outer("Outer");
            System.out.println(outer.value);
        }
    }
}
