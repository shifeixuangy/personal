package com.sfx.javabase.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class genericsTest {

    /**
     * 通配符是解决 泛型无法协变而引入的
     *
     *
     * 1.“?”通过自身或者extends或者super能限定一个范围（上限、下限）。
     * 2.在赋值时，校验值尖括号里的类型是否在“?”限定的范围内。
     * 3.在更新或插入值时，校验值的类型是否是“?”的下限的类型或者是下限的子类类型。
     *
     *
     *
     * <? extends T>确定了上界为T，那么获取值时类型一定是T或T的父类，但赋值时由于不能确定具体是T或者T的某个子类而赋值失败。  协变 PECS（Producer-Extends, Consumer-Super）
     *
     * <? super T>确定了下界为T，那么在获取值时不确定类型是T或T的哪个父类，只能用Object接收，使得类型信息丢失，但赋值时只要为T或T的父类都可以。 逆变
     **/


    public static void main(String[] args) {
        //? 通配符测试
        generics1(new ArrayList<>(Arrays.asList(111, 222)));

        generics2();

        generics3(new ArrayList<>(Arrays.asList("111", "222")));


    }

    public static void generics1(List<? extends Number> dest) {
        System.out.println(dest);
    }

    private static void generics2() {

        List<? extends Number> list = new ArrayList<>();
        //下面会报错
        // list.add(new Integer(1));

    }

    public static <T> void generics3(List<? extends T> dest) {
        System.out.println(dest);




    }
}
