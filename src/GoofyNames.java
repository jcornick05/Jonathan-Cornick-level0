import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";

		String ans = JOptionPane.showInputDialog("What's your name");
		System.out.println(ans.toUpperCase());
		
		for (int i = 0; i < ans.length(); i++) {
			String piece = ans.substring(i,i+1);
			if (i%2==0) {
				piece = piece.toUpperCase();
				
			} else {
				piece = piece.toLowerCase();
			}
		
			goofyName=goofyName + piece;
		
		
		}
		JOptionPane.showMessageDialog(null, goofyName);
		
		
		
		
		
		
		
		
		
		
		
		// 2. Print upper case name to the console using .toUpperCase()
		//    Run your program to see that this works.

		// 3. Loop through each character of the name (steps 4 - 6).
		//    HINT: Use .length() to determine the number of characters in the String.

			// 4. Create a String variable to store the next character of the name
			//    using .substring(start, end)
			//    HINT: replace 'start' and 'end' to get String with character at i 
			
			// 5. Use MODULO to set this variable to upper case for EVEN characters
			//    and lower case for ODD characters.

			
			// 6. ADD this String  (containing 1 char) to the goofyName String

		
		// 7. Use pop-up to show user their Goofy name

	}
}
