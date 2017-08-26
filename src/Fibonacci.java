
public class Fibonacci {
	public static void main(String[] args) {

		int currentNum = 0;
		int previousNum = 1;

		for (int i = 0; i < 40; i++) {
			System.out.println(currentNum);
			currentNum = currentNum + previousNum;
			previousNum = currentNum - previousNum;
			
		}

	}
}
