// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
 * Airline registration 
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter
 * and print their boarding pass. You need to collect the following information: 
 * 		First name 
 * 		Last name
 * 		Destination airport 
 * 		Birthday (for security purposes) 
 * 		Male/female (for security purposes) 
 * 
 * Print the boarding pass in this format:
 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
 * Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class AirlineRegistration {
	public static void main(String[] args) {
		
		for (int i = 0; i < 11; i++) {
				
				
		String f = JOptionPane.showInputDialog("What's your first name");
		
		String l = JOptionPane.showInputDialog("What's your last name?");
		
		String d = JOptionPane.showInputDialog("What airport are you landing in?");
		
		String b = JOptionPane.showInputDialog("What is your birthday? (for security purposes)");
		
		String g = JOptionPane.showInputDialog("Are you male or female? (for security purposes)");
		
		System.out.println(l + " / " + f + " (" + b + ", " + g + ")" );
		System.out.println("Traveling to: " + d);
		
		
		}
		
	}
}



/**Extra Difficult Challenge: have the program repeat until plane is full (10 passenger plan) and print out the number of passengers after each boarding pass.
*/
