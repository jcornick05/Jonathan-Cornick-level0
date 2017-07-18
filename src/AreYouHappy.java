import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {

		String happy = JOptionPane.showInputDialog("Are you happy?");

		if (happy.equals("yes")) {

			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");

		} else {
			String sad = JOptionPane.showInputDialog("Do you want to be happy?");

			if (sad.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something!");
			}

			if (sad.equals("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");

			}
		}

	}
}
