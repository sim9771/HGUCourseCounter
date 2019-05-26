package edu.handong.analysis.utils;

public class NotEnoughArgumentException extends Exception {
		public NotEnoughArgumentException() {
				System.out.println("No CLI argument Exception! Please put a file path.");
				
		}
		public NotEnoughArgumentException(String message) {
				System.out.println(message);
				System.exit(0);
		}
}
