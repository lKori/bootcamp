package main.java;

import java.lang.reflect.Array;
import java.util.*;

public class test {
    public static void main(String[] args) {
        int base = 5;
        int exponent = 22;

        long result = base;

        for(int i = 1; i < exponent; i++) {
            long moded = result % 94906249;
            result = moded * base;
        }

        result = result % 94906249;

        System.out.println(result);
    }
}
