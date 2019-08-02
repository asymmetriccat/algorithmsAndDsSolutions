package algorithms;

public class ZigzagConversion {
        public static String convert(String s, int numRows) {
           char[] c = s.toCharArray();
           int len = c.length;
           StringBuilder[] sb = new StringBuilder[numRows];
           for(int i=0; i<sb.length; i++){
               sb[i]= new StringBuilder();
           }
           int i=0;
           while(i<len){
               for(int idx =0; idx<numRows && i<len; idx++){
                   sb[idx].append(c[i++]);
               }
               for(int idx =numRows-2; idx>=1 && i<len; idx--){
                   sb[idx].append(c[i++]);
               }
           }
           for(int idx =1; idx<sb.length; idx++){
               sb[0].append(sb[idx]);
           }
           System.out.println(sb[0].toString());
           return sb[0].toString();
        }

        public static void main(String [] args){
            ZigzagConversion.convert("PAYPALISHIRING"
                    ,4);

        }
}
