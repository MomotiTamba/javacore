package com.kitcenter.app.classwork.lesson10;


public class Palindrome {
    public boolean isPalindrome(String stringValue) {
        if (stringValue == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder(stringValue);
        sb.reverse();
        return sb.toString().equals(stringValue);
    }

    public boolean isPalindromeString(String stringValue) {
        if (stringValue == null) {
            return false;
        }
        int len = stringValue.length();

        for (int i = 0; i < len / 2; i++) {
            if (stringValue.charAt(i) != stringValue.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
