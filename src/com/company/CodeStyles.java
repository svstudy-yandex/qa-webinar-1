package com.company;

public class CodeStyles {

    private String getName(boolean onRussian) {
        String russkoeImya = "Сергей"; // плохой нейминг - транслитерация
        String englishName = "Sergey";

        if (onRussian) {
            return russkoeImya;
        } else { // лишний else
            return englishName;
        }
    }

    private int processSomething(Object somethingComplex) {
        if (somethingComplex != null) { // лучше инвертировать проверку
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
        return 1;
    }
}
