package com.dailytopic;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class SerializeBinaryTrees {
    //1.序列化二叉搜索树，返回值类型为字符串
    public String serialize(TreeNode root){
        List<Integer> list = new ArrayList<>();
        postOrder(root, list);
        String str = list.toString();
        return str.substring(1,str.length()-1);
    }

    //2.反序列化字符串，返回值为二叉搜索树
    public TreeNode deserialize(String data){
        if (data.isEmpty()) return null;
        String[] arr = data.split(",");
        Deque<Integer> stack = new ArrayDeque<>();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            stack.push(Integer.parseInt(arr[i]));
        }
        return construct(Integer.MIN_VALUE, Integer.MAX_VALUE, stack);
    }

    //3.后续遍历，添加进list
    private void postOrder(TreeNode root, List<Integer> list){
        if (root == null) return;
        postOrder(root.left, list);
        postOrder(root.right, list);
        list.add(root.val);
    }

    //4.构建搜索二叉树
    private TreeNode construct(int lower, int upper, Deque<Integer> stack){
        if (stack.isEmpty() || stack.peek() < lower || stack.peek() > upper){
            return null;
        }
        int val = stack.pop();
        TreeNode root = new TreeNode(val);
        root.right = construct(val, upper, stack);
        root.left = construct(lower, val, stack);
        return root;
    }
}
