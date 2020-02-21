package com.chainsys.OtherClass;

public class Logger {
	
	private Logger() {
		
	}
	public static void info(Object message) {
		System.out.println(message);
	}
	public static void warn(Object message) {
		System.out.println(message);
	}
	public static void error(Object message) {
		System.err.println(message);
	}
}
