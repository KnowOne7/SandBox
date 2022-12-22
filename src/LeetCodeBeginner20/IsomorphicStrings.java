package LeetCodeBeginner20;

/*
Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be
replaced to get t.

All occurrences of a character must be replaced with another character
while preserving the order of characters. No two characters may map to
the same character, but a character may map to itself.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicStrings {
    public static void main(String[] args) {
        isIsomorphic("egg", "add"); //true
        isIsomorphic("foo", "bar"); //false
        isIsomorphic("paper", "title"); //true
        isIsomorphic("aaaaabbbbbcccccdddddeeeee","pppppqqqqqrrrrrsssssttttt");
        isIsomorphic("abcdefghijklmnopqrstuvwxyzva", "abcdefghijklmnopqrstuvwxyzck");

    }


    public static boolean isIsomorphic(String s, String t) {
        System.out.println("s " + Arrays.toString(getPattern(s)));
        System.out.println("t " + Arrays.toString(getPattern(t)));

          if(Arrays.equals((getPattern(s)), (getPattern(t)))){
            System.out.println("True");
            return true;
        }
        System.out.println("False");
        return false;
    }


    public static int[] getPattern(String input) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int [] a = new int[input.length()];

        for(int i = 0; i < input.length(); i ++){
            char c = input.charAt(i);
            if (!hm.containsKey(c)) {
                hm.put(c, i);
                a[i] = i;
            } else {
                a[i]  = (hm.get(c));
            }
        }
        return a;
    }
}

