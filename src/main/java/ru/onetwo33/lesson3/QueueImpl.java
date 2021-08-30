package ru.onetwo33.lesson3;

public class QueueImpl<E> implements Queue<E> {

    private final int HEAD_DEFAULT = 0;
    private final int TAIL_DEFAULT = -1;
    private int size;
    private final E[] data;

    private int tail;
    private int head;

    public QueueImpl(int maxSize) {
        this.data = (E[]) new Object[maxSize];
        head =  HEAD_DEFAULT;
        tail = TAIL_DEFAULT;
    }

    @Override
    public boolean insert(E value) {
        if (!isFull()) {
            data[++tail] = value;
            size++;
            return true;
        }
        return false;
    }

    @Override
    public E remove() {
        if (isEmpty()) {
            return null;
        }
        E value = data[head++];
        size--;
        return value;
    }

    @Override
    public E peekFront() {
        return data[head];
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
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = head; i <= tail; i++) {
            sb.append(data[i]);
            if (i != tail) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
