package algorithms;

import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int insertPos = 0;
        for (int num: nums) {
            if (num != 0) nums[insertPos++] = num;
        }

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }

    public static void main(String args[]){
        int [] intArr={1,0,3,0,6,0,2};
        MoveZeroes moveZeroes=new MoveZeroes();
        moveZeroes.moveZeroes(intArr);
        Arrays.stream(intArr).forEach(System.out::print);
    }
}
