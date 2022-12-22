package FAANG;

import java.util.HashMap;
import java.util.Stack;

public class ValidParrenthesis {

    public static void main(String[] args) {
        String a, b, c, d, e;
        a = "{([])}";
        b = "{([])]";
        c = "{([)]}";
        d = "";
        e = "([}])";

        isValid(a);
        isValid(b);
        isValid(c);
        isValid(d);
        isValid(e);


    }

    public static boolean isValid(String s){
//        Stack<Integer> stack = new Stack<>();
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('(',')');
        map.put('[',']');

        if(s.length() == 0) {
            System.out.println("Empty Set");
            return true;
        }

        for(int i = 0; i < s.length(); i ++) {
            if (s.charAt(i) =='(' || s.charAt(i) =='[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                char leftBrace = stack.pop();
                if (map.get(leftBrace) != s.charAt(i) ) {
                    System.out.println("False");
                    return false;
                }
            }

        }
        System.out.println(stack.isEmpty());
        return stack.isEmpty();
    }

}
