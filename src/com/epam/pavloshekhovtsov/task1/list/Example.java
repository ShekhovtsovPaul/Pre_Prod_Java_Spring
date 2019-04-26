package com.epam.pavloshekhovtsov.task1.list;

import com.epam.pavloshekhovtsov.task1.entity.Technique;

public class Example {

    public static void main(String[] args) {

        int [] ar = new int[4];
        ar[0] = 3;
        ar[1] = 4;
        ar[2] = 2;
        ar[3] = 1;

        for(int i = 0; i < ar.length; i++) {
            int min = ar[i];
            int imin = i;
            for(int j = i+1; j < ar.length; j++) {
                if(ar[j] < min) {
                    min = ar[j];
                    imin = j;
                }
            }
            if(i != imin) {
                int temp = ar[i];
                ar[i] = ar[imin];
                ar[min] = temp;
                System.out.println(ar[imin]);
            }
        }


        int [] ar2 = new int[5];
        ar2[0] = 3;
        ar2[1] = 4;
        ar2[2] = 2;
        ar2[3] = 1;
        ar2[4] = 7;
        for (int i = 0; i < ar2.length; i++) {
            System.out.println(ar2[i]);
        }

        Point coordin = new Point();
        System.out.println(coordin.toString());
        coordin.moveXPoint();
        Point.sumX2Coord(coordin);

        Point coordin2 = new Point(10, 20);
        coordin2.moveXPoint();
    }










































    //    public static void main(String [] args) {
//        Technique<String> strings = new MyList<>();
//        strings.add("first");
//        strings.add("second");
//        strings.add("third");
//
//        System.out.println(strings.get(1));
//    }
//
//    private E[] values;
//    public MyList() {
//        values = (E[]) new Object[0];
//    }


//MyList<E extends Technique> implements List
//    ArrayList<String> tools = new ArrayList<String>();
//    Object [] Technique = tools.toArray();

//    Object [] container;

//    private static final int INT = 20;
//    private Object [] conteiner;
//    private int size = 0;

//    public MyList() {
//      conteiner = new Object[INT];
//    }
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