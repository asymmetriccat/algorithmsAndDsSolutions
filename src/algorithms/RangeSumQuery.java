package algorithms;



import javafx.util.Pair;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.

Example:
Given nums = [-2, 0, 3, -5, 2, -1]

sumRange(0, 2) -> 1
sumRange(2, 5) -> -1
sumRange(0, 5) -> -3
Note:
You may assume that the array does not change.
There are many calls to sumRange function.
 */
public class RangeSumQuery {
    int[] nums;
    public RangeSumQuery(int[] nums){
        this.nums=nums;
    }
    //method 1: use java 8 stream. Time limit exceeded.
    public int sumRange(int i, int j){
        return Arrays.stream(nums).skip(i).limit(j+1).sum();
    }

    //method 2:
    private Map<Pair<Integer, Integer>, Integer> map = new HashMap<>();
    public void sumHelp(int[] nums){
        for(int i=0; i<nums.length; i++) {
            for (int j = i; j < nums.length; j++) {

                int sum = Arrays.stream(nums).skip(i).limit(j + 1).sum();
                map.put(new Pair(i, j), sum);
            }
        }
    }

    public int sumRange2(int i, int j){
        return map.get(new Pair(i, j));
    }
}
