package FAANG;

public class TimeConverter {

    /* convert time from 12 to 24 hours format.

    Assume the skeleton class TimeConverter is given. You need to implement the
    function ConvertFrom12To24HoursFormat(inputTime). This function parses the
    given input string (input Time in 12 hours format) and converts the time to
    24 hour format.

    The TimeConverter class takes a string(Input Time in 12 horus format) and
    calls the  ConvertFrom12To24HoursFormat function to convert the time to
    24 hours format.

    Two examples:

    input: inputTime = 12:00 am
    output: 0:00

    input: inputTime = 1:05 pm
    output: 13:05
     */

    public static void main(String[] args) {
        ConvertFrom12To24HoursFormat("12:00 am");
        ConvertFrom12To24HoursFormat("1:05 pm");
        ConvertFrom12To24HoursFormat("4:20 PM");
        ConvertFrom12To24HoursFormat("7:20 aM");

    }

    public static String ConvertFrom12To24HoursFormat(String inputTime) {
        // create variables split[] : " "
        // split am and pm.
        // am = 0; pm = 12
        String[] split;
        String concatTime = "";

        split = inputTime.trim().split("[\\s+\\:]");

        int suffix = Integer.parseInt(split[2].trim().toLowerCase()
                .replaceAll("pm", "12")
                .replaceAll("am", "0"));

        System.out.println(split[0].length());

//        System.out.println(suffix);
//
//        split[2] = split[2].replaceAll("pm", "12")
//                 .replaceAll("am", "0")
//                 .replaceAll("PM", "12")
//                 .replaceAll("AM", "0");

        split[0] = split[0].replaceAll("12", "0");
//        if(split[0].trim() == "12")
//            split[0] = "0";

        split[0] = String.valueOf(Integer.parseInt(split[0])+ suffix);

        concatTime= split[0] + ":" + split[1];

        if(concatTime.length() < 5){
            concatTime = "0"+ concatTime;
        }

        System.out.println(concatTime);
        return concatTime;
    }
}
