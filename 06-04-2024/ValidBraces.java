// write a code to check if the given string is valid or not. The String contain "(", ")", "{", "}","[", "]" and the number of '(' characters is equal to the number of ')' characters. If the string is valid, print "Valid" otherwise print "Invalid".

import java.util.Stack;

public class ValidBraces {
    public static void main(String[] args) {
        String str1 = "({[]})";
        String str2 = "({]})";
        String str3 = "({[ ]})";
        String str4 = "({ ]})";
        String str5 = "{[ ]}()";
        System.out.println(isValid(str1));
        System.out.println(isValid(str2));
        System.out.println(isValid(str3));
        System.out.println(isValid(str4));
        System.out.println(isValid(str5));
    }

    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[')
                stack.push(c);
            else if (c != '(' && c != '{' && c != '[' && c != ')' && c != '}' && c != ']')
                continue;
            else{
                char top = stack.peek();
                if ((top == '(' && c != ')') || (top == '{' && c != '}') || (top == '[' && c != ']'))
                    return false;
                else
                    stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
