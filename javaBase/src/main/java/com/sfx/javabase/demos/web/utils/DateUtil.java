package com.sfx.javabase.demos.web.utils;
import org.springframework.util.StringUtils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class DateUtil {

    public static final String MILLI_SECOND_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";

    public static final String SECOND_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static final String DAY_FORMAT = "yyyy-MM-dd";

    public static final String ZH_DAY_FORMAT = "yyyy年MM月dd日";

    public static final String ZH_TC_FORMAT = "yyyyMMddHHmmss";

    public static final String DATA_FORMAT = "yyyyMM";
    public static final String DATA_DAY_FORMAT = "yyyyMMdd";


    /**
     * 将LocalDateTime转string
     *
     * @param time LocalDateTime
     * @return 格式 yyyy-MM-dd HH:mm:ss
     */
    public static String localDateTimeToString(LocalDateTime time) {
        if (null == time) {
            return null;
        }
        return DateTimeFormatter.ofPattern(SECOND_FORMAT).format(time);
    }

    /**
     * 获取当前系统时间加上X小时
     *
     * @return String yyyy-MM-dd HH:mm:ss
     */
    public static String getSystemDatePlusHour(String value) {
        SimpleDateFormat sdf = new SimpleDateFormat(SECOND_FORMAT);
        Calendar rightNow = Calendar.getInstance();
        Date dt = new Date();
        rightNow.setTime(dt);
        rightNow.add(Calendar.HOUR_OF_DAY, Integer.parseInt(value));
        return sdf.format(rightNow.getTime());
    }

    /**
     * 获取当前时间
     *
     * @return String yyyy-MM-dd HH:mm:ss
     */
    public static Timestamp getDateTime() {
        Date date = new Date();
        Timestamp dateTimeStamp = new Timestamp(date.getTime());
        return dateTimeStamp;
    }

    /**
     * 获取当前系统时间加上X分钟
     *
     * @return String yyyy-MM-dd HH:mm:ss
     */
    public static String getSystemDatePlusMinute(String value) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar rightNow = Calendar.getInstance();
        Date dt = new Date();
        rightNow.setTime(dt);
        rightNow.add(Calendar.MINUTE, Integer.parseInt(value));
        return sdf.format(rightNow.getTime());
    }

    /**
     * 获取前一天日期
     *
     * @return
     */
    public static String getYesterDay(String format) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        String yesterday = new SimpleDateFormat(format).format(cal.getTime());
        return yesterday;
    }


    /**
     * 获取当前系统时间
     *
     * @return String yyyy-MM-dd HH:mm:ss
     */
    public static String getSystemDate() {
        SimpleDateFormat sdf = new SimpleDateFormat(SECOND_FORMAT);
        return sdf.format(new Date());
    }

    /**
     * 获取当前系统时间
     *
     * @return String yyyy-MM-dd HH:mm:ss
     */
    public static String getSystemDate(String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(new Date());
    }

    /**
     * 获取当前系统时间(精确到毫秒)
     *
     * @return String yyyy-MM-dd HH:mm:ss.SSS
     */
    public static String getSystemMSDate() {
        SimpleDateFormat sdf = new SimpleDateFormat(MILLI_SECOND_FORMAT);
        return sdf.format(new Date());
    }

    /**
     * 获取给定时间的毫秒字符串
     *
     * @param date
     * @return
     */
    public static String getMSDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(MILLI_SECOND_FORMAT);
        return sdf.format(new Date());
    }

    /**
     * 获取当前日期
     *
     * @return String yyyy-MM-dd
     */
    public static String getCurrentDate() {
        SimpleDateFormat sdf = new SimpleDateFormat(DAY_FORMAT);
        return sdf.format(new Date());
    }

    /**
     * 获取指定日期
     *
     * @return String yyyy-MM-dd
     */
    public static String getDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(DAY_FORMAT);
        return sdf.format(date);
    }

    /**
     * 获取当前系统时间戳
     *
     * @return long 当前系统时间戳
     */
    public static long getSystemTime() {
        return new Date().getTime();
    }

    /**
     * 获取时间戳
     *
     * @return long 时间戳
     */
    public static long getLongTime(String timeStr) {
        SimpleDateFormat sdf = new SimpleDateFormat(MILLI_SECOND_FORMAT);
        try {
            Date date = sdf.parse(timeStr);
            return date.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * 获取时间戳
     *
     * @return long 时间戳
     */
    public static long getLongTime(String timeStr, String fmt) {
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        try {
            Date date = sdf.parse(timeStr);
            return date.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * 获取时间戳
     *
     * @return long 时间戳
     */
    public static long getLongTime(Date date) {
        return date.getTime();
    }

    /**
     * 获取格式化的时间
     *
     * @param date 需要格式化的时间
     * @return 格式化的时间
     */
    public static String getFormatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(SECOND_FORMAT);
        return sdf.format(date);
    }

    /**
     * 获取格式化的时间
     *
     * @param date 需要格式化的时间
     * @return 格式化的时间
     */
    public static String getFormatDate(Date date, String formatStr) {
        if (StringUtils.isEmpty(formatStr)) {
            return getFormatDate(date);
        }
        SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
        return sdf.format(date);
    }

    /**
     * 获取格式化的时间
     *
     * @param time 需要格式化的时间
     * @return 格式化的时间
     */
    public static String getFormatDate(long time, String formatStr) {
        if (StringUtils.isEmpty(formatStr)) {
            return getFormatDate(new Date(time));
        }

        SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
        return sdf.format(new Date(time));
    }

    /**
     * 获取格式化中文时间
     *
     * @return 格式化中文时间
     */
    public static String getZhFormatDate() {
        SimpleDateFormat sdf = new SimpleDateFormat(ZH_DAY_FORMAT);
        return sdf.format(new Date());
    }

    /**
     * @param date 格式化的时间字符串
     * @return 已转换的时间类型
     * @Title: parse
     * @Description:
     * @return: Date
     */
    public static Date parse(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(SECOND_FORMAT);
        return sdf.parse(date);
    }

    /**
     * @param date   格式化的时间字符串
     * @param format 时间格式
     * @return 已转换的时间类型
     * @Title: parse
     * @Description:
     * @return: Date
     */
    public static Date parse(String date, String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.parse(date);
    }

    /**
     * 将字符串格式的时间转换成long
     *
     * @param dateStr 时间字符串
     * @param format  格式字符串
     * @return
     * @throws ParseException
     */
    public static long parseLongTime(String dateStr, String format) throws ParseException {
        return getLongTime(parse(dateStr, format));
    }


    /**
     * 毫秒转换时分秒
     *
     * @param ms
     * @return
     */
    public static String formatTime(Long ms) {
        Integer ss = 1000;
        Integer mi = ss * 60;
        Integer hh = mi * 60;
        Integer dd = hh * 24;

        Long day = ms / dd;
        Long hour = (ms - day * dd) / hh;
        Long minute = (ms - day * dd - hour * hh) / mi;
        Long second = (ms - day * dd - hour * hh - minute * mi) / ss;
        Long milliSecond = ms - day * dd - hour * hh - minute * mi - second * ss;

        StringBuffer sb = new StringBuffer();
        if (day > 0) {
            sb.append(day + "天");
        }
        if (hour > 0) {
            sb.append(hour + "小时");
        }
        if (minute > 0) {
            sb.append(minute + "分");
        }
        if (second > 0) {
            sb.append(second + "秒");
        }
        if (milliSecond > 0) {
            sb.append(milliSecond + "毫秒");
        }
        return sb.toString();
    }

    /**
     * 时间戳转换成 Date(yyyy-MM-dd HH:mm:ss)
     *
     * @param timestamp 时间戳
     * @return
     */
    public static Date getTimestampDate(String timestamp) {
        if (StringUtils.isEmpty(timestamp)) {
            return null;
        }
        //时间格式化
        SimpleDateFormat format = new SimpleDateFormat(SECOND_FORMAT);
        String timeStr = format.format(Long.valueOf(timestamp));
        Date sendTime = null;
        try {
            sendTime = format.parse(timeStr);
        } catch (ParseException e) {
            sendTime = new Date();
        }
        return sendTime;
    }

    /**
     * 时间戳转换成 Date(yyyy-MM-dd HH:mm:ss)
     *
     * @param timestamp 时间戳
     * @return
     */
    public static Date getTimestampDate(Long timestamp) {
        if (StringUtils.isEmpty(timestamp)) {
            return null;
        }
        //时间格式化
        SimpleDateFormat format = new SimpleDateFormat(SECOND_FORMAT);
        String timeStr = format.format(Long.valueOf(timestamp));
        Date sendTime = null;
        try {
            sendTime = format.parse(timeStr);
        } catch (ParseException e) {
            sendTime = new Date();
        }
        return sendTime;
    }

    /**
     * 获取当天最后时间
     *
     * @return
     */
    public static Date getTodayLast() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        cal.set(Calendar.MILLISECOND, 999);
        return cal.getTime();
    }

    /**
     * 获取小时时间
     *
     * @param date
     * @param hour
     * @return
     */
    public static Date getHourDate(Date date, Integer hour) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, hour);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        return cal.getTime();
    }

    /**
     * 获取当天最后时间
     *
     * @return
     */
    public static Date get() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        cal.set(Calendar.MILLISECOND, 999);
        return cal.getTime();
    }

    /**
     * 获取昨天开始时间
     *
     * @return
     */
    public static Date getYesterdayBegin() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DATE, -1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        return cal.getTime();
    }

    /**
     * 获取昨日结束时间
     *
     * @return
     */
    public static Date getYesterdayEnd() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DATE, -1);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        cal.set(Calendar.MILLISECOND, 999);
        return cal.getTime();
    }

    /**
     * 获取某年第一天
     *
     * @param yearStr
     * @return
     */
    public static Date getYearFirst(String yearStr) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, Integer.parseInt(yearStr));
        return calendar.getTime();
    }

    /**
     * 获取某年最后一天
     *
     * @param yearStr
     * @return
     */
    public static Date getYearLast(String yearStr) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, Integer.parseInt(yearStr));
        calendar.roll(Calendar.DAY_OF_YEAR, -1);
        return calendar.getTime();
    }

    /**
     * 获取上一个月 月份值
     *
     * @return
     */
    public static String getLastMonthStr() {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMM");
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        // 设置为当前时间
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, -1);
        date = calendar.getTime();
        return format.format(date);

    }

    /**
     * 获取指定时间区间内的年份集合
     *
     * @param startTime
     * @param endTime
     * @return
     */
    public static List<String> getYearList(LocalDate startTime, LocalDate endTime) {
        List<String> yearList = new ArrayList<>();
        int startYear = startTime.getYear();
        int endYear = endTime.getYear();
        while (startYear < endYear || startYear == endYear) {
            yearList.add(String.valueOf(startYear));
            startYear++;
        }
        return yearList;
    }

    /**
     * 获取yyyyMM 字符串的当月的第一天
     *
     * @return
     */
    public static String getMonthFirstDay(String dateStr) {
        LocalDate date = LocalDate.parse(dateStr + "01", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate dateFirst = date.with(TemporalAdjusters.firstDayOfMonth()); // 指定年月的第一天
        return dateFirst.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
    }

    /**
     * 获取yyyyMM 字符串的当月的最后一天
     *
     * @return
     */
    public static String getMonthLastDay(String dateStr) {
        LocalDate date = LocalDate.parse(dateStr + "01", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate dateEnd = date.with(TemporalAdjusters.lastDayOfMonth()); //
        return dateEnd.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
    }


}
