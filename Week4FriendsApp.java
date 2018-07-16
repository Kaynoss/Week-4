package CodingHmwrk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Week4FriendsApp {
		static Scanner scanner = new Scanner(System.in);
		static List<String> friendsList = new ArrayList<String>(); 
	public static void main(String[] args) {
		int choice = 0;
		while (choice != 5) {
			displayMenu();
			choice = getUserChoice();
			if (choice == 1) {
				viewAllFriends();
			} else if (choice == 2) {
				addAFriend();
			} else if (choice == 3) {
				removeAllFriends();
			} else if (choice == 4) {
				removeAFriend();
			} else if (choice == 5) {
				System.out.println("Goodbye.");
			} else
				System.out.println("\nInvalid Entry!  Choose a correct entry.");
			
		}			
		}

	
	public static void displayMenu() {
		System.out.println("\nFriends List:");
		System.out.println("\n1) View All Friends");
		System.out.println("2) Add A Friend");
		System.out.println("3) Remove All Friends");
		System.out.println("4) Remove A Friend");
		System.out.println("5) Exit");
		System.out.println("\nEnter your Choice.");
	}
	public static int getUserChoice() {
		return scanner.nextInt();
	}
	public static void viewAllFriends() {
		for(String friend : friendsList) {
			System.out.println(friend);
		}
	}
	public static void addAFriend() {
		System.out.println("Type the first name of your friend.");
		String name = scanner.next();
		friendsList.add(name);
		System.out.println("You have added " + name);
	}
	public static void removeAllFriends() {
		friendsList.clear();
		System.out.println("You have removed your friends list!  How rude!  You will die alone!");
		
	}
	public static void removeAFriend() {
		System.out.println("Enter the index of the friend you would like to remove.");
		int selection = scanner.nextInt();
		if (selection < friendsList.size()) {
			friendsList.remove(selection);
			
		}
	}

}

