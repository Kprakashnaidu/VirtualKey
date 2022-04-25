package com.virtual;

public class VirtualKeyMain {

	public static void main(String[] args) {
		
		
		FileOperations.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("VirtualKey", "Prakash Naidu");
		
		HandleOptions.handleWelcomeScreenInput();
	}

	
}
