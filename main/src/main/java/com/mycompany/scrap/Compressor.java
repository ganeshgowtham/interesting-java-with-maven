package com.mycompany.scrap;

import com.mycompany.scrap.exceptions.CompressableException;

public class Compressor {

	public boolean compress(CoreFile file) {
		boolean isCompressable = false;
		/*if (file instanceof Compressable) {
			doCompress();
		} else {
			throw new CompressableException("File cannot be compressable !!!");
		}*/
		
		
		return isCompressable;
	}

	private void doCompress() {
		//
	}

	public static void main(String[] args) {
		CoreFile coreFile = new CoreFile();
		Compressor compressor = new Compressor();
		compressor.compress(coreFile);
	}
}
