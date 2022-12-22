package FAANG;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 1)
            return -1;
        int greatestPrime = 3;
        boolean flag = false;
        for (int i = 3; i <= number / 2; i++) {
            while (number % i == 0) {
                greatestPrime = i;
                flag = true;
                break;
                // number = number / i;
            }
        }
        if (!flag)
            greatestPrime = number;
        return greatestPrime;
    }
}


////            System.out.println(i + "  " + halfNum);
//            boolean flag = false;
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
////                    System.out.println("Is Not Prime");
//                    flag = true;
//                    break;
//                }
//            }
//            if (!flag) {
//                lP = i;
//
//            }
//        }
//        System.out.println(lP);
//        return lP;
//    }
//}

//    public static void getPrime(int num) {
//        int prime = 2;
//        boolean flag = false;
//        for(int i = 2; i < num/2; i++) {
//            if (num % i == 0) {
//                System.out.println("Is Not Prime");
//                flag = true;
//                break;
//            }
//        }
//        if(!flag)
//            System.out.println(num+ " is a prime number");
//        if(flag)
//            System.out.println(num+ " is NOT Prime");
//        }
//
//    }
//
//
//
//
////            if(halfNum % i == 0)
////                // I is prime
////
////
////
//
//
//
//            for(int j = 1; j < = i; j++)
//                if(j % i == 0)
//            if(halfNum % i != 0)
//                lP = i;
//
////            for(int j = 2; j < i; j++)
////                if(j % j )
//
//        }
//        System.out.println(lP);
//        return lP;


