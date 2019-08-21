package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSets {
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> results = new ArrayList<>();
        if(nums==null || nums.length==0) return results;

        Arrays.sort(nums);
        List<Integer> subset= new ArrayList<>();
        findSubsets(nums, results, subset, 0);
        return results;
    }
    private void findSubsets(int [] nums, List<List<Integer>> results, List<Integer> subset, int startIndex){
        results.add(new ArrayList<>(subset));
        for(int i=startIndex; i<nums.length; i++){
            subset.add(nums[i]);
            findSubsets(nums, results, subset, i+1);
            subset.remove(subset.size()-1);
        }
    }

    public static void main(String args[]){
        SubSets subSets = new SubSets();
        int [] nums =new int[]{1,2,3};
        subSets.subsets(nums);
    }
}
