package String;

import base.Demo;
import com.google.common.base.Strings;
import com.google.gson.Gson;
import org.testng.annotations.Test;
import org.testng.collections.Lists;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

     System.out.print(String.valueOf(1498014900001l / (60 * 1000) * 60000));
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
    @Test
    public  void Demo7(){
        System.out.print(Float.parseFloat("-1"));
    }
     @Test
    public  void Demo8(){
         List<Integer> u =Lists.newArrayList(1);
         u.remove(Integer.valueOf(1));
        System.out.print(u.toString());
    }
    @Test
    public  void Demo9(){
        List<Integer> u =Lists.newArrayList(1);
        u.remove(Integer.valueOf(1));
        System.out.print(u.toString());
        Map<String,String> ss = new HashMap<>();
        ss.put("aa","sss");
        System.out.print(ss.get("aaq"));
    }
    @Test
    public  void Demo10(){
//        System.out.println(isFloat(""));
//        System.out.println(isFloat("aaa"));
//        System.out.println(isFloat("123a"));
//        System.out.println(isFloat("a"));
//        System.out.println(isFloat("-20"));
//        System.out.println(isFloat("3.2222"));
//        System.out.println(Float.valueOf(""));
//        float usedSysOutYearHoliday = 1.229222f;
//        usedSysOutYearHoliday  = (float)(Math.round(usedSysOutYearHoliday*100))/100;
//        System.out.print(usedSysOutYearHoliday);
        DecimalFormat formater = new DecimalFormat("#0.00");
        System.out.println("1.123".substring(0,"1.123".indexOf(".")+3));
        System.out.println(formater.format(122222.009));
        String num = "(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)";
        String regex = "^" + num + "\\." + num + "\\." + num + "\\." + num + "$";
        System.out.print( match(regex, "192.168.1.1"));
        System.out.print(isMatchDouble("0.22q1123"));
        Double.parseDouble("0000000");

    }
    private static boolean match(String regex, String str) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    /**
     * @param d
     * @return
     */
    public static boolean isMatchDouble(String d) {
        return d.matches("^\\d{1,2}(.\\d*)?$");
    }
    /**
     * 转义正则特殊字符 （$()*+.[]?\^{},|）
     *
     * @param keyword
     * @return
     */
    public static String escapeExprSpecialWord(String keyword) {
        if (!Strings.isNullOrEmpty(keyword)) {
            String[] fbsArr = { "\\", "$", "(", ")", "*", "+", ".", "[", "]", "?", "^", "{", "}", "|" };
            for (String key : fbsArr) {
                if (keyword.contains(key)) {
                    keyword = keyword.replace(key, "\\" + key);
                }
            }
        }
        return keyword;
    }
    public Boolean isFloat(String str){
        try {
            Float.valueOf(str);//把字符串强制转换为数字
            return true;//如果是数字，返回True
        } catch (Exception e) {
            return false;//如果抛出异常，返回False
        }
    }
    @Test
    public void null2Json(){
        Demo demo = new Demo();
        demo.setX1(null);
        System.out.print(new Gson().toJson(demo).toString());


        String[] sss = {"ssss,sss","ssdfsfd","sdfsdf"};
        Arrays.stream(sss).forEach(System.out::println);
    }
    @Test
    public void nullExContion(){
        System.out.print("Start !!!!");
        try {
            Demo demo = null;
            demo.getX1();
        }catch (NullPointerException e){
            System.out.print("catch !!!!!");
        }
        System.out.print("End !!!!!");
    }
    @Test
    public void hashcode4db(){
      System.out.print(Math.abs("gddlbs".hashCode()%100));
        Boolean.valueOf(true);
    }
    @Test
    public void sub1(){
        System.out.println("570000".substring(0,3));
//        Double d = null;
//        System.out.print(d.doubleValue());

//        System.out.print(null!=null?"true":"false");
    Demo d = new Demo();
    d.setX1(null);

    String [] ss = getFeedTimeStr(2,1503536400000l,1503536400000l);
    System.out.println(ss[0]);
    System.out.print(ss[1]);
    }

    private String[] getFeedTimeStr(int unit, long beginTime, long endTime) {
        String[] result = new String[2];
        switch (unit) {
            case 2:
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd a", Locale.ENGLISH);
                result[0] = dateFormat.format(new Date(beginTime));
                result[1] = dateFormat.format(new Date(endTime));
                break;

        }
        return result;
    }
}
