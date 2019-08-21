package algorithms;

import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path) {
        if(path==null) return null;
        Stack<String> stack = new Stack<>();
        String[] sts= path.split("/");
        for(String s:sts){
            if(s.equals("..")){
               if(!stack.isEmpty()) stack.pop();
            }else if(!s.equals(".")){
                stack.push(s);
            }
        }
        StringBuilder sb=new StringBuilder("/");
        //     if(sb.length()==0) return "/";
        while(!stack.isEmpty()){
            String s=stack.pop();
           if(s!=null && !s.equals("")) sb.insert(1, s+"/");
        }

        if(sb.length()>1) sb.deleteCharAt(sb.length()-1);
        return sb.toString();

    }
    public static void main(String args[]){
        SimplifyPath simplifyPath = new SimplifyPath();
        simplifyPath.simplifyPath("/../");
    }
}
