package interfaces;

interface Stack {
	void push(String value) throws StackAlreadyOccuipied;

	String pop() throws StackEmptyException;

	int length();
}

class StackEmptyException extends Exception {
}

class StackAlreadyOccuipied extends Exception {
}

public class MyStack implements Stack {
	private String data[] = new String[10];
	private int top = 0;

	@Override
	public void push(String value) throws StackAlreadyOccuipied {
		if (data.length != top)
			data[top++] = value;
		else
			throw new StackAlreadyOccuipied();

	}

	@Override
	public String pop() throws StackEmptyException {
		if (top == 0)
			throw new StackEmptyException();
		else
			return data[--top];
	}

	@Override
	public int length() {
		return data.length;

	}

	public static void main(String[] args) {
		MyStack rv = new MyStack();
		try {
			rv.push("1");
			rv.pop();
			rv.pop();
		} catch (StackAlreadyOccuipied e) {
			System.err.println("Stack is full cant add new data");
		} catch (StackEmptyException e) {
			System.err.println("Stack is empty cant pop");
			e.getMessage();
		}
	}
}
