
	import java.util.Random;

import javax.swing.JOptionPane;
	import org.jointheleague.graphical.robot.Robot;

	/* Level 0 Practice: Coding  Exercise #1 */
	public class Level0PracticeExam {

	    public static void main(String[] args) {
	    	Robot robot = new Robot("c3po");
	    	robot.setSpeed(100);
	    	robot.penDown();
	    	
	    	int bases = new Random().nextInt(5);
	    	if(bases == 0) {
	    		JOptionPane.showMessageDialog(null, "The batter is out!");
	    	}
	    	if(bases == 1) {
	    		JOptionPane.showMessageDialog(null, "Single!");
	    		robot.turn(45);
	    		robot.move(200);
	    		robot.turn(-90);
	    	}
	    	if(bases == 2) {
	    		JOptionPane.showMessageDialog(null, "Double!");
	    		robot.turn(45);
	    		robot.move(200);
	    		robot.turn(-90);
	    		robot.move(200);
	    		robot.turn(-90);
	    	}
	    	if(bases == 3) {
	    		JOptionPane.showMessageDialog(null, "Triple!");
	    		robot.turn(45);
	    		robot.move(200);
	    		robot.turn(-90);
	    		robot.move(200);
	    		robot.turn(-90);
	    		robot.move(200);
	    		robot.turn(-90);
	    	}
	    	if(bases == 4) {
	    		JOptionPane.showMessageDialog(null, "Home run!");
	    		robot.turn(45);
	    		robot.move(200);
	    		robot.turn(-90);
	    		robot.move(200);
	    		robot.turn(-90);
	    		robot.move(200);
	    		robot.turn(-90);
	    		robot.move(200);
	    		robot.turn(-90);
	  
	    	}
	    	

	    	
	    	
		 // 1. Create a random number from 0 to 4 and store it in a ‘bases’ variable

		 // 2. If the number is zero  display a window that says “the batter is out”

	   	 // 3. Otherwise display “the batter hit a ” and “single”, “double”, “triple” or “home run”

	   	 // 4. Make the robot draw the path of the base runner. For example, if 
		 //     the batter hit a double, draw a line from home plate to first and another line from
	            //      first to second. Home plate should be at the bottom and first should be on the
	            //      right. You do not need to draw the bases themselves or any other features.
	   	 
	    }

	}

	
	


