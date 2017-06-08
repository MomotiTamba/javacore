package com.kitcenter.app.classwork.lesson10;


public class Palindrome {

    private boolean isStringCorrect(String stringValue) {
        if (stringValue == null || stringValue.isEmpty() || stringValue.length() < 2) {
            return false;
        }
        return true;
    }

    public boolean isPalindromeString(String stringValue) {
        if (isStringCorrect(stringValue)) {
            String stringValueReplaceAllSign = stringValue.toLowerCase().replaceAll("\\W", "");
            int len = stringValueReplaceAllSign.length();
            for (int i = 0; i < len / 2; i++) {
                if (stringValueReplaceAllSign.charAt(i) != stringValueReplaceAllSign.charAt(len - i - 1)) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    public boolean isPalindromeBuilder1(String stringValue) {
        if (isStringCorrect(stringValue)) {
            StringBuilder sb = new StringBuilder(stringValue.toLowerCase().trim());
            sb.reverse();
            return sb.toString().equals(stringValue.toLowerCase());
        } else {
            return false;
        }
    }

    public boolean isPalindromeBuilder2(String stringValue) {
        if (isStringCorrect(stringValue)) {
            return stringValue.replaceAll("\\W", "")
                    .equalsIgnoreCase(new StringBuilder(stringValue.replaceAll("\\W", ""))
                            .reverse().toString());
        } else {
            return false;
        }
    }

    public boolean isPalindromeReverse1(String stringValue) {
        if (isStringCorrect(stringValue)) {
            String reverse = "";
            int num = stringValue.length() - 1;
            for (int i = stringValue.length(); i >= 0; i--) {
                reverse += stringValue.charAt(num);
                num--;
            }
            return reverse.equalsIgnoreCase(stringValue);
        } else {
            return false;
        }
    }

    public boolean isPalindromeReverse2(String stringValue) {
        if (isStringCorrect(stringValue)) {
            String reverse = "";
            for (int i = stringValue.length() - 1; i >= 0; i--) {
                reverse += stringValue.substring(i, i + 1);
            }
            return reverse.equalsIgnoreCase(stringValue);
        } else {
            return false;
        }
    }
}