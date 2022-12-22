package Udemy_complete;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int sum = 0, invNum = 0, temp, neg = 1;
        if (number < 0)
            neg = -1;
        temp = Math.abs(number);
        while (temp > 0) {
            invNum = temp % 10;
            sum = (sum * 10) + invNum;
            temp = temp / 10;
        }
//
//        System.out.println(number + " " + sum * neg);

        if (number == sum * neg) {
            System.out.println("True");
            return true;
        } else
            return false;
    }
}
//    List<Integer> numList = new LinkedList<Integer>();
//    List<Integer> invList = new LinkedList<Integer>();
//
//    String strNumber = String.valueOf(number);
//
//    for(int i = 0; i < strNumber.length(); i++);
//        numList.add()
//
//
//
//    }
//        String strNumber = String.valueOf(number);
//
//        int neg = 1;
//        if( number < 0)
//            neg = -1;
//        int num = number * neg;
//        int invNumber = 0;
//
////        System.out.println(strNumber.length());
//        int length = strNumber.length()-1;
//        for(int i = 1; i <= strNumber.length(); i++){
//            int calc = num % 10;
//            invNumber = invNumber + (int)(calc* (Math.pow(10,length)));
//            num = num / 10;
//            length =  length -1;
//            System.out.println("i " + i + " calc " + calc + " number " +  number + " invNumber " +  invNumber + " length " + length);
//            System.out.println(num + " " + invNumber);
//            System.out.println(num * neg);
//        }
//        if(invNumber == (number * neg))
//            return true;
//        else
//            return false;
//    }
//}