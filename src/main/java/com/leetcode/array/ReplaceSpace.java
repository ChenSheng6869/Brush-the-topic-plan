package com.leetcode.array;

import com.sun.imageio.stream.StreamFinalizer;

public class ReplaceSpace {
    public static String replaceSpace(String str) {
        StringBuffer sb = new StringBuffer(str);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a') sb.append("%20");
            else sb.append(c);
        }
        return sb.toString();
    }


}
