package functionalInterface;

import java.time.LocalDate;

/**
 * Created by zhangsm on 2017/6/22.
 */
public class FunctionalInterfaceWithException {
    public static void main(String args [] ){
//        System.out.print("57351".hashCode()%100);
        String todayStr = LocalDate.now().toString();
       System.out.print(todayStr.compareTo("2017-05-23"));
    }
}
