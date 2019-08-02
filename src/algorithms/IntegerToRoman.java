package algorithms;

import java.util.Map;
import java.util.TreeMap;

public class IntegerToRoman {

    public static  String intToRoman(int num) {
        StringBuilder sb = new StringBuilder("");
        Map<Integer,String> romanMap = new TreeMap<>();
        romanMap.put(1, "I");
        romanMap.put(4, "IV");
        romanMap.put(5, "V");
        romanMap.put(9, "IX");
        romanMap.put(10, "X");
        romanMap.put(40, "XL");
        romanMap.put(50, "L");
        romanMap.put(90, "XC");
        romanMap.put(100, "C");
        romanMap.put(400, "CD");
        romanMap.put(500, "D");
        romanMap.put(900, "CM");
        romanMap.put(1000, "M");



        int nt= num/1000;
        if(nt>=1){
            for(int i=0; i<nt; i++){
                sb.append(romanMap.get(1000));
            }
        }
        num=num%1000;
        int nh = num/100;
        if(nh>=1){
            if (nh ==9){
                sb.append(romanMap.get(900));
            }else if(nh ==4){
                sb.append(romanMap.get(400));
            }
            else if(nh >=5){
                sb.append(romanMap.get(500));
                for(int i=0; i<nh-5; i++){
                    sb.append(romanMap.get(100));
                }
            }
            else{
                for(int i=0; i<nh; i++){
                    sb.append(romanMap.get(100));
                }
            }
        }

        num=num%100;
        int nte = num/10;
        if(nte>=1){
            if (nte ==9){
                sb.append(romanMap.get(90));
            }else if(nte ==4){
                sb.append(romanMap.get(40));
            }
            else if(nte >=5){
                sb.append(romanMap.get(50));
                for(int i=0; i<nte-5; i++){
                    sb.append(romanMap.get(10));
                }
            }
            else{
                for(int i=0; i<nte; i++){
                    sb.append(romanMap.get(10));
                }
            }
        }
        num=num%10;
        int no = num;
        if(no>=1){
            if (no ==9){
                sb.append(romanMap.get(9));
            }else if(no ==4){
                sb.append(romanMap.get(4));
            }
            else if(no >=5) {
                sb.append(romanMap.get(5));
                for (int i = 0; i < no-5; i++) {
                    sb.append(romanMap.get(1));
                }
            }
            else{
                for(int i=0; i<no; i++){
                    sb.append(romanMap.get(1));
                }
            }
        }
System.out.println(sb.toString());

        return sb.toString();
    }
    public static void main(String [] args){

        IntegerToRoman.intToRoman(58);
    }
}
