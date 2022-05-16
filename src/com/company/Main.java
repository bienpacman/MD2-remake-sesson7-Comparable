package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle();
        circles[1] = new ComparableCircle(3.6);
        circles[2] = new ComparableCircle(3.7,"blue",true);

        System.out.println("được sắp xếp trước :");
        for (ComparableCircle circle: circles  ) {
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println("Sắp xếp sau :");
        for (ComparableCircle circle: circles ) {
            System.out.println(circle);
        }
    }
}
