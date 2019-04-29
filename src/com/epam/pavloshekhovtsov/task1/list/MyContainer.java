package com.epam.pavloshekhovtsov.task1.list;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyContainer<E> implements List<E> {

    private E [] values;
    private int size;
    private static final int INIT_ARRAY_SIZE = 20;

    public MyContainer() {
        this.values = (E[])new Object[INIT_ARRAY_SIZE];
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

//    @Override
//    public boolean add(E e) {
//
//        if(size == values.length) {
//            E [] newArray = (E[]) new Object[values.length * 2];
//            for(int i = 0; i < values.length; i++) {
//                newArray[i] = values[i];
//            }
//            values = newArray;
//        }
//        values[size] = e;
//        size++;
//        return false;
//    }

    @Override
    public boolean add(E e) {
        if(size == values.length) {
            copyArray();
        }
        values[size] = e;
        size++;
        return false;
    }

    public boolean copyArray() {
            E [] newArray = (E[]) new Object[values.length * 2];
            for(int i = 0; i < values.length; i++) {
                newArray[i] = values[i];
        }
        values = newArray;
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

        if(index < 0 && index > size) {
            throw new IndexOutOfBoundsException("IndexOutOfBoundsException");
        }
        if(element == null) {
            throw new NullPointerException("NullPointerException");
        }
        if(size == values.length) {
            copyArray();
        }
        for(int i = size; i >= index; i-- ) {
            if(index == i) {
                values[index] = element;
                break;
            }
            values[i] = values[i-1];
        }
        size++;
    }

    @Override
    public E remove(int index) {
        values[index] = null;
        if(index == 0) {
            return null;
        }
        return values[index-1];
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
