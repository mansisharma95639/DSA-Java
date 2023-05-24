package Arrays;

import java.util.Arrays; //Leetcode #251

class KthLargest {
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int i;
        for(i=0;i<nums.length-k;i++){

        }
        return nums[i];
    }
    public static void main(String args[]){
        int nums[] = {2,11,3,25,6,77,43};
        int k = 11;
        findKthLargest(nums,k);
    }
}