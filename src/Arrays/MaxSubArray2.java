package Arrays;

public class MaxSubArray2 { // using Prefix Sum method
 
    public static void maxSubArray(int[] nums) {
        int currSum = 0;
        int prefixSum[] = new int[nums.length];
        int maxSum = Integer.MIN_VALUE;
        prefixSum[0] = nums[0];
        for (int i = 1; i < prefixSum.length; i++) {
           prefixSum[i] = prefixSum[i-1] + nums[i];    
        }

        for(int i=0;i<nums.length;i++){
            int startValue = i;
            for(int j=i;j<nums.length;j++){
                int endValue = j;
                currSum = startValue == 0 ? prefixSum[endValue] : prefixSum[endValue]-prefixSum[startValue-1];
            if(maxSum < currSum){
                maxSum = currSum;
            }
        }
    }
    System.out.println("Max sum is "+maxSum);
}

    public static void main(String args[]){
        int nums[] = {1,-2,3,4,32,-10};
        maxSubArray(nums);
    }
}
