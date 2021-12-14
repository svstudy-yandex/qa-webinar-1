package com.company;

public class BooleanHacks {
    public static void main(String[] args) {
        // !(a && b)            <-> !a || !b
        // !(a || b)            <-> !a && !b
        // (a && b) || (a && c) <-> a && (b || c)
        // (a || b) && (a || c) <-> a || (b && c)
        // !!a                  <-> a

        // запускаем calculate со всем возможными значениями
        boolean[] boolValues = new boolean[]{true, false};
        for (boolean a : boolValues) {
            for (boolean b : boolValues) {
                for (boolean c : boolValues) {
                    System.out.println(calculate(a, b, c));
                }
            }
        }
    }

    public static boolean calculate(boolean a,  boolean b, boolean c) {
        boolean res1 = !(!a && !b) ; // можно упростить до a || b
        boolean res2 = (a && b) || (a && c); // можно упростить до a && (b || c)
        return !!res1 && res2; // можно упростить до res1 && res2
    }
}
