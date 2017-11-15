package functionalInterface;

/**
 * Created by zhangsm on 2017/6/22.
 */
public class FunctionalInterfaceWithException {
    public static void main(String args [] ){
//        System.out.print("58675".hashCode()%100);
//        String todayStr = LocalDate.now().toString();
//       System.out.print(todayStr.compareTo("2017-05-23"));
        System.out.print((float) (3600001l / 1000 / 60 / 60f));
        System.out.print((float) (Math.ceil((3600001l / 1000f / 60f / 60f) * 10)) / 10);
    }
}
