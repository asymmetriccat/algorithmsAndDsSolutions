package algorithms;

import java.util.regex.Pattern;

public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if(n==1) return true;
        if(n%3!=0||n==0) return false;

        else {
            n=n/3;
            if(n==3) {
                return true;
            }
            return isPowerOfThree(n);
        }
    }

    //method 2:
    public boolean isPowerOfThree2(int n){
        if(n<1)return false;
        while(n>1){
            if(n%3!=0){
                return false;
            }
            else n=n/3;
        }
        return n==1;
    }

    //method 3:
   public boolean isPowerOfThree3(int n){
        return Pattern.matches("^10*$", Integer.toString(n, 3));
   }

    public static void main(String args[]){
        PowerOfThree powerOfThree=new PowerOfThree();
        boolean b=powerOfThree.isPowerOfThree3(10);
        System.out.println(b);

    }
}
