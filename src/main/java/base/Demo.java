package base;

import com.google.common.collect.Lists;
import lombok.Data;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by zhangsm on 2017/6/1.
 */
@Data
public class Demo {
    private String x1;
    @Test
    public static void staticMethod(){
        List<Integer> ss = Lists.newArrayList(1,2,3);
        System.out.print(ss.toString());
        ss.forEach(System.out::println);

    }



    

}
