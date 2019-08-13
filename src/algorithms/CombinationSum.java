package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result=combinationSum(candidates,target,0);
        return result;
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target,int start) {
        List<List<Integer>> result=new ArrayList<>();
        for(int i=start;i<candidates.length;i++){
            if(candidates[i]<target){
                List<List<Integer>> getcom=combinationSum(candidates,target-candidates[i],i);
                for(int j=0;j<getcom.size();j++){
                    List<Integer> list=getcom.get(j);
                    list.add(0,candidates[i]);
                    result.add(list);
                }
            }else if(candidates[i]==target){
                ArrayList<Integer> arrayList=new ArrayList<>();
                arrayList.add(target);
                result.add(arrayList);
                return result;
            }else{
                break;
            }
        }

        return result;
    }

    public static void main(String args[]){
        CombinationSum combinationSum =new CombinationSum();
        int [] ints = {2,3,6,7};
        combinationSum.combinationSum(ints, 7);
    }
}
