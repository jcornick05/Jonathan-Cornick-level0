import javax.swing.JOptionPane;

public class MovieRating {
	public static void main(String[] args) {
		String x = JOptionPane.showInputDialog("How old are you?");
		int r = Integer.parseInt(x);
		if (r>=18) {
			JOptionPane.showMessageDialog(null, "You can see any movie.");
		}
		if (r<=17 && r>=0) {
			JOptionPane.showMessageDialog(null, "You need a parent.");
		}	
		if (r<0) {
			JOptionPane.showMessageDialog(null, "ERROR!");
		}
		if (r>150) {
			JOptionPane.showMessageDialog(null, "You need someone with you. (caretaker)");
		}
	}

}
