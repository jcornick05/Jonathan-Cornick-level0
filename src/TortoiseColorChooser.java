
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChooser {
	public static void main(String[] args) {

		for (int x = 0; x < 5;) {
			String ans = JOptionPane.showInputDialog("What color should the tortoise draw?");

			if (ans.equals("blue")) {
				Tortoise.setPenColor(Color.BLUE);

			} else if (ans.equals("green")) {
				Tortoise.setPenColor(Color.GREEN);

			} else if (ans.equals("red")) {
				Tortoise.setPenColor(Color.RED);

			} else if (ans.equals("black")) {
				Tortoise.setPenColor(Color.BLACK);

			} else if (ans.equals("orange")) {
				Tortoise.setPenColor(Color.ORANGE);

			} else if (ans.equals("magenta")) {
				Tortoise.setPenColor(Color.MAGENTA);

			} else if (ans.equals("cyan")) {
				Tortoise.setPenColor(Color.CYAN);

			} else if (ans.equals("yellow")) {
				Tortoise.setPenColor(Color.YELLOW);

			} else if (ans.equals("gray")) {
				Tortoise.setPenColor(Color.gray);

			} else if (ans.equals("light gray")) {
				Tortoise.setPenColor(Color.LIGHT_GRAY);

			} else if (ans.equals("dark gray")) {
				Tortoise.setPenColor(Color.DARK_GRAY);

			} else if (ans.equals("pink")) {
				Tortoise.setPenColor(Color.PINK);

			}

			else {
				Tortoise.setPenColor(PenColors.getRandomColor());

			}

			Tortoise.setPenWidth(10);

			Tortoise.setSpeed(10);
			Tortoise.penDown();

			for (int i = 0; i < 4; i++) {
				Tortoise.move(200);
				Tortoise.turn(90);
			}

		}

	}
}
