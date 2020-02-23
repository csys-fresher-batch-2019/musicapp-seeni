package com.chainsys.OtherClass;

public class Logger {

	/**
	 * Displays all the Information messages
	 * 
	 * @param message
	 */

	public static void info(Object message) {
		System.out.println(message);
	}

	/**
	 * Displays all warning messages
	 * 
	 * @param message
	 */
	public static void warn(Object message) {
		System.out.println(message);
	}

	/**
	 * Displays all the error messages
	 * 
	 * @param message
	 */
	public static void error(Object message) {
		System.err.println(message);
	}
}
