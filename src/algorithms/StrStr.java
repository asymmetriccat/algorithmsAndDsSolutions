package algorithms;

public class StrStr {
    public int strStr(String s, String subStr) {
        if (s.contains(subStr) == false) return -1;
        return s.indexOf(subStr);
    }

    public int strStr2(String s, String subs){
        for(int i=0; ; i++){
            for (int j=0; ; j++){
                if(j==subs.length()) return i;
                if(i+j==s.length()) return -1;
                if(s.charAt(i+j)!=subs.charAt(j)) break;
            }
        }
    }

    public static void main(String args[]){
        StrStr strStr=new StrStr();
        int index=strStr.strStr2(" you are good", "good");
        System.out.println(index);
    }
}
