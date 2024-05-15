package com.stc.problem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello , Enter A String To Reverse Between Parentheses");
        System.out.println("Example: (abc)def(ghi) -> (cba)def(ihg)");
        System.out.println("Note: Parentheses should always be balanced");
        System.out.println("Note: Use English lowercase alphabets only");
        System.out.println("Enter exit to quit");

        Scanner scanner = new Scanner(System.in);
        String source = scanner.nextLine();
        while (!"exit".equals(source)) {
            if (!StringReversalUtils.isValidInput(source)) {
                System.out.println("Invalid Input please follow input rules");
                source = scanner.nextLine();
                continue;
            }
            String result = StringReversalUtils.reverseBetweenParentheses(source);
            System.out.println("input: " + source);
            System.out.println("output: " + result);
            source = scanner.nextLine();
        }
        System.out.println("Thanks .. Program Terminated");
    }

}
