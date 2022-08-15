package com.dailytopic;

public class OneEdit {
    public boolean oneEditAway(String first, String second) {
        //只需要一次编辑就可以让两次输入的字符串相等
        int len = first.length() - second.length();
        if (len > 1 || len < -1) return false;
        int count = 1;
        for (int i = 0, j = 0; i < first.length() && j < second.length(); i++, j++) {
            if (first.charAt(i) != second.charAt(j)) {
                if (len == 1) {
                    j--;
                } else if (len == -1) {
                    i--;
                }
                count--;
            }
        }
        return count > 0 ? true : false;
    }
}
