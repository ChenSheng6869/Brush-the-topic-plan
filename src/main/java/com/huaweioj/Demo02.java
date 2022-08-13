package com.huaweioj;

import sun.text.resources.cldr.ti.FormatData_ti;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();

        String s1 = str1.toLowerCase();
        String s2 = str2.toLowerCase();
        int n = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s2.equals(s1.substring(i, i + 1))) {
                n++;
            }
        }
        System.out.println(n);
    }
}
