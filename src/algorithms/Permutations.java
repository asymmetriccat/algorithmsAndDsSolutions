package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        List<Integer> base = new ArrayList();
        boolean[] seen = new boolean[nums.length];
        perm(res, base, nums, seen);
        return res;
    }

    private void perm(List<List<Integer>> res, List<Integer> base, int[] nums, boolean[] seen){
        if(base.size() == nums.length){
            res.add(new ArrayList<>(base));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(!seen[i]){
                base.add(nums[i]);
                seen[i] = true;
                perm(res, base, nums, seen);
                base.remove(base.size() - 1);
                seen[i] = false;
            }
        }
    }
    public static void main(String args[]){
        Permutations permutations =new Permutations();
        permutations.permute(new int[]{1,2,3});
    }
}
