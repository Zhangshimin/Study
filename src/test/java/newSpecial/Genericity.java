package newSpecial;

import base.Point;
import org.testng.annotations.Test;

/**
 * Created by zhangshimin on 2017/6/3 0003.
 * 泛型
 *
 */
public class Genericity {
    /**
     * 泛型的引入
     * 应该在代码运行之前，排查出来
     * ClassCastException 强制转换异常
     * 1.5 使用 泛型
     */
    @Test
    public void genericityDemo1(){
        Point point = new Point(1,2);
        Point point1 = new Point("yi","er");
        Point point2 = new Point(2.1,3.2);
        System.out.println(point);
        System.out.println(point1);
        System.out.println(point2);

    }

    /**
     *1. 如果没有指定泛型类型。当成Object类型
     *2. 1.7开始可以简化泛型
     */
    @Test
    public void genericityDemo2(){
     Point <String>ss= new Point<>("111","22");
        String ss1 = ss.getX();
        System.out.print(ss1);

    }




    /**
     * 通配符问题
     *
     */
    @Test
    public void genericityDemo3(){
        Point <Integer>ss= new Point<>(111,22);
//        run(ss);
        //解决方法一
        run2(ss);
    }

    /**
     * 泛型接口
     * 1. 子类也设置泛型
     * 2. 子类确定类型
     */
    @Test
    public void genericityDemo4(){
    }

    /**
     * 泛型方法
     *
     */
    @Test
    public void genericityDemo5(){
        String s = returns("ssss");
        int a = returns(1);

    }
    static <T>T returns (T t){
        return t;
    }




    public static void run(Point<String>ss){

    }
    //不设置泛型 相当于Object
    public static void run2(Point ss){

    }

    /**
     * ? 通配符
     * ? extends 类  :设置泛型下限  可以在声明上和参数上使用
     *      ? extends Number    : 可以设置Number或Number的子类
     * ? super 类    :设置泛型上限
     *      ? extends String    : 可以设置String 或者String的父类
     * @param ss
     */
    public static void run3(Point <?>ss){ //明确的表示 不能设置 只能取出

    }



    interface  IMessage<T>{
    void print (T t);
    }

    /**
     * 实现继续使用泛型
     * @param <T>
     */
     class MessageIm<T> implements  IMessage<T>{

         @Override
         public void print(T t) {

         }
     }

    /**
     * 实现通过接口的泛型确定类型
     */
    class  MessageIme implements  IMessage<String >{
         @Override
         public void print(String s) {

         }
     }
}

