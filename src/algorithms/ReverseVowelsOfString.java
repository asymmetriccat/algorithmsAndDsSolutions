package algorithms;

public class ReverseVowelsOfString {
    public String reverseVowels(String string) {
        char[] array = string.toCharArray();
        int i = 0, len = string.length() - 1;
        char temp = ' ';
        while (len >= i) {
            if (Character.toLowerCase(array[i]) == 'a' || Character.toLowerCase(array[i]) == 'e' || Character.toLowerCase(array[i]) == 'o' || Character.toLowerCase(array[i]) == 'i' || Character.toLowerCase(array[i]) == 'u') {
                while (len >= i) {
                    if (Character.toLowerCase(array[len]) == 'a' || Character.toLowerCase(array[len]) == 'e' || Character.toLowerCase(array[len] )== 'o' || Character.toLowerCase(array[len]) == 'i' || Character.toLowerCase(array[len]) == 'u') {
                        temp = array[i];
                        array[i] = array[len];
                        array[len] = temp;
                        len--;
                        break;
                    } else len--;
                }
            }
            i++;
        }
        return new String(array);
    }
    public static void main(String args[]){
        ReverseVowelsOfString reverseVowelsOfString=new ReverseVowelsOfString();
        String st=reverseVowelsOfString.reverseVowels("abcdefghihu");
        System.out.println(st);
    }
}
