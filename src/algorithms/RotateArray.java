package algorithms;

import java.util.Arrays;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        if(nums==null || k==0) return;
        int len =nums.length;
        k=k%len;
        int[] lastK = Arrays.copyOfRange(nums, len-k, len);
        for(int i=len-k-1; i>=0; i--){
            nums[i+k]=nums[i];
        }

        for(int i=0; i<k;i++){
            nums[i]=lastK[i];
        }
    }
    public static void main(String args[]){
        int [] ints =new int[]{1,2,3,4,5,6,7};
        RotateArray rotateArray =new RotateArray();
        rotateArray.rotate(ints, 3);
    }
}
