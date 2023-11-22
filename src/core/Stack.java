package core;

import java.util.ArrayList;

public class Stack<T> implements IStack<Object> {
	private ArrayList<T> stack;
	private int size;
	private int top;
	
	Stack(int size) {
		stack = new ArrayList<>();
		this.size = size;
		top = -1;
	}

	@Override
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	@Override
	public boolean isFull() {
		return top >= size-1;
	}
	
	@Override
	public int getSize() {
		return stack.size();
	}

	@SuppressWarnings("unchecked")
	@Override
	public void push(Object e) throws Exception {
		if(!isFull()) {
			stack.add((T) e);	
			top++;
		}else {
			throw new Exception("Can not push into stack, stack is full!");
		}
	}

	
	@Override
	public Object pop() throws Exception {
		if(!stack.isEmpty()) {
			return stack.remove(top--);			
		}else {
			throw new Exception("Can not pop stack, stack is empty!");
		}
	}

	@Override
	public Object getTop() throws Exception {
		if(!stack.isEmpty()) {
			return stack.get(top);
		}else {
			throw new Exception("Can not the top element stack, stack is empty!");
		}
	}
	
}
