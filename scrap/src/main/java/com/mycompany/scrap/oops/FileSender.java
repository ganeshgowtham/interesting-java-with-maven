package com.mycompany.scrap.oops;

import com.mycompany.scrap.exceptions.ValidationException;

public class FileSender {
	/* */
	private SendableFile pdfFile = null;

	/* */
	private BaseFile pdfFile2 = null;

	/* */
	private PDFFile pdfFile3 = null;

	private SendableFile musicFile = null;

	private boolean validateFile() {
		return true;
	}

	private void preProcess() {
		pdfFile = new PDFFile();
		pdfFile2 = new PDFFile();
		pdfFile3 = new PDFFile();
		musicFile = new MusicFile();
		pdfFile2.staticMethod();
		PDFFile.staticMethod();
		pdfFile2.nonStaticMethod();
	}

	private void process() throws ValidationException {
		if (!validateFile()) {
			throw new ValidationException();
		}
	}

	private void postProcess() {
		pdfFile = null;
		pdfFile2 = null;
		pdfFile3 = null;
		musicFile = null;
	}

	public static void main(String[] args) {
		try {
			FileSender fileSender = new FileSender();
			fileSender.preProcess();
			fileSender.process();
			fileSender.postProcess();
		} catch (Exception e) {
			System.err.println("Error occured while sending file " + e.getMessage());
			e.printStackTrace();
		}
	}
}
