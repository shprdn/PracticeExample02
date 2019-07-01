package com.stackroute.junitdemo;

public class Factorial {
    public String intoutofrange() {

        int i = 1, fact = 1;
        String s = "";

        while (true) {
            fact = fact * i;
            s = s + "The factorial of " + i + " is " + fact + "\n";
            if (Integer.MAX_VALUE / fact < i + 1) {
                s += "Factorial of " + (i + 1) + " is out of range";
                break;
            }
            i++;

        }
        return s;
    }

    public String longoutofrange() {

        int i = 1;
        long fact = 1;
        String s = "";

        while (true) {
            fact = fact * i;
            s = s + "The factorial of " + i + " is " + fact + "\n";
            if (Long.MAX_VALUE / fact < i + 1) {
                s += "Factorial of " + (i + 1) + " is out of range";
                break;
            }
            i++;

        }
        return s;
    }
}