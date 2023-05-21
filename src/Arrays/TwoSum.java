package Arrays;

class TwoSum { // Leetcode Problem #1
    public static int[] twoSum(int[] nums, int target) {
            for(int i=0;i<nums.length;i++){
                for(int j=i;j<nums.length;j++){
                    if(i!=j && nums[i]+nums[j]==target) return new int[]{i,j};
                } }
                
                return null;
    }
    public static void main (String args[]){
        int nums[] = {2,3,4,6,7,8,11};
        int target = 13;
      System.out.println(twoSum(nums,target));
    }
}