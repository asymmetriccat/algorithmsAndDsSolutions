package algorithms;

public class SortColors {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length==0) return;
        int first=0;
        int last = nums.length-1;

        while(first<=last){
            if(nums[first]!=0) {
                break;
            }
            first++;
        }
        while(last>=0){
            if(nums[last]!=2) break;
            last--;
        }
        int index = first;
        while (first <=last && index<nums.length-1){
            if(nums[index]==2){
                swap(nums, index, last);
                last--;
                while(nums[last]==2){
                    last--;
                }
            }
            if(nums[index]==0){
                swap(nums, index, first);
                first++;
            }
            index++;
        }
    }
    private void swap(int[] nums, int a, int b){
        int t=nums[a];
        nums[a]=nums[b];
        nums[b]=t;
    }
    public static void main(String args[]){
        int[] ints = new int[]{201};
        SortColors sortColors = new SortColors();
        sortColors.sortColors(ints);
    }
}
