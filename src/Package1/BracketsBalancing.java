package Package1;

import java.util.Stack;

public class BracketsBalancing {
    
    boolean isBalanced(String str){
        // returns true is paranthesis in the string are balanced else returns false
        Stack<Character> stack = new Stack<Character>();
        char ch;

        for (int i=0 ; i<str.length(); ++i) {
            //traverse each character of the string
            ch = str.charAt(i);
            //if current character is any opening bracket then add it to stack and continue
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
                continue;
            }
            //if current character is closing bracket but stack is either empty or stack top
            // is not matching opening bracket then return false
            if( (ch == ')' && (stack.isEmpty() || stack.peek() !='(')) || 
                (ch == ']' && (stack.isEmpty() || stack.peek() !='[')) ||
                (ch == '}' && (stack.isEmpty() || stack.peek() !='{')) ){
                return false;
            }
            //if current character is closing bracket, and control is still here this means 
            //we got stack top exact matching opening bracket then pop it from stack
            else if(ch == ')' || ch == ']' || ch == '}'){
            stack.pop();
            }
        }
        //After reading all characters of the string control is here means either
        // string is balanced(if stack is empty) or unbalanced(if stack is not empty)
        return stack.isEmpty();
    }
}
