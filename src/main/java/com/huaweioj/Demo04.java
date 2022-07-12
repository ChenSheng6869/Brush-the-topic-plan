package com.huaweioj;

import java.util.Scanner;
import java.util.TreeSet;

public class Demo04 {
    public static void main(String[] args){
        TreeSet<String> set = new TreeSet();
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()){
            int length = Integer.valueOf(scan.nextLine());
            String[] s = new String[length];
            for(int i = 0; i < s.length; i++){
                s[i] = scan.nextLine();
                set.add(s[i]);
            }
            for(String i : set){
                System.out.println(i);
            }
        }
    }
}
