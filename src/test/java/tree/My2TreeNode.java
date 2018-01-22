package tree;

import lombok.Data;

/**
 * Created by zhangsm on 2017/11/15.
 * 链表实现
 */
@Data
public class My2TreeNode<T> {
    private T date;
    private My2TreeNode left;
    private My2TreeNode right;

}
