package core;

public interface IStack<T> {
	boolean isFull();
	boolean isEmpty();
	int getSize();
	void push(T e) throws Exception;
	T pop() throws Exception;
	T getTop() throws Exception;
}
