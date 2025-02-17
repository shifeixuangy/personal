package com.sfx.security;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: sfx
 * @Date: ${YEAR}-${MONTH}-${DAY}  ${HOUR}:${MINUTE}
 */
public class Main {

    public static void go(List<? extends Number> dest){
        System.out.println(dest);
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
        go(new ArrayList<>(Arrays.asList(111,222)));

        List<? extends Number> dest1 =new ArrayList<>();

    }
}