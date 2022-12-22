package LeetCodeBeginner20;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class LongestPalindrome {
    public static void main(String[] args) {
        longestPalindrome("aaba");
        longestPalindrome("abcdefgabcdefg");

    }

    public static int longestPalindrome(String s) {
        int count = 0, charCount = 0, odd = 0;

        // Iterate through string
        while(s.length() > 0) {
            // For each character
            charCount = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == s.charAt(0)){
                    charCount +=1;
                }
            }
            if(charCount %2 != 0)
                odd = 1;
            charCount = (charCount / 2) *2;

            s = s.replaceAll(String.valueOf(s.charAt(0)), "");
            count += charCount;
            System.out.println(s);

        }
        count = count + odd;
        System.out.println(count);
        return count;
    }
}
//        int count = 0, charCount;
//        int odd = 0;
//        HashSet<Character> set = new HashSet<>();
//
//        for( char c : s.toCharArray()){
//
//            // FOR EACH LETTER - CHARACTER COUNT
//            if (!set.contains(c)) {
//                set.add(c);
//                charCount = 0;
//
//                for (int i = 0; i < s.length(); i++) {
//                    if (c == s.charAt(i)) {
//                        charCount += 1;
//                    }
//                }
//
//
//                if (charCount % 2 != 0) {
//                    charCount = charCount / 2 * 2;
//                    odd = 1;
//                }
//
//                count += charCount;
//
//
//
//            }
//
//
//
//
//            // *********************************************************
//        }
//        count = count + odd;
//        System.out.println(count);
//        return count;
//    }
//}