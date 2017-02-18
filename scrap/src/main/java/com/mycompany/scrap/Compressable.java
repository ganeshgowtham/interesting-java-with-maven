package com.mycompany.scrap;

import java.io.File;

public interface Compressable {

	long MAX_SIZE = 1024;

	public static long MAX_SIZE2 = 90;
	
	boolean doCompress(File file);

}
