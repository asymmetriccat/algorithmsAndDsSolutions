package algorithms;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if(nums ==null || nums.length ==0) return 0;
        int maxSum =Integer.MIN_VALUE;
        int subSum=0;
        int subLen =0;
        for(int i=0; i<nums.length; i++){

            subSum=subSum + nums[i];
            if(subSum>maxSum){
                maxSum = subSum;
                subLen++;
            }
            else {
                i=i-subLen;
                subSum =0;
                subLen =0;
            }
        }
        return maxSum;
    }
    public static void main(String args[]){
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        maximumSubarray.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
    }
}