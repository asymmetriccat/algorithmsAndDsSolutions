package algorithms;
/*
   Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

This is case sensitive, for example "Aa" is not considered a palindrome here.

Note:
Assume the length of given string will not exceed 1,010.

Example:

Input:
"abccccdd"

Output:
7

Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.
 */


import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {
    static String longestPalSubstr(String s) {
        int n = s.length();
        if(s==null || n<2){
            return s;
        }
        int left =0;
        int right =0;
        boolean[][] isPalindrome= new boolean[n][n];  //use a 2D array to store the previous boolean palindrome result

        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                boolean isSubstringPalindrome = isPalindrome[j+1][i-1] || i-j<=2;
                if(s.charAt(j) ==s.charAt(i) && isSubstringPalindrome){
                    isPalindrome[i][j]=true;
                    System.out.println("i: " + i + " j: " +j + ": " +isPalindrome[i][j]);
                    if(i-j >right-left) {
                        left =j;
                        System.out.println("left:" + left);
                        right=i;
                        System.out.println("right:" + right);
                    }
                }
            }
        }
        System.out.println("result:" + s.substring(left, right+1));
        return s.substring(left, right+1);
    }

    // Driver program to test above functions
    public static void main(String[] args) {

        String str = "aaaa"; // "aaaa";
        System.out.println("Length is: " +
                longestPalSubstr(str));
    }


}
