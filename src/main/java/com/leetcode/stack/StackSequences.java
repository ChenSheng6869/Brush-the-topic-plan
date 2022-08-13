package com.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

//剑指offer 31.栈的压入,弹出序列
public class StackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        //ArrayDeque双端队列的数组实现,双端队列的链表实现
        //几乎没有容量限制,设计线程不安全.
        //作为栈使用时,比stack类效率高;作为队列使用时,比LinkedList快.
        Deque<Integer> stack = new ArrayDeque<Integer>();
        int j = 0;
        //for遍历pushed数组,将elem元素入栈.一种利用for循环遍历数组的方法
        for (int elem : pushed) {
            stack.push(elem);
            //当入栈的元素等于出栈的第一个元素时,出栈.
            //j应满足小于popped.length,stack!=null,stack栈顶元素等于popped第一个元素
            while (j < popped.length && !stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }
        //如果j==pop.length的话,说明popped未pushed的出栈序列
        return j == popped.length;
    }
}
