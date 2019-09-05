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

    public static String longestCommonPrefix_2(String[] strs) {
        if(strs==null) return "";
        if(strs.length==0) return "";
        StringBuilder sb= new StringBuilder("");
        String first=strs[0];
        int i;
        int index=1;
        while(index<strs[0].length()){
            for(i=1; i<strs.length; i++){
                if(strs[i].indexOf(first.substring(0,index))!=0){
                    break;
                }
            }
            if(i==strs.length) index++;
            else break;
        }
        return index==1? "": first.substring(0,index);
    }


  public static void main(String arg[]){
        String[] strArr = {"flower","flow","flight"};
        LongestCommonPrefix.longestCommonPrefix_2(strArr);
  }
}
