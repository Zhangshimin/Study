package newSpecial;

import com.google.common.collect.Lists;
import org.testng.annotations.Test;

import java.util.List;

import static base.Demo.*;

/**
 * Created by zhangshimin on 2017/6/3 0003.
 */
public class StaticImport {
    @Test
    public void staticImportDemo1(){
        staticMethod();
    }
    @Test
    public void forDemo(){
        for (int i = 0; i < 2; i+=0) {
            System.out.print("12312312312");
        }
    }
    @Test
    public void nullListForeach(){
        List <String> ss = Lists.newArrayList();
        for (String s :ss){
            System.out.print(s);
        }
    }
}
