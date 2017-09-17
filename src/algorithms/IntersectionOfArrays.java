package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> alist=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        for(int i:nums1){
            set.add(i);
        }
        nums2=Arrays.stream(nums2).distinct().toArray();
        for(int j:nums2){
            boolean b=set.add(j);
            if(b==false) alist.add(j);
        }
        int[] intArray=new int[alist.size()];
        for(int i=0; i<alist.size(); i++){
            intArray[i]=alist.get(i);

        }
        return intArray;
    }
 public static void main(String args[]){
        int[] nums1={};
        int[] nums2={2,4,9,10,11};
        IntersectionOfArrays intersectionOfArrays=new IntersectionOfArrays();
        int[] array=intersectionOfArrays.intersection(nums1, nums2);
     Arrays.stream(array).forEach(System.out::println);
 }
}
