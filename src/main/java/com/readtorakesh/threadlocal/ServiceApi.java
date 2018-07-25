package com.readtorakesh.threadlocal;

public class ServiceApi {
	public void processRequest() {
		//Reading user context from Thread Local variable, which was set the in the calling thread
		UserContext userContext = AppThreadLocal.USER_CONTEXT.get();
		System.out.println("[" + Thread.currentThread().getName() + "] : Processing request from user: " + userContext);
	}
}
