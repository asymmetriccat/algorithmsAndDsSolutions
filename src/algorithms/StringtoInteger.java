package algorithms;

public class StringtoInteger {
    public int myAtoi(String str) {
        if(str==null) return 0;
        int i=0;
        str=str.trim();
        if(str.length()==0) return 0;


        //   if(!(Character.isDigit(str.charAt(0))) && (str.charAt(0)!='-' || str.charAt(0)!='+') ) return 0;

        //   if(str.charAt(0)=='+') str=str.replace("+", "");
        int start= (str.charAt(0)=='-' || str.charAt(0)=='+') ? 1:0;
        boolean isNegative=str.charAt(0)=='-' ? true:false;
        int j=start;
        while(j<str.length()){
            if(!Character.isDigit(str.charAt(j))){
                break;
            }
            j++;
        }
        String numStr = str.substring(start, j);
        double result=0;
        int n=0;
        for(int m=numStr.length()-1; m>=0; m--){
            int numAtI = numStr.charAt(m)-'0';
            result=result + numAtI* Math.pow(10, n);

            n++;
        }

        result= isNegative? 0-result : result;
        if(result<Integer.MIN_VALUE ) return Integer.MIN_VALUE;
        else if (result> Integer.MAX_VALUE) return  Integer.MAX_VALUE;
        else return (int) result;
    }
    public static void main(String args[]){
        StringtoInteger stringtoInteger = new StringtoInteger();
        stringtoInteger.myAtoi("-6147483648");
    }
}
