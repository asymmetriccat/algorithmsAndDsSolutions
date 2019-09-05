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

    public int strStr_1(String haystack, String needle) {
        if(needle ==null || needle.length() ==0) return 0;
        if(haystack==null || haystack.length()==0) return -1;

        for(int i=0; i<haystack.length(); i++){
            for(int j=i+1; j<=haystack.length(); j++){
                if(haystack.substring(i, j).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
    public int strStr_3(String haystack, String needle) {
    if(needle ==null || needle.length()==0) return 0;
        if(haystack==null || haystack.length()<needle.length()) return -1;
    int start=-1;
        for(int i=0;i<haystack.length(); i++){
        if(haystack.charAt(i)==needle.charAt(0)){
            start=i;
            int countI=0;
            while(i<haystack.length() && i-start<needle.length()){
                if(haystack.charAt(i) ==needle.charAt(i-start)){
                    i++;
                    countI++;
                }else{
                    break;
                }
            }
            if(i-start==needle.length()) return start;
            else i=i-countI;
        }
    }
        return -1;
}


    public static void main(String args[]){
        StrStr strStr=new StrStr();
        int index=strStr.strStr_3("mississippi", "issip");
        System.out.println(index);
    }
}
