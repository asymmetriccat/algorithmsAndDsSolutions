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
    public int longestPalindrome(String s) {
        Set<Character> set=new HashSet<>();  //use set to find characters appeared even times
        int count=0;
        for(int i=0; i<s.length(); i++){
            if(set.contains(s.charAt(i))) {
                set.remove(s.charAt(i));
                count++; //count for how many pairs of same characters, like "aa", "bb", "aa", count will equal 3.
            }
            else set.add(s.charAt(i));
        }
        return set.isEmpty()?count*2:(count*2+1); //A empty set means string s contains even characters and each is paired, while a unempty set means there are odd characters in s.
    }
}
