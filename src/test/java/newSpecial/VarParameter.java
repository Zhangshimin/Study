package newSpecial;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

/**
 * Created by zhangshimin on 2017/6/3 0003.
 * 可变参数
 * 1.只能出现在参数的最后
 * 2.在调用这种方法的时候，编译器会隐式的创建一个数组。在方法内部其实使用数组调用的
 * 3.“...”位于类型与变量名之间。有无空格不重要
 */
@Slf4j
public class VarParameter {
    /**
     *
     *
     */
    @Test
    public void  changeParameter1(){
        int [] ss = {1,2,3,22,3};
        log.info(add2(ss)+"");
        log.info(add2(1,2,3,22,3)+"");
        log.info(String.valueOf(add(ss)));
    }

    public static int add(int [] data){
        int sum=0;
//        for (int i = 0; i < data.length; i++) {
//            sum+=data[i];
//        }
        for ( int a:data) {
            sum+=a;
        }

        return sum;
    }
    public static int add2 (int ...data){
        int sum=0;
        for (int i = 0; i < data.length; i++) {
            sum+=data[i];
        }

        return sum;
    }

}
