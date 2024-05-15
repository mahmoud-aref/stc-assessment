package com.stc.problem;

import java.util.Stack;

public class StringReversalUtils {

    private StringReversalUtils() {
        throw new IllegalStateException("UTILITY_CLASS");
    }

    public static String reverseBetweenParentheses(String source) {
        StringBuilder result = new StringBuilder();
        Stack<String> buffer = new Stack<>();
        for (int i = 0; i < source.length(); i++) {
            char c = source.charAt(i);
            if (c == '(') {
                buffer.push(result.toString());
                result.setLength(0);
            } else if (c == ')') {
                result.reverse();
                result.insert(0,'(');
                result.insert(0, buffer.pop());
                result.append(')');
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static boolean isValidInput(String input){
        return isBalancedParentheses(input) && isEnglishLowercaseAlphabetsOnly(input);
    }

    private static boolean isBalancedParentheses(String input){
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    private static boolean isEnglishLowercaseAlphabetsOnly(String input){
        return input.matches("^[a-z()]*$");
    }


}