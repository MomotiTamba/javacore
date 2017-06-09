package com.kitcenter.app.classwork.lesson11;


public class Encoder {

    public String stringEncode(String stringToEncode){
        String plainText = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ abcdefghijklmnopqrstuvwxyz";
        String cypherText = " MNBVCXZ9876LKJHGFDSA543210POIUYTREWQlkjhgfdsamnbvcxzpoiuytrewq";
        StringBuilder sb = new StringBuilder(stringToEncode);

        for (int i = 0; i < sb.length(); i++) {
            for (int j = 0; j < plainText.length(); j++) {
                if(sb.charAt(i) == plainText.charAt(j)){
                    sb.setCharAt(i, cypherText.charAt(j));
                    break;
                }
            }
        }
        System.out.println(sb);
        return sb.toString();
    }
}
