package com.mycompany.scrap.oops;

public final class SingletonClass {
	
	private static SingletonClass instance;

	private SingletonClass() {
	}
	
	public static SingletonClass getInstance(){
		if(instance ==  null){
			instance = new SingletonClass();
		}
		return instance;
	}

	public static void main(String[] args) {
		SingletonClass instance = SingletonClass.getInstance();
		System.out.println(instance);
		SingletonClass instance2 = SingletonClass.getInstance();
		System.out.println(instance2);

	}

}
