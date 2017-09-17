package algorithms;

import com.sun.xml.internal.fastinfoset.util.CharArray;

public class ReverseString {
    //method 1:

    public String reverseString1(String string){
        StringBuilder stringBuilder=new StringBuilder(string);

        return stringBuilder.reverse().toString();
    }
    //method 2:
    public String reverseString(String string){
        StringBuilder stringBuilder=new StringBuilder("");
        int len=string.length()-1;
        while(len>=0){
            stringBuilder.append(string.charAt(len));
            len--;
        }
        return stringBuilder.toString();
    }
    //method 3:
    public String reverseString2(String string){
        char[] array=string.toCharArray();
        int i=0, j=array.length-1;
        char temp=0;
        while(j>i){
            temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;
        }
        return new String(array);
    }
    public static void main(String args[]){
        ReverseString reverseString=new ReverseString();
        String st=reverseString.reverseString2("abcd");
        System.out.println(st);
    }
}
