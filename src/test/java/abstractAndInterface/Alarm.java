package abstractAndInterface;

/**
 * Created by zhangsm on 2017/8/28.
 */
public interface Alarm {
    void alarm();

    default void blackAlarm() {
        printTemp();
    }

    ;

    static void printTemp() {
        System.out.println("blackAlam");

    }
}
