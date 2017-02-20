package com.mycompany.scrap.misc;

public class StringPool {
	public static void main(String[] args) {
		/* String pool */
		String str1 = "hello";
		String str2 = "hello";

		System.out.println(str1 == str2);

		String str3 = new String("hello");
		String str4 = new String("hello");
		System.out.println(str3 == str4);
	}
}
