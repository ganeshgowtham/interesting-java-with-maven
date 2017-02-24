package com.mycompany.scrap.oops;

public class NonFinalClass extends FinalClass{

	
	private final String username = GoldmanFTPConstants.FTP_USERNAME;
	
	private void doConnect(){
		doConnnectToFTP();
	}
	
	public void doConnnectToFTP(){
		
	}
}
