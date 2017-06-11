public class Stack {
	private Object[] stack;
	// 元素个数;
	private int size;
	// 默认长度为10;
	public Stack() {
		this(10);
	}
	// 也可以自己设置长度,即容量;
	public Stack(int len) {
		stack = new Object[len];
	}
	// 返回元素个数;
	public int size() {
		return size;
	}
	// 返回数组长度,即容量;
	public int capacity() {
		return stack.length;
	}
	// 入栈;
	public void push(Object o) {
		size++;
		stack[size - 1] = o;
	}
	// 判空;
	public boolean isEmpty() {
		return size == 0;
	}
	// 出栈;
	public Object pop() {
		// 首先要判空;
		if (isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("不能为空");
		}
		Object o = stack[--size];
		stack[size] = null;
		return o;
	}
}