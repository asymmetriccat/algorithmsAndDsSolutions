package algorithms;
/*
   Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.

Example:
Given a = 1 and b = 2, return 3.
 */
public class SumOfTwoIntegers {
    public  int addWithoutArithmetic(int num1, int num2)
    {
        if(num2 == 0)
            return num1;

        int sum = num1 ^ num2;
        int carry = (num1 & num2) << 1;

        return addWithoutArithmetic(sum, carry);
    }

    public static void main(String args[]){
        SumOfTwoIntegers sumOfTwoIntegers=new SumOfTwoIntegers();
        int sum=sumOfTwoIntegers.addWithoutArithmetic(10,3);
        System.out.println(sum);
    }
}
