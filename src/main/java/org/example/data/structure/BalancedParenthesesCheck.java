package org.example.data.structure;

import java.util.Stack;

public class BalancedParenthesesCheck {
    public static void main(String[] args) {
        String input = "{()[{}]}";
        boolean isBalancedParanthesis=isBalanced(input);
        if(isBalancedParanthesis) {
            System.out.println(input + "  is Balanced ");
        }else{
            System.out.println(input + "  is Not Balanced ");
        }
    }

    private static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        char stackPopElement;
        char [] chElements = input.toCharArray();

        for(int i=0;i<chElements.length;i++){
            char current=chElements[i];
            if(current=='(' || current=='{' || current=='['){
                    stack.push(current);
                    continue;
               }

            // if stack is empty, return false
            if (stack.isEmpty()) {
                return false;
            }

            switch(current){
                case ')':
                    stackPopElement=stack.pop();
                    if(stackPopElement=='[' || stackPopElement=='{')
                       return false;
                    break;
                case ']':
                    stackPopElement=stack.pop();
                    if(stackPopElement=='(' || stackPopElement=='{')
                        return false;
                    break;
                case '}':
                    stackPopElement=stack.pop();
                    if(stackPopElement=='[' || stackPopElement=='(')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }
}
