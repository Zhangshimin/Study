package abstractAndInterface;

import org.testng.annotations.Test;
import org.testng.collections.Lists;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangsm on 2017/8/28.
 */
public class AlarmDoor<T> extends Door implements Alarm {


    public AlarmDoor() {
        System.out.print("222");
    }

    @Override
    void open() {
        System.out.print(caiZhi + "apen");
    }

    @Override
    void close() {
        System.out.print(caiZhi + "close");
    }

    @Override
    public void alarm() {
        System.out.println("-------end");
    }


    @Test
    public void test1() {
        Door door = new AlarmDoor();
        door.setCaiZhi("傻掉");
        door.open();
        door.close();
        Alarm alarm = (Alarm) door;
        alarm.blackAlarm();
        alarm.alarm();
    }

    @Test
    public void test2() {
        Object[] objects = new Long[1];
        objects[0] = "2222";
        List<AlarmDoor> objectList = new ArrayList<>();
    }

    @Test
    public void test3() {
        List<AlarmDoor> alarmDoorList = Lists.newArrayList();
//        alarmDoorList.add(new Door());
        List<Door> doorList = Lists.newArrayList();
        doorList.add(new AlarmDoor());
        alarmDoor2Door(doorList);
        alarmDoor2Door(alarmDoorList);
        door2Alarm(doorList);
        door2Alarm(alarmDoorList);

    }

    @Test
    public void testTTTT() {
        AlarmDoor ad = new AlarmDoor();
        ad.ttt(11, true);
    }

    void alarmDoor2Door(List<? super AlarmDoor> args) {
        System.out.print("ssssss ? super AlarmDoor");
        return;
    }

    void door2Alarm(List<? extends Door> args) {
        System.out.print("ssssss ?extends Door");
    }

    private static <T1, T2, T3> T3 ttt(T1 t1, T2 t2) {
        System.out.print(t1);
        System.out.print(t2);
        T3 t3 = null;

        return t3;
    }

    @Test
    void toEachDay() {
        LocalDate date1 = LocalDate.parse("2017-02-22");
        System.out.print(date1.toEpochDay());
    }

    @Test
    void floatcalc() {
        Double s = 1.222*223/222;
        double ss = 1.222*223/222;
        System.out.println(s.floatValue());
        System.out.println(ss);

    }
}
