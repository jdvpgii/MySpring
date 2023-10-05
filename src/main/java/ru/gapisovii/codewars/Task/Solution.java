package ru.gapisovii.codewars.Task;

public class Solution {
    public static String repeatStr(final int repeat, final String string) {
        String str = "";
        for (int i = 0; i < repeat; i++) {
            str += string;
        }
        return str;
    }

//    static String repeatStr(int repeat, String string) {
//        return string.repeat(repeat);
//    }
}
