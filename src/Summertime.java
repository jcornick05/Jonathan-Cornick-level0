import javax.swing.JOptionPane;

public class Summertime {
	public static void main(String[] args) {

		String n = JOptionPane.showInputDialog("What's your name?");
		String g = JOptionPane.showInputDialog("What grade are you in?");
		String s = JOptionPane.showInputDialog("Favorite thing your doing this summer?");
		
		System.out.println("Hi " + n + "." + "I'm also in " + g + " grade.");
		System.out.println("Wow, " + s + " sounds really fun!");
		
	}
}
