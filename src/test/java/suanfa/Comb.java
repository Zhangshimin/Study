package suanfa;

import com.google.common.collect.Lists;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by zhangsm on 2017/6/13.
 */
public class Comb {
    public static void main(String[] args) {
        int [] i = new int[2];
        for (int j=0;j<i.length;j++ ){
            i[j]=j+1;
        }
        String [] ss =comb(i);
        for (String s:
             ss) {
           System.out.println(s);
        }
    }

    private static String[]  comb(int[] scheduleNum) {
        int len = scheduleNum.length;
        List<String> scheduleStrList = Lists.newArrayList();
//        scheduleStrList.add("休");
        int nbits = 1 << len;
        for (int i = 0; i < nbits; ++i) {
            int t;
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < len; j++) {
                t = 1 << j;
                if ((t & i) != 0) { // 与运算，同为1时才会是1
                    sb.append(scheduleNum[j]);
//                    sb.append(",");
                }
            }
            if(sb.length()==0||sb.length()>6)
                continue;
            scheduleStrList.add(sb.toString().substring(0,sb.length()-1));
        }
        Collections.sort(scheduleStrList,new MyComparator());
        scheduleStrList.add(0,"休");
        return (String[]) scheduleStrList.toArray(new String[scheduleStrList.size()]);
    }
     static class MyComparator implements Comparator {


        @Override
        public int compare(Object o1, Object o2) {
            String s1 =o1.toString();
            String s2 =o2.toString();
            if(s1.length()>s2.length()){
            return s1.length()-s2.length();
            }
            if (s1.length()<s2.length()){
                return s1.length()-s2.length();
            }
            if (s1.length()==s2.length()){
                return s1.compareTo(s2);
            }

            return 0;
        }
    }
    }
