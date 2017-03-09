package com.mycompany.scrap.oops;

public abstract class BaseFile implements SendableFile {

	private static boolean isLoaded = true;

	private String fileName;

	private boolean secured;

	public static void staticMethod()
	{
		System.out.println("i am from basefile staticMethod");

	}

	public void nonStaticMethod() {
		System.out.println("i am from basefile nonStaticMethod");
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public boolean isSecured() {
		return secured;
	}

	public void setSecured(boolean secured) {
		this.secured = secured;
	}

	@Override
	public boolean doSend() {
		return false;
	}

	protected void checksum() {
		// dummy implementation
	}

	protected void checksum(String algorithmType) {
		// dummy implementation
	}
}
