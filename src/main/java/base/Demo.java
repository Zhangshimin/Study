package base;

import com.google.common.collect.Lists;
import lombok.Data;
import org.testng.annotations.Test;

import java.time.LocalDate;
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
    @Test
    public  void locadateDemo(){
        LocalDate startDate = LocalDate.of(2017,7,13);
        LocalDate endDate = LocalDate.of(2017,7,14);
        for (LocalDate temp = startDate; temp.isBefore(endDate.plusDays(1)); temp=temp.plusDays(1)){
            System.out.print(temp.toString());
        }

    }
    @Test
    public  void hashcode(){
        System.out.print("452770".hashCode()%100);
    }



    

}
