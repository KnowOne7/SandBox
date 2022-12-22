package FAANG;

public class ClimbingStairs {
    public static void main(String[] args) {

        climbStairs(5);


    }
    public static int climbStairs(int n){
//        int[]dp=new int[n+1];
        int result = fib(n);
        System.out.println(result);
        return result;
//        int result;
//        if(n <= 2) return n;
//
//        else {
//            result = climbStairs(n-2) + climbStairs(n-1);
//            System.out.println(result);
//            return result;
//        }

    }

    private static int fib(int n) {
        if( n <= 2) return n;

        int[] dp = new int[n];

        dp[0] = 1; dp[1] = 2;

        for(int i = 2; i < n; i ++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[dp.length-1];



//        dp[n] = n-1;

//
//        dp[n-1] = fib(n-1) + dp
//        dp[n] = dp[n-2] + dp[n-1];
//
//        dp[n] = fib(n - 2, dp) + fib(n - 1, dp);
//
//        return dp[n];

    }

}
