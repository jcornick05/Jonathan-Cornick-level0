
// Copyright The League of Amazing Programmers 2014
import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	

	public static void main(String[] args) {
		
		String n = JOptionPane.showInputDialog("how many nickels do you have?");
	
		int k = Integer.parseInt(n);
		
		String x = JOptionPane.showInputDialog("how many dimes do you have?");
		
		int d = Integer.parseInt(x);
		
		String i = JOptionPane.showInputDialog("how many quarters do you have?");
		
		int q = Integer.parseInt(i);
		
 
		double output = q*.25+d*.10+k*.05;
		
		System.out.println(output);
				
		// Calculate how much money the user has and save it in a double
		// variable

		// Tell the user how much money they have

	}
}
