package com.mycompany.scrap.oops.innerclasses;

public class OuterDemo {
	int num;
	
	public static final StringBuffer stringBuffer = new StringBuffer("Start ");
	
	private final StringBuffer stringBuffer2 = new StringBuffer("Start ");
	
	private final long maxLength = 9000;
	
	public long getMaxLength() {
		return maxLength;
	}

	public OuterDemo(){
		//maxLength = 90;
		stringBuffer2.append("ll");
		
	}
	// inner class
	private class InnerDemo {
		public void print() {
			System.out.println("This is an inner class");
		}
	}

	// Accessing he inner class from the method within
	void displayInner() {
		System.out.println(stringBuffer);
		InnerDemo inner = new InnerDemo();
		inner.print();
	}
	
	public StringBuffer getStringBuffer2() {
		return stringBuffer2;
	}
}
