package algorithms;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/*
Two strings are given and we had to modify 1 st string such that all the common characters of the 2 strings had to be removed and the uncommon characters of the second string had to be concatenated with uncommon characters of the first string.
        Ex: – string 1- aacdb and string 2 – gafd
        output – cbgf.
 */
public class RemoveCommonChar {
        public static String removeComChar(String s1, String s2){
            Set<Character> set=new TreeSet<>();


            char[] charArr=(s1+s2).toCharArray();


            for(int i=0; i<charArr.length; i++){
                boolean b=set.add(charArr[i]);
                if(b==false) set.remove(charArr[i]);
            }
            String result=set.stream().map(Object::toString).collect(Collectors.joining());
            return result;
        }
        public static void main(String args[]){
            String st=removeComChar("abcd", "cdef");
            System.out.println(st);
        }
}
