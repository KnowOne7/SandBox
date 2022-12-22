
public class Test {

    // Test Cases
    public static void main(String[] args) {
        String[] passwords = new String[]{"P@sswORD1", "20passWORD20", "PASS6word"};
        String checkString = "4dro6";
        output(passwords, checkString);

    }

    public static String output(String[] passwords, String checkString) {
        // Create Variables
        int numUpp = Integer.parseInt(String.valueOf(checkString.charAt(0)));
        int k = checkString.length() - 1;
        String allDigit = (String.valueOf(checkString.charAt(k)));
        String rev3 = "";

        // Find the last 3 Character in checkString and reverse
            for (int j = k-1; j > 0; j--) {
                rev3 += checkString.charAt(j);
            }

            // Count all the upper case letters in password index
            for( int i = 0; i < passwords.length; i++) {
                int countUpper = 0;

                for (int m = 0; m < passwords[i].length(); m++) {
                    if (Character.isUpperCase(passwords[i].charAt(m))){
                        countUpper += 1;
                    }
                }

                // Check to see if password is acceptable.
                if(((passwords[i].substring(passwords[i].length() -3)) != rev3) &&
                        passwords[i].contains(allDigit) &&
                                (countUpper == numUpp)) {
                    System.out.println(passwords[i]);
                    return passwords[i];
                }

            }
            return null;
        }
}






