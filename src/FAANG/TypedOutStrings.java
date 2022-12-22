package FAANG;

public class TypedOutStrings {

    public static void main(String[] args) {
        String a = "ab#z";
        String b = "az#z";
        String c = "ac";
        String d = "aaa##d";

        compare(a,b);
        compare(c,d);

    }

    public static String removePound (String input){
        String output = "";
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i)!= '#')
                output += input.charAt(i);
            else
                output = output.substring(0, output.length()-1);
        }
        return output;
    }

    public static boolean compare(String a, String b){
        String A = removePound(a);
        String B = removePound(b);

        if(A.length() != B.length()) {
            System.out.println("False");
            return false;
        }
        for(int i = 0; i < A.length(); i++)
            if(A.charAt(i) != B.charAt(i) ) {
                System.out.println("False");
                return false;
            }

        System.out.println("True");
        return true;
    }


}
