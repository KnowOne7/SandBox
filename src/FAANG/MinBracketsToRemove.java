package FAANG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class MinBracketsToRemove {
    public static void main(String[] args) {
        String a, b, c, d;
        a = "a)bc(d)";
        b= "(ab(c)d";
        c= "))((";
        minBrackats(c);
        minBrackats(a);
        minBrackats(b);

    }

    public static String minBrackats(String s){
        StringBuilder sb = new StringBuilder(s);
        List<String> list = new ArrayList<>();
        String[] split = s.split("");

        Stack<Integer> stack = new Stack<>();
        String joinSplit = Arrays.stream(split).collect(Collectors.joining(""));


//        System.out.println(Arrays.toString(split));
        for( int i = 0; i < split.length; i ++) {
            if(sb.charAt(i) == '('){
                stack.push(i);
            }
            else if (sb.charAt(i) == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    sb.setCharAt(i, '_');
                }
            }

        }
        while(!stack.isEmpty())
            sb.setCharAt(stack.pop(), '_');
        System.out.println(sb);
        System.out.println(sb.toString().replaceAll("_", ""));
        return sb.toString().replaceAll("_", "");

    }
}
