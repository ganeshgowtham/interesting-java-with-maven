package com.mycompany.scrap.oops;

public class PDFFile extends BaseFile {

	@Override
	public String getFileExtension() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void staticMethod() {
		System.out.println("i am from pdf staticMethod");
	}
	public void nonStaticMethod(){
		System.out.println("i am from pdf nonStaticMethod");
	}

}