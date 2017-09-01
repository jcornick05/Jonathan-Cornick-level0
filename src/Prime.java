import javax.swing.JOptionPane;

public class Prime {
	public static void main(String[] args) {

		String n = JOptionPane.showInputDialog("Insert number below.");
		int ans = Integer.parseInt(n);

		if (ans < (2)) {
			JOptionPane.showMessageDialog(null, "Your number is not prime!");
			System.exit(0);
		}
		for (int i = 2; i < ans; i++) {
            if (ans%i==0) {
				JOptionPane.showMessageDialog(null, "Your number is not prime!");
				System.exit(0);
			}
		}
		
		JOptionPane.showMessageDialog(null, "Your number is prime!");
		
		
		
		
		
		
	}
}
