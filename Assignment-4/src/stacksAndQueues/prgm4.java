package stacksAndQueues;

import java.util.Stack;

public class prgm4 {
    static boolean balancedParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c=='{' || c=='[' || c=='(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (c=='}' && top != '{') return false;
                if (c==']' && top != '[') return false;
                if (c==')' && top != '(') return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s1 = "{[()]}";
        String s2 = "{{[(";
        System.out.println(s1 + " -> "+(balancedParentheses(s1) ? "valid" : "invalid"));
        System.out.println(s2 + " -> "+(balancedParentheses(s2) ? "valid" : "invalid"));
    }
}

