package com.kitcenter.app.classwork.lesson10;


public class Palindrome {

    public boolean isStringExist(String stringValue) {
        if (stringValue == null) {
            return false;
        }
        if (stringValue == " ") {
            return false;
        }
        return true;
    }

    public boolean isPalindromeString(String stringValue) {
        isStringExist(stringValue);
        String stringValueReplaceAllSign = stringValue.toLowerCase().replaceAll("\\W", "");
        int len = stringValueReplaceAllSign.length();
        for (int i = 0; i < len / 2; i++) {
            if (stringValueReplaceAllSign.charAt(i) !=stringValueReplaceAllSign.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindromeBuilder1(String stringValue) {
        isStringExist(stringValue);
        StringBuilder sb = new StringBuilder(stringValue.toLowerCase());
        sb.reverse();
        return sb.toString().equals(stringValue.toLowerCase());
    }

    public boolean isPalindromeBuilder2(String stringValue) {
        isStringExist(stringValue);
        return stringValue.replaceAll("\\W", "")
                .equalsIgnoreCase(new StringBuilder(stringValue.replaceAll("\\W", ""))
                        .reverse().toString());
    }

    public boolean isPalindromeReverse1(String stringValue) {
        isStringExist(stringValue);
        String reverse = "";
        int num = stringValue.length() - 1;
        for (int i = stringValue.length(); i >= 0; i--) {
            reverse += stringValue.charAt(num);
            num--;
        }
        return reverse.equalsIgnoreCase(stringValue);
    }

    public boolean isPalindromeReverse2(String stringValue) {
        isStringExist(stringValue);
        String reverse = "";
        for (int i = stringValue.length() - 1; i >= 0; i--) {
            reverse += stringValue.substring(i, i + 1);
        }
        return reverse.equalsIgnoreCase(stringValue);
    }
}
