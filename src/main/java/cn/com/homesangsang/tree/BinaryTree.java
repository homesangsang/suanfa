package cn.com.homesangsang.tree;

import cn.com.homesangsang.tree.entity.BinaryTreeNode;

public class BinaryTree {
    private BinaryTreeNode root;

    public BinaryTree() {

    }

    public BinaryTree(BinaryTreeNode root) {
        this.root = root;
    }

    public BinaryTreeNode getRoot() {
        return root;
    }

    public void setRoot(BinaryTreeNode root) {
        this.root = root;
    }

    /**
     * 清楚某个节点
     * @param node
     */
    public void clear(BinaryTreeNode node) {
        if (node != null) {
            clear(node.getLeftChild());     // 递归删除左子树
            clear(node.getRightChild());    // 递归删除又子树
            node = null;
        }
    }

    /**
     * 清空树
     */
    public void clear() {
        clear(this.root);
    }

    /**
     * 判断是否为空
     * @return
     */
    public boolean isEmpty(){
        return this.root == null;
    }

    /**
     * 返回二叉树额高度
     * @return
     */
    public int height() {
        return height(root);
    }

    /**
     * 返回某节点为子树的高度
     * @param node
     * @return
     */
    public int height(BinaryTreeNode node) {
        if (node == null) {
            return 0;
        } else {
            int left = height(node.getLeftChild());
            int right = height(node.getRightChild());
            return left < right ? right+1 : left + 1;
        }
    }

    public int size() {
        return size(this.root);
    }

    /**
     * 获取某节点为子树的节点数
     * @param node
     * @return
     */
    public int size(BinaryTreeNode node) {
        if (node == null) return 0;
        else {
            int leftSize = size(node.getLeftChild());
            int rightSize = size(node.getRightChild());
            return leftSize + rightSize + 1;
        }
    }

    public BinaryTreeNode getParent(BinaryTreeNode node) {
        return (this.root == null || root == node) ? null : getParent(root, node);
    }

    /**
     * 返回某个节点的父节点
     * @param subTree
     * @param node
     * @return
     */
    public BinaryTreeNode getParent(BinaryTreeNode subTree, BinaryTreeNode node) {
        if (subTree == null) {
            return null;
        }

        // 如果子树树根的左右孩子节点之一是待查节点，那么这棵子树的树根即待查节点的父节点
        if (subTree.getLeftChild() == node || subTree.getRightChild() == node) {
            return subTree;
        }

        BinaryTreeNode parent = null;
        if ((parent = getParent(subTree.getLeftChild(), node)) != null) {
            return parent;
        } else {
            return getParent(subTree.getRightChild(), node);
        }
    }

    /**
     * 返回某个节点的左子树
     * @param node
     * @return
     */
    public BinaryTreeNode getLeftTree(BinaryTreeNode node) {
        return node.getLeftChild();
    }

    /**
     * 返回某个节点的右子树
     * @param node
     * @return
     */
    public BinaryTreeNode getRightTree(BinaryTreeNode node) {
        return node.getRightChild();
    }




}
