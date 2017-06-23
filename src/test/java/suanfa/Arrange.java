package suanfa;


import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by zhangsm on 2017/6/13.
 */
public class Arrange {
    public static void main(String[] args) {
//        char[] chs = {'a','b','c','d'};
//        arrange(chs, 0, chs.length);
//        String s = "注意：时间范围和班次必须使用现有的导出样式，不可修改，否则系统无法识别";
//        System.out.print(s.length());
        List<String> ss = Lists.newArrayList("张","三");
        System.out.print(ss.toString().substring(1,ss.toString().length()-1));
    }
    public static void arrange(char[] chs, int start, int len){
        if(start == len-1){
            for(int i=0; i<chs.length; ++i)
                System.out.print(chs[i]);
            System.out.println();
            return;
        }
        for(int i=start; i<len; i++){
            char temp = chs[start];
            chs[start] = chs[i];
            chs[i] = temp;
            arrange(chs, start+1, len);
            temp = chs[start];
            chs[start] = chs[i];
            chs[i] = temp;
        }
    }
}
