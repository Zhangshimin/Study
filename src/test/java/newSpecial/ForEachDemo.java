package newSpecial;

import base.Demo;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by zhangshimin on 2017/6/3 0003.
 */
@Slf4j
public class ForEachDemo {
    @Test
    public void forEachDemo1(){
        int arr [][][]= {{{1,2},{2}},{{3},{4}},{{5},{6}}};
        for (int a [][]:arr) {
            for (int b[]:a) {
                for (int c:b) {
                    c =3;
                    System.out.println(c);
                }
            }


        }
        for (int a [][]:arr) {
            for (int b[]:a) {
                for (int c:b) {
                    System.out.println(c);
                }
            }


        }
    }
    @Test
    public  void forEachDemo2(){
        String arr [] = {"sssdfsdf","sssss"};
        for (String s:arr) {
            s=s+"alibaba";
            System.out.println(s);
        }
        for (String s:arr) {
            System.out.println(s);
        }
    }
    @Test
    public  void forEachDemo3(){
        Demo demo =new Demo();
        demo.setX1("23123123");
        Demo demo3 =new Demo();
        demo3.setX1("23133333333333333323123");
        Demo arr [] = {demo,demo3};
        for (Demo s:arr) {
            s.setX1("alibababbababa"+s.getX1());
            System.out.println(s);
        }
        for (Demo s:arr) {
            System.out.println(s);
        }
    }
}
