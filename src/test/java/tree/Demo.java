package tree;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangsm on 2017/11/15.
 */
public class Demo {

    public static void  main(String args []){
//        My2TreeNode<Integer> mRoot = new My2TreeNode();
//        mRoot.setDate(1);
//        My2Tree<String> stringMy2Tree = new My2Tree<>(mRoot);
//        stringMy2Tree.setLeftChild();
        Map<Integer,Integer> map = new HashMap<>();
        map.put(null,2);
        System.out.print(map.get(null));
    }
}
