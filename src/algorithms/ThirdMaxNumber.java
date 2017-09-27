package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThirdMaxNumber {
    public int thirdMax(int[] nums){
        if(Arrays.stream(nums).distinct().toArray().length<3) return Arrays.stream(nums).distinct().max().getAsInt();
        nums=Arrays.stream(nums).distinct().toArray();
        Arrays.sort(nums);
        return nums[nums.length-3];
    }
}
