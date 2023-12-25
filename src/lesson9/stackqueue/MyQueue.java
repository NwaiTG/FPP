package lesson9.stackqueue;

import java.util.NoSuchElementException;

public interface MyQueue<E> {

    boolean add(E e);

    boolean offer(E e);

    E remove();

    E poll();

    E element();

    E peek();

    int getSize();
}


