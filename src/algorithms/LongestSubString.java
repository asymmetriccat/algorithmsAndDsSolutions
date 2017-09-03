package algorithms;

import java.util.Arrays;

public class LongestSubString {
    public int longestSubString(String str) {
        boolean[] isExist = new boolean[256];
        int subStrLen = 0;
        int i = 0;
        for (int j = 0; j < str.length(); j++) {
            while(isExist[str.charAt(j)]) {

                isExist[str.charAt(i)] = false;
                i++;
            }

                isExist[str.charAt(j)] = true;

                subStrLen = Math.max(j - i + 1, subStrLen);


        }
        return subStrLen;
    }

    public int longestSubString2(String str){
        int[] charMap=new int[256];
        int maxLen =0;
        Arrays.fill(charMap, -1);
        int i=0;
        for(int j=0; j<str.length(); j++){
            if(charMap[str.charAt(j)]>=i){
                i=charMap[str.charAt(j)]+1;
            }
            charMap[str.charAt(j)]=j;
            maxLen=Math.max(j-i+1, maxLen);
        }
        return maxLen;
    }

    public static void main(String args[]){
        LongestSubString longestSubString=new LongestSubString();
        int l=longestSubString.longestSubString2("abcddef");
        System.out.println(l);
    }


}
