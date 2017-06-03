package reflect;

import base.Demo;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by zhangsm on 2017/6/1.
 */
@Slf4j
public class ReflectDemo {

    @Test
    public void getClassDemo(){
        log.info("GetClass1  Class.forName()");
        Class <?> c1 = null;
        try {
             c1 = Class.forName("base.Demo");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        log.info("GetClass2  Object.getClass");
        Demo demo = new Demo();
        Class clazz = demo.getClass();
        log.info("GetClass3  Class class = Double[].class");
        Class clazz2 = Double[].class;
        System.out.print(clazz2.getName());

    }
    @Test
    public void getPackageName(){
        Demo demo = new Demo();
        List<Double> ss = Lists.newArrayList() ;
        log.info(demo.getClass().getName());
        log.info(demo.getClass().getCanonicalName());
        log.info(demo.getClass().getSimpleName());
        log.info(demo.getClass().getTypeName());
        log.info(demo.getClass().getSuperclass().getName());
        log.info(demo.getClass().isArray()+"");
        log.info(ss.getClass().getComponentType().toString());
        log.info(demo.getClass().getClassLoader().toString());
        try {
            Method method = demo.getClass().getMethod("getName");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
