package String;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhangsm on 2017/6/15.
 */
public class Demo1 {
    @Test
    public void  Demo111(){
        String ss = "1，2，";
        StringBuilder stringBuilder =new StringBuilder(ss);
        if(stringBuilder.lastIndexOf("，")!=-1){

            String ss2 =stringBuilder.toString().substring(0,stringBuilder.length()-1);
            System.out.print(stringBuilder.toString().substring(0,stringBuilder.length()-1));
            System.out.print(ss2);
        }else{
            System.out.print(stringBuilder.toString());
        }
    }
    @Test
    public void Demo22(){
//        Integer.parseInt("2.0");
        String s = "2.0";
        String [] s1 =s.split("[.]");
        System.out.print(s1[0]);
    }
    @Test
    public void Demo3(){
        Boolean.valueOf("sss");
    }
    @Test
    public void Demo4(){
        List<Integer> i = null;
        for (Integer ii:i) {
            System.out.print(ii
            );
        }
    }
    @Test
    public void Demo5(){
        System.out.print(String.valueOf(1<31*24));
        List<Integer> lists = Arrays.asList(1,2,3);
//        lists.stream().filter()
    }
    @Test
    public void Demo6(){
//     System.out.print(formatTimeMillis(599999));

     System.out.print(String.valueOf(1498189637000l / (60 * 1000) * 60000));
    }
    public static String formatTimeMillis(long millis) {
        if (millis <= 0) {
            return "0分钟";
        }
        long smillis = 1000;
        long mmillis = smillis * 60;
        long hmillis = mmillis * 60;

        long hours = millis / hmillis;
        long minutes = (millis - hours * hmillis) / mmillis;

        StringBuilder display = new StringBuilder();
        if (hours > 0) {
            display.append(hours).append("小时");
        }
        if (minutes > 0) {
            display.append(minutes).append("分钟");
        }
        return display.toString();
    }

}
