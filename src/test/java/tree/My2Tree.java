//package tree;
//
//import lombok.Data;
//
///**
// * Created by zhangsm on 2017/11/15.
// */
//@Data
//public class My2Tree<T> {
//    private My2TreeNode<T> mRoot;
//
//    public My2Tree(My2TreeNode<T> mRoot) {
//        this.mRoot = mRoot;
//    }
//
//    public void setLeftChild(My2TreeNode<T> mLeftChild) {
//        checkEmply();
//        mRoot.setLeft(mLeftChild);
//    }
//
//    public void setRightChild(My2TreeNode<T> mRightChild) {
//        checkEmply();
//        mRoot.setLeft(mRightChild);
//    }
//
//    public void deleteMy2TreeNode(My2TreeNode<T> deleteNode) {
//        checkEmply();
//        if (deleteNode == null) //递归出口
//            return;
//        deleteMy2TreeNode(deleteNode.getLeft());
//        deleteMy2TreeNode(deleteNode.getRight());
//        deleteNode = null;
//    }
//
//    public void clear() {
//        if (mRoot == null)
//            return;
//        deleteMy2TreeNode(mRoot);
//    }
//    public int getTreeHeight(My2TreeNode<T> mNode){
//        if (mNode == null)
//            return 0;
//
//    }
//
//    private void checkEmply() {
//        if (mRoot == null)
//            throw new NullPointerException();
//    }
//}
