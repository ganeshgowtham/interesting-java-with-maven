package com.mycompany.scrap.assingnment;

public class Computer {

	private Keyboard keyboardAdaptor;

	public Keyboard getKeyboardAdaptor() {
		return keyboardAdaptor;
	}

	public void setKeyboardAdaptor(Keyboard keyboardAdaptor) {
		this.keyboardAdaptor = keyboardAdaptor;
	}
	
	public int getKeyboardModel(){
		return keyboardAdaptor.getModel();
	}
}
