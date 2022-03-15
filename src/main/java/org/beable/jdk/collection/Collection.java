package org.beable.jdk.collection;

public interface Collection<E> {

    int size();

    boolean isEmpty();

    boolean contains(Object e);

    boolean add(E e);

    boolean remove(Object o);

    boolean addAll(Collection<? extends E> c);

    boolean removeAll(Collection<? extends E> c);

    void clear();
}
