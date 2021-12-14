package com.company;

public class CodeStyles {

    private String getName(boolean onRussian) {
        String russkoeImya = "Сергей"; // плохой нейминг - транслитерация
        String englishName = "Sergey";

        if (onRussian) {
            return russkoeImya;
        }
        return englishName;
    }

    private int processSomething(Object somethingComplex) {
        if (somethingComplex == null) {
            return 1;
        }
        int a = 0;
        String s = "test";
        /* много кода
        ...
        ...
        ...
        ...
        ...
        ...
        ...
        ...
        ...
         */
        return 0;
    }
}
