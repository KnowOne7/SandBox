package FAANG;

public class ClimbStairsMinCost {
    public static void main(String[] args) {
        int [] cost = {1,100,1,1,1,100,1,1,100,1};
//        int [] cost = {10,15,30,45};
        minCostClimbingStairs(cost);
    }

    private static int minCostClimbingStairs(int[] cost) {
        int step1 = 0;
        int step2 = 0;
        for(int i = cost.length-1; i >= 0; i--){
            int currentStep = cost[i] + Math.min(step1, step2);
            step1 = step2;
            step2= currentStep;
        }
        int result = Math.min(step1, step2);
        System.out.println(result);
        return result;

    }
}



//    public static int minCostClimbingStairs(int [] cost){
//        int n = cost.length;
//        int result = Math.min(minCost(n-2, cost), minCost(n-1, cost));
//        System.out.println(result);
//        return result;
//    }
//
//    private static int minCost(int i, int[] cost) {
//        if(i < 0) return 0;
//        if(i < 2) return cost[i];
//        int [] dp = new int[cost.length];
//        for( int j = 2; j < dp.length; j++){
//            dp[j] = cost[j] + Math.min(dp[j-2], dp[j-1]);
//        }
//        return dp[dp.length-1];
//
//
//    }
//}










//
//
//    public static int minCostClimbingStairs(int[] cost) {
//        int n  = cost.length;
//        int result = Math.min(minCost(n-2,cost), minCost(n-1, cost));
//        System.out.println(result);
//        return result;
//    }
//
//    private static int minCost(int i, int[] cost) {
//        if (i < 0) return 0;
//        if (i == 0 || i ==1 ) return cost[i];
//
//        return cost[i] + Math.min(minCost(i-1, cost), minCost(i-2, cost));
//    }
//}
