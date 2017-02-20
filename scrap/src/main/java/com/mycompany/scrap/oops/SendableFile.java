package com.mycompany.scrap.oops;

public interface SendableFile {

	long MAX_FILE_SIZE = 1024;

	String getFileExtension();

	boolean doSend();

}
