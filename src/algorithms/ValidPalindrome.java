package algorithms;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s==null) return false;
        if(s.length()==0) return true;
        StringBuilder sb = new StringBuilder("");
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "");
        for(int i=0; i<s.length(); i++){
           // if(Character.isLetter(s.charAt(i))) sb.append(s.charAt(i));
            sb.append(s.charAt(i));
        }
        String beforeReversed = sb.toString();
        String reversed = sb.reverse().toString();
        if(beforeReversed.equalsIgnoreCase(reversed)) return true;
        return false;
    }
    public static void main(String args[]){
        ValidPalindrome validPalindrome = new ValidPalindrome();
        validPalindrome.isPalindrome("ABC0-, / CB@A");
    }
}
