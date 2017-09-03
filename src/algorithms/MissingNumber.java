package algorithms;

import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        return (nums.length+0)*(nums.length+1)/2-sum;
    }

    public int missingNumber2(int[] nums){
        Arrays.sort(nums);
        int i=0;
        for(i=0; i<nums.length; i++){
            if (nums[i]!=i) break;
        }
        return i;
    }
    public static void main(String args[]){
        int[] nums={1, 0, 4, 2};
        MissingNumber missingNumber=new MissingNumber();
        int missing=missingNumber.missingNumber2(nums);
        System.out.println(missing);
    }
}
