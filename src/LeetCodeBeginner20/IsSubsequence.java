package LeetCodeBeginner20;

/*
Given two strings s and t, return true if s is a subsequence of t, or
false otherwise.

A subsequence of a string is a new string that is formed from the
original string by deleting some (can be none) of the characters
without disturbing the relative positions of the remaining characters.
(i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 */

public class IsSubsequence {
    public static void main(String[] args) {
        isSubsequence("abc", "ahbgdc"); //true
        isSubsequence("abc", "abcghfyc"); //true
        isSubsequence("axc", "ahbgdc"); //false
//        isSubsequence("abc", "ahbgdc"); //true
        isSubsequence("", "ahbgdc"); //true
        isSubsequence("", ""); //true

    }

    public static boolean isSubsequence(String s, String t) {
        if(s.equals(t)){
            System.out.println("True");
            return true;
        }
        for(int i = 0; i < t.length(); i ++)
            if(s.charAt(0) == t.charAt(i)) {
                s = s.substring(1);
                if(s.length() == 0){
                    System.out.println("true");
                    return true;
                }
        }
        System.out.println("False");
    return false;
    }
}
