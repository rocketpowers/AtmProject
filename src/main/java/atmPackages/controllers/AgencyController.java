package atmPackages.controllers;

import java.util.ArrayList;
import java.util.Scanner;

import atmPackages.model.Clients;



public class AgencyController {

	static Scanner scanner = new Scanner(System.in);

	static ArrayList<Clients> cient;

	public static void main(String[] args) {

	ArrayList<Clients> clients = new ArrayList<Clients>();
		operation();

	}

	public static void operation() {

		int operation = scanner.nextInt();

		switch (operation) {
		case 1:
			//register()
				
			break;
			
			default:
				System.out.println("invalid option");
				break;
		}

	}
}
