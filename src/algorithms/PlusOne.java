package algorithms;

public class PlusOne {
    public int[] plusOne(int[] digits) {
if(digits==null) return null;
    int carry=0;
    int sum=0;
        for(int i=digits.length-1; i>=0; i--){
        if(i==digits.length-1) {
            sum= digits[i]+1+carry;
        }else{
            sum=  digits[i]+carry;
        }
        carry=sum/10;
        digits[i] =sum%10;
    }
        if(carry ==1){
        int [] result=new int[digits.length+1];
        result[0] =1;
        for(int i=0; i<digits.length; i++){
            result[i+1] = digits[i];
        }
        return result;
    }
        else return digits;
}
  public static void main(String [] args){
        PlusOne plusOne =new PlusOne();
        int [] ints = new int[]{0};
        plusOne.plusOne(ints);
  }
}
