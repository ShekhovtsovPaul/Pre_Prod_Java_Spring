package com.epam.pavloshekhovtsov.task1.list;

import java.util.Iterator;

public class MyIterator<E> implements Iterator<E> {

    private int index = 0;
    E[] values;

    MyIterator(E[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public E next() {
        return values[index++];
    }

    public static void main(String[] args) {

        Integer [] integers = new Integer[3];
        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 5;
        
        //Object [] items = new Technique[20];
        //items[0] = (1, 3, "comp");

        MyIterator<Integer> s = new MyIterator(integers);
        while(s.hasNext()) {
            Integer i = s.next();
            System.out.println(i);
        }
    }

}
