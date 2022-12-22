package FAANG;

public class Gtest {

/* Assume the titles are in an array of strings. You need to do the
following procedures on it:

    Create a single string by concatenating the strings in the array
    Delete all numeric symbols from the string
    Capitalize the first character of each word in the String

Remember corner cases.
 */
    // Test Cases
    public static void main(String[] args) {
        String[] input = new String[]{"break3ing news5:", "1A 1circle is round!"};
        Gtest.output(input);

        input = new String[]{" ", "Fresh fried fish - fish fresh fried"};
        Gtest.output(input);

        input = new String[]{"2Here2 ", "is", " our STRING"};
        Gtest.output(input);

        input = new String[]{"123 ", "eat;sleep;repeat", " 321"};
        Gtest.output(input);

    }

    public static String output(String[] input) {
        // Create Variables
        String concat = "";
        String[] split;

        // Remove all excess inputs and split
        for (int i = 0; i < input.length; i++) {
            String text = input[i].replaceAll("[0-9]", "").replaceAll(";", "zyx ");
            input[i] = text;
            split = input[i].trim().split("[\\s+]");

            // Make to upper and concat
            if (split[0].length() > 0)
                for (int j = 0; j < split.length; j++) {
                    String capWord = split[j].substring(0, 1).toUpperCase() + split[j].substring(1) + " ";
                    capWord = capWord.replaceAll("zyx ", ";");
                    concat += capWord;
                }
        }
        // Provide result
        System.out.println(concat.trim());
        return concat.trim();
    }
}




