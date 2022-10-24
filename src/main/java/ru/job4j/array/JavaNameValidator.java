package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        if (name.isEmpty() || (Character.isUpperCase(name.codePointAt(0)) || Character.isDigit(name.codePointAt(0)))) {
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (isSpecialSymbol(name.codePointAt(i)) || isUpperLatinLetter(name.codePointAt(i)) || isLowerLatinLetter(name.codePointAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}
