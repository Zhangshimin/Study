package util;

import org.testng.collections.Lists;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by zhangsm on 2017/12/19.
 */
public class LocationUtils {

    private static double EARTH_RADIUS = 6378.137;

    private static double rad(double d) {
        return d * Math.PI / 180.0;
    }

    /**
     * 通过经纬度获取距离(单位：米)
     * @param lat1
     * @param lng1
     * @param lat2
     * @param lng2
     * @return
     */
    public static double getDistance(double lat1, double lng1, double lat2,
                                     double lng2) {
        double radLat1 = rad(lat1);
        double radLat2 = rad(lat2);
        double a = radLat1 - radLat2;
        double b = rad(lng1) - rad(lng2);
        double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2)
                + Math.cos(radLat1) * Math.cos(radLat2)
                * Math.pow(Math.sin(b / 2), 2)));
        s = s * EARTH_RADIUS;
        s = Math.round(s * 10000d) / 10000d;
        s = s*1000;
        return s;
    }

    public static void main(String[] args) {
//        List<PointDemo> pointDemoList = JSONArray.parseArray("[{ \"CiLon\" : 113.9529, \"CiLat\" : 22.5417 },\n" +
//                "{ \"CiLon\" : 113.117, \"CiLat\" : 22.7995 },\n" +
//                "{ \"CiLon\" : 116.6107, \"CiLat\" : 39.92917 },\n" +
//                "{ \"CiLon\" : 113.9536, \"CiLat\" : 22.5423 },\n" +
//                "{ \"CiLon\" : 113.941, \"CiLat\" : 22.4967 },\n" +
//                "{ \"CiLon\" : 113.3864, \"CiLat\" : 23.05658 },\n" +
//                "{ \"CiLon\" : 119.873, \"CiLat\" : 31.8907 },\n" +
//                "{ \"CiLon\" : 113.9549, \"CiLat\" : 22.54429 },\n" +
//                "{ \"CiLon\" : 116.3319, \"CiLat\" : 39.97674 },\n" +
//                "{ \"CiLon\" : 116.332, \"CiLat\" : 39.9765 },\n" +
//                "{ \"CiLon\" : 114.2908, \"CiLat\" : 22.61566 },\n" +
//                "{ \"CiLon\" : 114.2907, \"CiLat\" : 22.61565 },\n" +
//                "{ \"CiLon\" : 114.2901, \"CiLat\" : 22.61534 },\n" +
//                "{ \"CiLon\" : 116.482, \"CiLat\" : 40.0444 },\n" +
//                "{ \"CiLon\" : -122.4042, \"CiLat\" : 37.64352 },\n" +
//                "{ \"CiLon\" : 116.384, \"CiLat\" : 39.8894 },\n" +
//                "{ \"CiLon\" : 113.8966, \"CiLat\" : 22.96915 }]", PointDemo.class);
//        PointDemo tempPointDemo = null;
//        double m = 0;
//        for (PointDemo pointDemo : pointDemoList) {
//            if (tempPointDemo == null) {
//                tempPointDemo = pointDemo;
//                continue;
//            }
//            m += getDistance(pointDemo.getCiLat(), pointDemo.getCiLon(), tempPointDemo.getCiLat(), tempPointDemo.getCiLon());
//            tempPointDemo = pointDemo;
//        }
//      System.out.print(m/1000);
//        System.out.print("09:00".compareTo("18:30"));
        List<Integer> doubleList = Lists.newArrayList();
        doubleList.add(2);
        doubleList.add(1);
        doubleList = doubleList.stream().sorted((o1, o2) -> Integer.compare(o2, o1)).collect(Collectors.toList());
        System.out.print("ssss");
        for (Integer aDouble : doubleList) {
            System.out.print(aDouble);
        }
    }
}

