package algorithms;

public class CountAndSay {

    public String countAndSay(int n) {
        if(n==1) return "1";
        String st = countAndSay(n-1);
        return mapCountAndSay(st);
    }

    String mapCountAndSay(String st){
        StringBuilder sb =new StringBuilder("");
        int count=1;
        for(int i=0; i<st.length(); i++){
                if(i<st.length()-1 && st.charAt(i)==st.charAt(i+1)){
                    count++;
                }
                else{
                    sb.append(count).append(st.charAt(i));
                    count=1;
                }

        }
        return sb.toString();

    }
    public static void main(String args[]){
        CountAndSay countAndSay = new CountAndSay();
        countAndSay.countAndSay(5);
    }
}
