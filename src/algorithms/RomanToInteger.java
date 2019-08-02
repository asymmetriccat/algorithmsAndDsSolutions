package algorithms;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int result =0;
        for(int i=0; i<s.length(); i++){
            int j = i+1;
            if ((j<s.length()) && s.substring(i, j + 1).equals("IV")) {
                result = result+4;
                i++;
            } else if ((j<s.length()) && s.substring(i, j + 1).equals("IX")) {
                result = result+9;
                i++;
            } else if ((j<s.length()) && s.substring(i, j + 1).equals("XL")) {
                result = result+40;
                i++;
            } else if ((j<s.length()) && s.substring(i, j + 1).equals("XC")) {
                result = result+90;
                i++;
            } else if ((j<s.length()) && s.substring(i, j + 1).equals("CD")) {
                result = result+400;
                i++;
            } else if ((j<s.length()) && s.substring(i, j + 1).equals("CM")) {
                result = result+900;
                i++;
            }

            else if(s.charAt(i)=='M') {
                result=result+1000;
            }
            else if(s.charAt(i)=='D') {
                result=result+500;
            }
            else if(s.charAt(i)=='C') {
                result=result+100;
            }
            else if(s.charAt(i)=='L') {
                result=result+50;
            }
            else if(s.charAt(i)=='X') {
                result=result+10;
            }
            else if(s.charAt(i)=='V') {
                result=result+5;
            }
            else if(s.charAt(i)=='I') {
                result=result+1;
            }
        }

        return result;
    }
    public static void main(String args[]){
        RomanToInteger.romanToInt("DCXXI");
    }
}
