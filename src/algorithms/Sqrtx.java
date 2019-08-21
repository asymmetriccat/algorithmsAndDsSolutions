package algorithms;

public class Sqrtx {
    public int mySqrt(int x) {
        if(x==0 || x==1) return x;
        int left =1;
        int right=x/2;
        int result =binarySearch(x, left, right);
        System.out.println(result);
        return binarySearch(x, left, right);

    }
    private int binarySearch(int x, int left, int right){
        int mid = left+(right-left)/2;
        while (left <=right) {
            if (mid == x / mid) return mid;
            if (mid < x / mid && (mid + 1) > x / (mid + 1)) return mid;
            if (mid > x/mid) {

                return binarySearch(x, left, mid - 1);

            }

            return binarySearch(x, mid + 1, right);
        }
       return -1;
    }
    public static void main(String args[]){
        Sqrtx sqrtx =  new Sqrtx();
        sqrtx.mySqrt(2147395599);
    }
}
