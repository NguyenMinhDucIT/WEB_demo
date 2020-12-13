package B3_Stack;

public class StackOfIntergers {
	private int[] elements;
	private int size;
	private int top = -1;
	
//		public int[] getElements() {
//			return elements;
//		}
//		public void setElements(int[] elements) {
//			this.elements = elements;
//		}
//		public int getSize() {
//			return size;
//		}
//		public void setSize(int size) {
//			this.size = size;
//		}
	
	public StackOfIntergers() {
		elements = new int[size];
	}
	public StackOfIntergers(int capacity) {
		elements = new int[capacity];
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
	public int peek() {
		return elements[top];
	}
	public void push(int a) {
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
		elements[top] = (Integer) null;
		top--;
	}
	public int getSize() {
		return elements.length;
	}
}


