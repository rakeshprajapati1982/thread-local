package com.readtorakesh.threadlocal;

public class AppThreadLocal {
	public static ThreadLocal<UserContext> USER_CONTEXT = new ThreadLocal<>();
}
