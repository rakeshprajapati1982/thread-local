package com.readtorakesh.threadlocal;

public class MainApp {
	public static void main(String[] args) {
		UserContext userTommy = new UserContext("tommy", "Tom", "Tom");
		UserContext userJerry = new UserContext("jerry", "Jeryy", "Jam");
		
		Thread t1 = new RequestorThread(userTommy);
		Thread t2 = new RequestorThread(userJerry);
		
		t1.start();
		t2.start();
		
		try {
			// We want to wait for both t1 and t2 threads to finish
			t1.join();
			t2.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
