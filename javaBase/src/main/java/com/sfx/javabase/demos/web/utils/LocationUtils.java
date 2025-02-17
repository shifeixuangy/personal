package com.sfx.javabase.demos.web.utils;

import org.springframework.stereotype.Component;

/**
 * 经度纬度位置偏差
 *
 * @author admin
 */

@Component

public class LocationUtils {
    private static double EARTH_RADIUS = 6378.137;

    private static double rad(double d) {
        return d * Math.PI / 180.0;
    }




    /**
     * 通过经纬度获取距离(单位：米)
     *
     * @param lat1 第一个纬度
     * @param lng1 第一个经度
     * @param lat2 第二个纬度
     * @param lng2 第二个经度
     * @return 距离
     */
    public static double getDistance(double lat1, double lng1, double lat2, double lng2) {
        double radLat1 = rad(lat1);
        double radLat2 = rad(lat2);
        double a = radLat1 - radLat2;
        double b = rad(lng1) - rad(lng2);
        double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2)
                + Math.cos(radLat1) * Math.cos(radLat2)
                * Math.pow(Math.sin(b / 2), 2)));
        s = s * EARTH_RADIUS;
        s = Math.round(s * 10000d) / 10000d;
        s = s * 1000;
        return s;
    }

    public static void main(String[] args) {
        double test =LocationUtils.getDistance(33.446319
        ,119.691911,33.442397,119.693738);

        System.out.println(test);

        double current =LocationUtils.getDistance(119.691911,33.446319
                ,119.693738,33.442397);

        System.out.println(current);
    }


}