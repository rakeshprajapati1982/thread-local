package com.readtorakesh.threadlocal;

public class RequestorThread extends Thread {
	
	private UserContext userContext;
	
	public RequestorThread(UserContext userContext) {
		super(userContext.getUserId()+"-Thread");
		this.userContext = userContext;
	}
	
	@Override
	public void run() {
		// Setting userContext in Thread Local here, this will be available in ServiceApi class
		AppThreadLocal.USER_CONTEXT.set(userContext);
		
		new ServiceApi().processRequest();
		
		// Very important remove thread local variable once thread execution is done 
		AppThreadLocal.USER_CONTEXT.remove();
	}

}
