package ru.onetwo33.lesson3;

import java.util.Arrays;

public class PriorityQueueImpl<E extends Comparable<? super E>> implements Queue<E> {

    private final E[] data;
    private int size;

    public PriorityQueueImpl(int maxSize) {
        this.data = (E[]) new Comparable[maxSize];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public boolean insert(E value) {
        if (isFull())  {
            return false;
        }

        int index;
        for (index = size - 1; index >= 0 ; index--) {
            if (value.compareTo(data[index]) < 0) {
                data[index + 1] = data[index];
            } else {
                break;
            }
        }

        data[index + 1] = value;
        size++;
        return true;
    }

    @Override
    public E remove() {
        return isEmpty() ? null : data[--size];
    }

    @Override
    public E peekFront() {
        return data[size - 1];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i != size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}