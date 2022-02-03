package ie.itcarlow.AlgoProject;

import java.util.Scanner;

public class Menu {
	final static int QUIT_APPLICATION = 7;

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int option = 0;
		
		while(option != QUIT_APPLICATION) {
			System.out.println("Please choose an option");
			System.out.println("1) add <key> to <set>");
			System.out.println("2) check if <set> contains <key>");
			System.out.println("3) remove <subset> from <superset>");
			System.out.println("4) print the contents of <superset>");
			System.out.println("5) display the maximum value of <set>");
			System.out.println("6) display the subset of elements in range <end>, <start = 0>");
			System.out.println("7) exit application");
			option = input.nextInt();
		}
		
		input.close();
	}
}
