package algorithms;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==1) return strs[0];
        StringBuilder sb =new StringBuilder();
        int shortest=Integer.MAX_VALUE;
        boolean isCommonChar=false;
        int shortestStringNum = 0;
        for(int i=0; i<strs.length; i++){
            int n = strs[i].length();
            if(shortest>n){
                shortest=n;
                shortestStringNum=i;
            }

        }
        Character c=null;
        for(int i=0; i<shortest; i++){
            for(int n=0; n<strs.length; n++){
                if(n!=shortestStringNum){
                    c=strs[n].charAt(i);
                    if(strs[shortestStringNum].charAt(i)==c){
                        isCommonChar=true;
                    }
                    else{
                        return sb.toString();
                    }
                }
            }
            if(isCommonChar) sb.append(c);
        }
        return sb.toString();

}
  public static void main(String arg[]){
        String[] strArr = {"aca","cba"};
        LongestCommonPrefix.longestCommonPrefix(strArr);
  }
}
