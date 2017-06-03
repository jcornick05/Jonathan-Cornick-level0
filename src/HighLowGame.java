import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class HighLowGame {

	public static void main(String[] args) {
		int random = new Random().nextInt(1000000) + 1;
		// System.out.println(random);
		String guess = JOptionPane.showInputDialog("What number am I thinking of between 1 and 1000000");

		for (int i = 0; i < 20; i++) {

			int guessInt = Integer.parseInt(guess);

			if (guessInt == random) {
				JOptionPane.showMessageDialog(null, "You win!");
				System.exit(0);
			}

			if (guessInt < random) {
				guess = JOptionPane.showInputDialog("to low, guess again");
			}

			if (guessInt > random) {
				guess = JOptionPane.showInputDialog("to high, guess again");
			}

		}

	}

}
