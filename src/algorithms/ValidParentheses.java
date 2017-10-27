package algorithms;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
    Stack<Character> stack = new Stack<Character>();
	for (char c : s.toCharArray()) {
        if (c == '(')
            stack.push(')');
        else if (c == '{')
            stack.push('}');
        else if (c == '[')
            stack.push(']');
        else if (stack.isEmpty() || stack.pop() != c)
            return false;
    }
	return stack.isEmpty();
}
public static void main(String args[]){
        ValidParentheses validParentheses=new ValidParentheses();
        boolean b=validParentheses.isValid("[{}]");
        System.out.println(b);
}
}