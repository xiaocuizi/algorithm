package com.gemini.栈;

import java.util.Stack;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/10 10:23
 */
public class 有效的括号 {

    public static void main(String[] args) {
        System.out.println(isValid("[{})((}"));
    }

    public static boolean isValid(String s) {
        if (s.trim().isEmpty()) {
            return false;
        }
        Stack<Character> characterStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[' || c == '(' || c == '{') {
                characterStack.push(c);
            } else {
                if (characterStack.isEmpty()) {
                    return false;
                }
                Character left = characterStack.pop();
                if (left == '[' && c != ']') return false;
                if (left == '(' && c != ')') return false;
                if (left == '{' && c != '}') return false;

            }
        }
        return characterStack.isEmpty();
    }
}
