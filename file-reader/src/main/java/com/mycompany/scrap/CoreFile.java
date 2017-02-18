package com.mycompany.scrap;

import java.io.File;

@CompressableAnno
public  class CoreFile implements Cloneable, Compressable {

	private String coreFileName;

	public String getCoreFileName() {
		return coreFileName;
	}

	public void setCoreFileName(String coreFileName) {
		this.coreFileName = coreFileName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		return "CoreFile [coreFileName=" + coreFileName + "]";
	}

	protected boolean isFileSecured(File file) {
		//
		return true;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		CoreFile coreFile = new CoreFile();
		coreFile.setCoreFileName("movie.mp3");
		CoreFile coreFile2 = (CoreFile) coreFile.clone();
		System.out.println("oo");
	}

	public boolean doCompress(File file) {
		// TODO Auto-generated method stub
		return false;
	}
}
