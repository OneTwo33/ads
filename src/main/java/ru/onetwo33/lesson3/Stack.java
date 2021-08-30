package ru.onetwo33.lesson3;

public interface Stack<E> {

    void push (E value);
    E pop();
    E peek();
    int size();
    boolean isEmpty();
    boolean isFull();
    void display();
}
