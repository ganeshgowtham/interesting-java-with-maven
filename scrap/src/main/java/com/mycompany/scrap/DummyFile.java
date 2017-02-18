package com.mycompany.scrap;

/**
 * 
 * @author lkodavali
 * @since <a>1.4</a>
 *
 */

public class DummyFile extends CoreFile {

	private String fileName;

	private long size;

	private String fileExtn;

	private boolean secured;

	private String password;

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName
	 *            the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * @return the size
	 */
	public long getSize() {
		return size;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public void setSize(long size) {
		this.size = size;
	}

	/**
	 * @return the fileExtn
	 */
	public String getFileExtn() {
		return fileExtn;
	}

	/**
	 * @param fileExtn
	 *            the fileExtn to set
	 */
	public void setFileExtn(String fileExtn) {
		this.fileExtn = fileExtn;
	}

	public static void main(String[] args) {
		DummyFile dummyFile = new DummyFile();
		dummyFile.setFileExtn("*.txt");
		dummyFile.setFileName("hworld");
		dummyFile.setSize(1024);
		dummyFile.setPassword("oops");
		dummyFile.setCoreFileName("core");
		dummyFile.getFileName();
		System.out.println(dummyFile);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DummyFile [fileName=" + fileName + ", size=" + size + ", fileExtn=" + fileExtn + ", password="
				+ password + "]";
	}
}
