package com.mycompany.scrap.oops.innerclasses;

public class OuterMain {
	public static void main(String args[]) {
		// Instantiating the outer class
		OuterDemo outer = new OuterDemo();

		// Accessing the display_Inner() method.
		//outer.displayInner();
		
		System.out.println(outer.stringBuffer);
		
		System.out.println(outer.getMaxLength());
	}
}
