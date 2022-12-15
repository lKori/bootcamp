package main.java;

import java.util.*;

public class test {
    public static void main(String[] args) {
        String str = "dsafdasfffffsgaaaaabbbscccdd";

        String result = "";

        int count = 0;
        String s = "";
        for(int i = 0; i < str.length(); i++) {
            s = String.valueOf(str.charAt(i));
            count = repeatChar(str, str.charAt(i), i);
            if(count >= 3) {
                result = result + String.valueOf(count) + s;
                i += count;
                count = 0;
            } else {
                result = result + String.valueOf(str.charAt(i));
                count = 0;
            }
        }

//        return result;
        System.out.println(result);
    }

    public static int repeatChar(String str, char c, int idx) {
        String s = "";
        if(str.length() >= idx + 1) {
            s = String.valueOf(str.charAt(idx + 1));
        }
        int count = 0;
        do {
            count++;
            idx++;
            s = String.valueOf(str.charAt(idx + 1));
        }while(String.valueOf(c).equals(s));

        return count + 1;
    }
}
