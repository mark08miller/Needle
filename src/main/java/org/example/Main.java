package org.example;

public class Main {
    public static void main(String[] args) {
        String[] name = {"Link", "needle"};
        String name1 = findNeedle(name);
        System.out.println(name1);
    }
    public static String findNeedle(Object[] haystack) {
        int i = 0;
        while(!String.valueOf(haystack[i]).equals("needle")){
            i++;
        }
        return "found the needle at position " + i;
    }
}
