package algorithms;

import java.util.*;

public class LetterCombinationsPhoneNumber {
    public static List<String> letterCombinations(String digits) {
        int len = digits.length();
        if (digits == null || len < 1) return Collections.emptyList();
        List<String> result = new ArrayList<>();

        Map<Character, char[]> charMap = new HashMap<>();
        charMap.put('0', new char[]{});
        charMap.put('1', new char[]{});
        charMap.put('2', new char[]{'a', 'b', 'c'});
        charMap.put('3', new char[]{'d', 'e', 'f'});
        charMap.put('4', new char[]{'g', 'h', 'i'});
        charMap.put('5', new char[]{'j', 'k', 'l'});
        charMap.put('6', new char[]{'m', 'n', 'o'});
        charMap.put('7', new char[]{'p', 'q', 'r', 's'});
        charMap.put('8', new char[]{'t', 'u', 'v'});
        charMap.put('9', new char[]{'w', 'x', 'y', 'z'});

        StringBuilder sb = new StringBuilder();

        letterCombHelper(sb, digits, charMap, result);
        return result;

    }


        private static void letterCombHelper(StringBuilder sb, String digits, Map<Character, char[]> charMap, List<String> result){
            if(sb.length()==digits.length()){
                result.add(sb.toString());
                return;
            }

            for(char c: charMap.get(digits.charAt(sb.length()))){
                sb.append(c);
                letterCombHelper(sb, digits, charMap, result);
                sb.deleteCharAt(sb.length()-1);
            }

    }
    public static void main(String args[]){
        LetterCombinationsPhoneNumber.letterCombinations("23");
    }
}
