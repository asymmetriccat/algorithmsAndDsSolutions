package algorithms;


import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

/*
   Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

Note:
Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.
Follow up:
What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 */
public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
     Map<Integer, Integer> map=new HashMap<>();
     List<Integer> list=new ArrayList<>();
     for(int i=0; i<nums1.length; i++){
         if(map.containsKey(nums1[i])){
             map.put(nums1[i],map.get(nums1[i])+1);
         }
         else map.put(nums1[i], 1);

     }

     for(int j=0; j<nums2.length; j++){
         if(map.containsKey(nums2[j])&&map.get(nums2[j])>0) {
             list.add(nums2[j]);
             map.put(nums2[j],map.get(nums2[j])-1);
         }
     }
     return list.stream().mapToInt(a->a).toArray();
    }

    public static void main(String args[]){
        int[] nums1={1};
        int[]nums2={1};
        IntersectionOfTwoArraysII intersectionOfTwoArraysII =new IntersectionOfTwoArraysII();
        int[] result=intersectionOfTwoArraysII.intersect(nums1,nums2);
        Arrays.stream(result).forEach(System.out::println);

    }
}
