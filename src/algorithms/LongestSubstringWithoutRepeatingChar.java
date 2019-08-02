package algorithms;

public class LongestSubstringWithoutRepeatingChar {
    public static int lengthOfLongestSubstring(String s) {
        if(s.length()==1 ) return 1;
        StringBuilder sb= new StringBuilder("");
        int result=0;

        for(int i=0; i<s.length(); i++){
            if(sb.toString().indexOf(s.charAt (i))==-1){
                sb=sb.append(s.charAt (i));

                result=result<sb.length()? sb.length():result;
            }else{
                i-=sb.length();
                sb=new StringBuilder("");

            }
        }

        return result;
    }
    public static void main(String []args){
        LongestSubstringWithoutRepeatingChar.lengthOfLongestSubstring("abcabcbb");
    }
}
