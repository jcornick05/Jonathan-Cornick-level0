import java.util.Scanner;

public class ChooseYourOwnAdventure {
	public static void main(String[] args) {

		System.out.println("around you is space. You have only enough fuel for one hour or sixty minutes. "
				+ "What do you want to do?");

		Scanner kb = new Scanner(System.in);
		String ans = kb.nextLine();

		if (ans.equals("look north")) {
			System.out.println("To the north is a planet uninhabited with no resources or life");

			ans = kb.nextLine();

		}
		if (ans.equals("go north")) {
			System.out.println(
					"You go to the planet and get stranded because you're ship runs out of fuel. And there are no resources or shops to get fuel. ");
			System.exit(0);
		}

		if (ans.equals("look south")) {
			System.out.println(
					"To the south is a corrupt planet with an unstable core that is abundant with resources on the inside but it could explode any second.");
			ans = kb.nextLine();
		}

		if (ans.equals("go south")) {
			System.out.println("The planet explodes while you're gathering resources and you die.");
			System.exit(0);

			ans = kb.nextLine();
		}

		if (ans.equals("look east")) {
			System.out.println(
					"To the east is a planet contolled by a dictator. it is very populated and full of resources but the dictator does'nt like outsiders.");

			ans = kb.nextLine();
		}

		if (ans.equals("go east")) {
			System.out.println("You succesfully sneak onto the planet and stock up on resources");
			ans = kb.nextLine();
			if (ans.equals("go north")) {
				System.out.println("you walk north. "
						+ "You stumble into the gallows where the government is executing foreingers, you disagree with there government on this matter."
						+ "If you want to save the prisoners enter a, if not enter b");
				ans = kb.nextLine();
				if (ans.equals("a")) {
					System.out.println("You where caught freeing prisoners and sentenced to life in jail.");
					System.exit(0);
				}
			}

		}

	}

}
