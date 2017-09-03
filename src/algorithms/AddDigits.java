package algorithms;

public class AddDigits {
    public int addDigits(int num) {
        int sum=sumOfDigit(num);
        if(sum%10==sum) return sum;
        return addDigits(sum);
    }
    public int sumOfDigit(int num){
        int sum=0;
        if(num/10==0) sum=num;
        while(num/10>0){
            sum+=num%10;
            num=num/10;
        }
        return sum+num;
    }

    public static void main(String args[]){
        AddDigits addDigits=new AddDigits();
        int i=addDigits.addDigits(20);
        System.out.println(i);
    }
}
