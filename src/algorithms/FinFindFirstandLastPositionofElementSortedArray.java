package algorithms;

public class FinFindFirstandLastPositionofElementSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int  len =nums.length;
        int left = 0;
        int right = nums.length-1;
        if(nums==null || len==0) return new int[]{-1,-1};
        int pivot = searchTarget(nums, target,left, right);
        if(pivot==-1)
            return new int[]{-1,-1};

        return getRange(nums, pivot);

    }

    int searchTarget(int[] nums, int target, int start, int end){
        int left = start;
        int right = end;
        while(left<=right){
            int mid =left+ (right-left)/2;
            if(target ==nums[mid]){
                return mid;
            }
            if(target<nums[mid]){
                return searchTarget(nums, target, left, mid-1 );
            }
            if(target>nums[mid]){
                return searchTarget(nums, target,mid+1, right);
            }


        }
        return -1;

    }

    int [] getRange(int[] nums, int pivot){
        int len = nums.length;
        int [] result =new int[2];
        int left =  pivot-1;
        int right = pivot+1;
        if(left<0) result[0] = left+1;
        if(right>=len) result[1] =right-1;
        while(left>=0){
            if(nums[left]!=nums[pivot]){
                result[0] = left+1;
                break;
            }
            left--;
        }
        while(right<len){
            if(nums[right]!=nums[pivot]){
                result[1] = right-1;
                break;
            }
            right++;

        }
        return result;
    }

    public static void main(String args[]){
        FinFindFirstandLastPositionofElementSortedArray fa = new FinFindFirstandLastPositionofElementSortedArray();
        int [] intArr = {2,2};

        fa.searchRange(intArr, 2);
    }
}
