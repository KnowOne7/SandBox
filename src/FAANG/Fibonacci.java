package FAANG;

public class Fibonacci {
    public static void main(String[] args) {
        fib(4);

        System.out.println(        fib2(25));

        fib2(25);
    }

    public static int fib(int n) {
        if (n <= 1)
            return n;
        else return fib(n - 1) + fib(n - 2);
    }


    public static int fib2(int n) {
        int[]dp=new int[n+1];
        return fibonacci(n,dp);
    }
// Works but not true dp. Use Climbing Stairs.
    private static int fibonacci(int n, int[] dp){
        if(n==0)return 0;
        if(n==1)return 1;

        if(dp[n]!=0)return dp[n];  //if already solved then use it

        dp[n]=fibonacci(n-1,dp)+fibonacci(n-2,dp);
        return dp[n];
    }
}

//
//        if(n == 0)
//            return sum;
//        while(true){
//            sum = n + fib((n-1));
//            n-=1;
//            return sum;
//        }

