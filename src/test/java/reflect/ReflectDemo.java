package reflect;

import base.Demo;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

/**
 * Created by zhangsm on 2017/6/1.
 */
@Slf4j
public class ReflectDemo {

    @Test
    public void getClassDemo(){
        log.info("Demo");
        Class <?> c1 = null;
        try {
             c1 = Class.forName("base.Demo");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void getPackageName(){
        Demo demo = new Demo();
        log.info(demo.getClass().getName());
        log.info(demo.getClass().getCanonicalName());
        log.info(demo.getClass().getSimpleName());
        log.info(demo.getClass().getTypeName());

    }
}
