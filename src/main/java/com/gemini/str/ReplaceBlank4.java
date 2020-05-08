package com.gemini.str;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/5 20:08
 */
public class ReplaceBlank4 {

    public static void main(String[] args) {
        System.out.println(replaceBlank1("dss pskf sfds"));
    }

    /**
     * 解法一：使用StringBuffer
     *
     * @param input
     * @return
     */
    public static String replaceBlank1(String input) {
        if (input == null) {
            return null;
        }
        StringBuffer outputBuffer = new StringBuffer();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                outputBuffer.append("%20");
            } else {
                outputBuffer.append(String.valueOf(input.charAt(i)));
            }
        }
        return new String(outputBuffer);
    }
}
