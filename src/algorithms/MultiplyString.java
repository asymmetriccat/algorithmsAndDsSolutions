package algorithms;

public class MultiplyString {
    public String multiply(String num1, String num2) {
        num1 = new StringBuffer(num1).reverse().toString();
        num2 = new StringBuffer(num2).reverse().toString();
        int m = num1.length();
        int n = num2.length();

        int[] result = new int[m + n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                result[i + j] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');

        int c = 0;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < m + n; i++) {
            int sum = (result[i] + c) % 10;
            c = (result[i] + c) / 10;
            sb.append((char) ('0' + sum));
        }

        sb = sb.reverse();
        while (sb.charAt(0) == '0' && sb.length() > 1)
            sb.deleteCharAt(0);

        return sb.toString();
    }
    public static void main(String args[]){
        MultiplyString multiplyString = new MultiplyString();
        multiplyString.multiply("123", "456");
    }
}
