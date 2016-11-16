package org.senlatraining.ui.control;

import java.util.Scanner;

import org.senlatraining.ui.builder.Builder;
import org.senlatraining.ui.navigator.Navigator;

public class MenuController {
	private Builder builder = new Builder();;
	private Navigator navigator = new Navigator();
	
	private Scanner sc = new Scanner(System.in);
	
	public void run(){
		builder.buildMenu();
		navigator.setCurrenMenu(builder.getRootMenu());
		navigator.printMenu();
		navigator.navigate(sc.nextInt());
	}
}
