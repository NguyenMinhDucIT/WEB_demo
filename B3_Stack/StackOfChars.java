package B3_Stack;

public class StackOfChars {
	private char[] elements;
	private int size;
	private int top = -1;
	
	public char[] getElements() {
		return elements;
	}
	public void setElements(char[] elements) {
		this.elements = elements;
	}
//	public int getSize() {
//		return size;
//	}
//	public void setSize(int size) {
//		this.size = size;
//	}
	
	public StackOfChars() {
		elements = new char[size];
	}
	public StackOfChars(int capacity) {
		elements = new char[capacity];
	}
	//
	public boolean isEmpty() {
		if(top == -1)
		return true;
		return false;
	}
	public boolean isFull() {
		if(top == size)
		return true;
		return false;
	}
	public char peek() {
		return elements[size];
	}
	public void push(char a) {
		if(isFull()) {
			System.out.println("Stack is full");
			return;
		}
		elements[top] = a;
		top++;
	}
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack trống. Không có dữ liệu xóa!");
			return;
		}
		elements[top] =  (Character) null;
		top--;
	}
	public int getSize() {
		return elements.length;
	}
}
