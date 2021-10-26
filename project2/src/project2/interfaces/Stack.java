package project2.interfaces;

import project2.exceptions.EmptyStackException;

public interface Stack<E> extends BasicCollection {

	public E top() throws EmptyStackException;

	public void push(E e);

	public E pop() throws EmptyStackException;

}
