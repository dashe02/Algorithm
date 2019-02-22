package com.example.tree;

/**
 * Created by wecash on 19/2/22.
 * 9_
 * /   \
 * 3     2
 * / \   / \
 * 4   1  #  6
 * / \ / \   / \
 * # # # #   # #
 *
 *   由于空节点由’#’表示，那么字符串表示的应该为满二叉树，即入度和出度相等。
     我们维护dif = 当前遍历节点出度和 - 当前遍历节点入度和
     由于根节点只有出度2，因此dif初始化为1。非叶节点可以使dif增1，叶节点使dif减1
     遍历字符串，若dif < 0，返回false，遍历结束，判断dif是否等于0
 */
public class CheckIsPre {

    public boolean checkIsPre(String preOrder) {
        //"9,3,4,#,#,1,#,#,2,#,6,#,#"
        String[] strArray = preOrder.split(",");
        int diff = 1;
        for (String node : strArray) {
            if (--diff < 0) return false;
            if (!node.equals("#")) diff += 2;
        }
        return diff == 0;
    }
}
