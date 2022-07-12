package com.huaweioj;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        int n = word.lastIndexOf(" ");
        if (n == -1){
            System.out.println(word.length());
        }else{
            String str = word.substring(n,word.length()-1);
            System.out.println(str.length());
            System.out.println(n);
            System.out.println(str);
        }
        in.close();
    }
}
