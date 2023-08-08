package oops;

public class Counter {
	private int value;
	public Counter()
	{
		this.value=0;
	}
	void increment()
	{
		value++;
	}
	void decrement()
	{
		value--;
	}
	int getValue()
	{
		return this.value;
	}
}
