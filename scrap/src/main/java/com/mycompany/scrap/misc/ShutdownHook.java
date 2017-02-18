package com.mycompany.scrap.misc;

public class ShutdownHook {

	private void doResgisterShutdownHook() {
		
		Thread daemonClsoingThread = new Thread() {
			public void run() {
				System.out.println("Process is about to be killed");
				closeAllResources();
			}
		};
		
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(daemonClsoingThread);
	}

	private boolean closeAllResources() {
		boolean isAllResourcesClosed = false;
		if (true) {
			System.out.println("File is closed");
			isAllResourcesClosed = true;
		}
		return isAllResourcesClosed;
	}

	public static void main(String[] args) {
		ShutdownHook shutdownHook = new ShutdownHook();
		shutdownHook.doResgisterShutdownHook();
		System.out.println("Registerted");

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
