package com.exercise1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wecash on 19/3/19.
 */
public class CalculateDay {

    static Map<Integer, Integer> monthDayMap = new HashMap<>();

    static {
        monthDayMap.put(1, 31);
        monthDayMap.put(3, 31);
        monthDayMap.put(4, 30);
        monthDayMap.put(5, 31);
        monthDayMap.put(6, 30);
        monthDayMap.put(7, 31);
        monthDayMap.put(8, 31);
        monthDayMap.put(9, 30);
        monthDayMap.put(10, 31);
        monthDayMap.put(11, 30);
        monthDayMap.put(12, 31);
    }

    public static void main(String[] args) {
        int year = 2000;
        int month = 5;
        int day = 1;
        CalculateDay d = new CalculateDay();
        System.out.print(d.calculateDay(year, month, day));
    }


    private int calculateDay(int year, int month, int day) {
        int sumDay = day;
        for (int i = 1; i < month; i++) {
            sumDay += getDayOfMonth(i, year);
        }
        return sumDay;
    }

    private int getDayOfMonth(int i, int year) {
        if (i == 2) {
            if (isRunnian(year)) {
                return 29;
            } else {
                return 28;
            }
        }
        return monthDayMap.get(i);
    }

    private boolean isRunnian(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
