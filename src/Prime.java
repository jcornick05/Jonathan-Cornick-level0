import javax.swing.JOptionPane;

public class Prime {
	public static void main(String[] args) {
     
		String n = JOptionPane.showInputDialog("Insert number below.");
		 int ans = Integer.parseInt(n);
	
	if(ans<(2)) {
		JOptionPane.showMessageDialog(null, "Your number is not prime!");
	}
	for (int i = 0; i < ans; i++) {
		
	}
}
}
