package FAANG;

import java.util.List;

public class FindAllAnagramsInString {
    public static void main(String[] args) {
//        String s = "cbaebabacd";

        String p = "abcaaabcaaaabc";
        String s = "abc";

        findAnagrams(s,p);

    }

    private static List<Integer> findAnagrams(String s, String p) {
//        String d1 = s.sort();
        List<Integer> results = null;
        for(int i = 0; i< p.length()-4; i ++){
            String pSub = p.substring(i, i+3);
            if (pSub == s){
                results.add(i);
            }


        }
        System.out.println(results);
        return results;
    }
}
