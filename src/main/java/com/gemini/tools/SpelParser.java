package com.gemini.tools;


/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/4/23 18:41
 */
public class SpelParser {


    public static String getKey(String key, String[] parameterNames, Object[] args) throws Exception {
        if (!key.startsWith("#")) {
            throw new IllegalAccessException("参数错误");
        }
        if (parameterNames.length < 1 || args.length < 1) {
            throw new IllegalAccessException("parameterNames or args must be not empty!");
        }
        key = key.replace("#", "");
        for (int i = 0; i < parameterNames.length; i++) {
            if (key.equals(parameterNames[i])) {
                return String.valueOf(args[i]);
            }
        }
        return "";
    }
}
