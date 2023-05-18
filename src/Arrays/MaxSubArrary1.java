package Arrays;

public class MaxSubArrary1 { //Brute Force Approach to find maximum sum of subarray
    public static int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int startValue = i;
            for (int j = i; j < nums.length; j++) {
                currSum = 0;
                int endValue = j;
                for (int k = startValue; k <= endValue; k++) {
                    currSum += nums[k];
                }
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        maxSubArray(arr);
    }

}