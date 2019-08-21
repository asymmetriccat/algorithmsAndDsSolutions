package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Combination {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result =new ArrayList<>();
        if(n==0 || k==0) return result;
        if(k==1){
            for(int i=0; i<n; i++){
                List<Integer> list = new ArrayList<>();
                list.add(i);
                result.add(list);
            }
            return result;
        }
        else if(n==2 && k==2){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            result.add(list);
            return result;
        }
        else{
            List<List<Integer>> preList = combine((n-1), k-1);
            for(List<Integer> list:preList){
                list.add(n);
            }
            result.addAll(combine(n-1, k));
            result.addAll(preList);
        }

        return result;
    }
public static void main(String args[]){
        Combination combination = new Combination();
        combination.combine(4,3);
}

}
