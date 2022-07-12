package com.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @description: TODO
 * @className: LevelOrder
 * @author: Chenhf
 * @date: 2022/7/11 11:02
 * @version: 1.0
 */
public class LevelOrder {
    //层序遍历, FIFO
    public List<List<Integer>> levelOrder(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        //根节点入队
        if (root != null) queue.add(root);
        while (!queue.isEmpty()){
            //其实这里队列不为空, 即树不为空, 用于存储一层节点
            LinkedList<Integer> tmp = new LinkedList<>();
            List<Integer> tmp1 = new ArrayList<>();
            for (int i = queue.size(); i >0 ; i--) {
                //返回第一个元素并从队列中删除
                TreeNode node = queue.poll();
                if (res.size() %2 == 0)
                    tmp.addLast(node.val);
                else
                    tmp.addFirst(node.val);
                //判断左右子树根节点情况
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            res.add(tmp);
        }
        return res;
    }
}
