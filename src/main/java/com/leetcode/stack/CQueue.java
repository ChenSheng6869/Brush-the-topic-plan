package com.leetcode.stack;

import sun.misc.PostVMInitHook;

import java.util.Stack;

//用两个栈实现队列
public class CQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    Stack<Integer> stack3;

    public CQueue() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
        stack3 = new Stack<Integer>();
    }

    //使用stack1入栈
    public void appendTail(int value) {
        stack1.push(value);
    }

    //使用stack2出栈
    public int deleteHead() {
        if (!stack2.isEmpty()) {
            return stack2.pop();
        } else {
            //栈2作为出栈，当它为空时，从栈1将元素去出放入栈2，栈2出栈
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            return stack2.isEmpty() ? -1 : stack2.pop();
        }
    }
}

