package com.epam.pavloshekhovtsov.task1.list;

import com.epam.pavloshekhovtsov.task1.entity.Technique;

import java.util.List;

public class Example {

    public static void main(String[] args) {

        MyContainer tech_list = new MyContainer();
        Technique tech1 = new Technique(1, 300, "TV");
        Technique tech2 = new Technique(33, 300, "TV");



        for(int j = 0; j < 20; j++) {
            tech_list.add(tech1);
        }

        tech_list.add(2, tech2);


        for(int i = 0; i < tech_list.size(); i++) {
            System.out.println((i+1) + " " + tech_list.get(i));
        }


//        tech_list.add(3, tech2);
//        System.out.println(tech_list.get(3));
//
//        tech_list.add(165, tech2);
//        System.out.println(tech_list.get(165));

//        Technique tech3 = (Technique) tech_list.remove(4);
//        System.out.println(tech3);
//
//        Technique tech4 = (Technique) tech_list.remove(0);
//        System.out.println(tech4);
//
//        tech_list.add(-3, tech4);


//        List<Technique> products_list = new MyList<>();
//        //products_list.add
//
//        int [] ar = new int[4];
//        ar[0] = 3;
//        ar[1] = 4;
//        ar[2] = 2;
//        ar[3] = 1;
//
//        for(int i = 0; i < ar.length; i++) {
//            int min = ar[i];
//            int imin = i;
//            for(int j = i+1; j < ar.length; j++) {
//                if(ar[j] < min) {
//                    min = ar[j];
//                    imin = j;
//                }
//            }
//            if(i != imin) {
//                int temp = ar[i];
//                ar[i] = ar[imin];
//                ar[min] = temp;
//                System.out.println(ar[imin]);
//            }
//        }
//
//        int [] ar2 = new int[5];
//        ar2[0] = 3;
//        ar2[1] = 4;
//        ar2[2] = 2;
//        ar2[3] = 1;
//        ar2[4] = 7;
//        for (int i = 0; i < ar2.length; i++) {
//            System.out.println(ar2[i]);
//        }
//
//        Point coordin = new Point();
//        System.out.println(coordin.toString());
//        coordin.moveXPoint();
//        Point.sumX2Coord(coordin);
//
//        Point coordin2 = new Point(10, 20);
//        coordin2.moveXPoint();
//
    }
}


class Point {
    public static int x;
    public static int y;

    Point(){
        x = 4;
        y = 8;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveXPoint() {
        x = x + 3;
        System.out.println(x);
    }
    public String toString() {
        return x + " " + y;
    }
    public static void sumX2Coord(Point p) {
        int sum = (x + y) * 2;
        System.out.println(sum);
    }
}