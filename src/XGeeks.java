
// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
public static void main(String[] args) {
	
	String word=JOptionPane.showInputDialog("What superhero?");
	System.out.print(word);
	
    


String superPowerOne="speed";
String superPowerTwo="strength";
String superPowerThree="healing";
String superPowerFour="claws";
String superPowerFive="flying";
String superPowerSix="magnetism";

if (word.equals("Flash")){
	JOptionPane.showMessageDialog(null, superPowerOne);
	JOptionPane.showMessageDialog(null, superPowerThree);
}

if (word.equals("Wolverine")){
	JOptionPane.showMessageDialog(null, superPowerTwo);
	JOptionPane.showMessageDialog(null, superPowerFour);
	JOptionPane.showMessageDialog(null, superPowerThree);
}

if (word.equals("Magneto")){
	JOptionPane.showMessageDialog(null, superPowerFive);
	JOptionPane.showMessageDialog(null, superPowerSix);
}

}

}
    



	
