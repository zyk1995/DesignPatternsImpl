package com.zyk.command;

public class Solution {
    public static String reverseVowels(String s) {
        char[] cs = s.toCharArray();
        int left = 0;
        int right = cs.length - 1;
        boolean flag = true;
        while(left <= right) {

            if(!isVowel(cs[left])){
                left++; flag = false;
            }
            if(!isVowel(cs[right])){
                right--; flag = false;
            }

            if(flag) {
                char t = cs[left];
                cs[left] = cs[right];
                cs[right] = t;
                left++;
                right--;

            }
            flag = true;
        }

        return new String(cs);
    }


    public static boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'w'){
            return true;
        }
        else if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'W'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(reverseVowels("Was it felt? I had a hit left, I saw."));
    }

}
