package com.mycompany.scrap.oops;

import com.mycompany.scrap.exceptions.NotImplementedException;

public abstract class AbstractCoreFile {

	public abstract String fileExtension();
	
	public void doEncrpt(){
		throw new NotImplementedException("Imlementation is not completed");
	}
}
