package algorithms;

import java.util.Arrays;
import java.util.HashSet;

public class HappyNumbers {
    int result;
    public boolean isHappy(int n) {

        HashSet<Integer> set=new HashSet<>();
        sum(n);
        while(result!=1){
            if (set.add(result)==false) return false;
            sum(result);
        }
       return result==1;
    }
    public int sum(int j){
        int [] intDigit= Integer.toString(j).chars().map(a->Character.getNumericValue(a)).toArray();
        result=0;

        for (int i:intDigit){
            result+=Math.pow(i,2);

        }
        return result;
    }
    public static void main(String args[]){
        HappyNumbers happyNumbers=new HappyNumbers();
       boolean b1= happyNumbers.isHappy(19);
       System.out.println(b1);
    }
}
