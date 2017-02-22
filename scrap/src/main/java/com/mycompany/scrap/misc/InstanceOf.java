package com.mycompany.scrap.misc;

public class InstanceOf {

	public static void main(String[] args) {
		String str1 = "";
		if (str1 instanceof String) {
			System.out.println("String");
		} else {
			System.out.println("N String");
		}
	}
}
