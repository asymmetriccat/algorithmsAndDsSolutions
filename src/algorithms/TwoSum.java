package algorithms;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        int[] result=new int[2];
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsValue(target-nums[i])) {
                result[1]=i;
                result[0]=map.get(target-nums[i]);
            }
            map.put(i, nums[i]);

        }
        return result;
    }
}
