package Udemy_complete;

public class NumberToWords {

    public static void numberToWords(int number) {
        int lastNum = 0;
//        int temp = number;
        if (number < 0)
            System.out.println("Invalid Value");
        if (number == 0) {
            System.out.println("Zero");
        }

        int temp = reverse(number);
//        System.out.println(temp);
        int digits = getDigitCount(number);
//        System.out.println(digits);
        int tempDigits = getDigitCount(temp);
//        System.out.println(tempDigits);

        while (temp > 0) {
            lastNum = temp % 10;
            temp = temp / 10;


            switch (lastNum) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 0:
                    System.out.println("Zero");
                    break;

            }
        }

        for(int i= tempDigits; i < digits; i++)
            System.out.println("Zero");


    }

    public static int reverse(int number) {
        int neg = 1;
        int lastNum = 0, revNum = 0;
        if (number < 0)
            neg = -1;
        int temp = Math.abs(number);
        while (temp > 0) {
            lastNum = temp % 10;
            temp = temp / 10;
            revNum = (revNum * 10) + lastNum;
        }
//            System.out.println(revNum);
        return revNum * neg;

    }

    public static int getDigitCount(int number) {
        if(number < 0)
            return -1;
        int count = 0;
        do {
            count += 1;
            number = number / 10;
//            System.out.println(count);
        }
        while (number > 0);

        return count;
    }






}
