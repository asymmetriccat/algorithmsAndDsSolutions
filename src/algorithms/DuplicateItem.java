package algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateItem {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]);//make the size of set always equal or less than k;
            if(!set.add(nums[i])) return true;
        }
        return false;
    }

    public boolean containsNearbyDuplicate2(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i <  nums.length; i++) {
            Integer ord = map.put(nums[i], i);
            if(ord != null && i - ord <= k) {
                return true;
            }
        }

        return false;
    }
    public static void main(String args[]){
        DuplicateItem duplicateItem=new DuplicateItem();
        int [] nums={1,3,5,7,1,2,10};
        boolean b=duplicateItem.containsNearbyDuplicate(nums,3);
        System.out.println(b);

        boolean b2=duplicateItem.containsNearbyDuplicate2(nums,3);
        System.out.println(b2);
    }
}
