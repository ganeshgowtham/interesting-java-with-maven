package com.mycompany.scrap.assingnment;

public class WorkingModel {

	static {
		System.out.println("sss");
	}

	public WorkingModel() {
		// TODO Auto-generated constructor stub
		System.out.println("ccc");
	}

	void doStart() {
		Computer computer = new Computer();
		Keyboard msKeyboard = new MSKeyboard();
		computer.setKeyboardAdaptor(msKeyboard);
		System.out.println(computer.getKeyboardModel());
	}

	public static void main(String[] args) {
		//new WorkingModel().doStart();
		//new WorkingModel().doStart();
		
		
				
				
	}
}
