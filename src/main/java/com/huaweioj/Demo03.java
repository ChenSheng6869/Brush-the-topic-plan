package com.huaweioj;

import java.util.HashMap;
import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        while (in.hasNextInt()) {
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                int key = in.nextInt();
                int value = in.nextInt();
                if (map.containsKey(key))
                    map.put(key,map.get(key)+value);
                else
                    map.put(key, value);
            }
            return;
        }
        for(Integer key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }
        in.close();
    }
}
