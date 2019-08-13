package algorithms;

import java.util.Arrays;

public class ThreeSumsClosest {

        public static int threeSumClosest(int[] nums, int target) {

                if(nums==null || nums.length<0) return 0;
                Arrays.sort(nums);
                int len = nums.length;
                int result=nums[0]+nums[1]+nums[len-1];

                for(int i=0; i<len-1; i++){
                    int in = nums[i];
                    int left =i+1;
                    int right = len-1;
                    while(left<right){
                        int tem = in +nums[left]+nums[right];
                        if(tem==target){
                            return tem;
                        }
                        if(tem>target){
                            right--;
                        }
                        if(tem<target){
                            left++;
                        }

                        if( Math.abs(tem-target)<Math.abs(result-target)){
                            result=tem;
                        }
                    }
                }
                return result;
        }
        public static void main(String args[]){
            int [] ints = {-1, 2, 1, -4};
            ThreeSumsClosest.threeSumClosest(ints, 1);
        }

}
