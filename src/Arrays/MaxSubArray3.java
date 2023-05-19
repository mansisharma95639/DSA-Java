package Arrays;
public class MaxSubArray3 {
    public static void maxSubarray(int[] nums){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0;i<nums.length;i++){
            currSum = currSum + nums[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum,maxSum);
        }
        System.out.println("Max subarray sum is "+maxSum);
    }

    public static void main(String args[]){
    int [] nums = {-2,-3,4,-1,-2,1,-3};
    maxSubarray(nums);
}
}
