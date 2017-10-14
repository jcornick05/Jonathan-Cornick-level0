import javax.swing.JOptionPane;
@SuppressWarnings("all")
public class SpotTheError {
	public static void main(String[] args) {
	String n = JOptionPane.showInputDialog("Number?");
int num = Integer.parseInt(n);


for(	int i = 0;i < num;i++)
	{
		System.out.println(num);
	}
}}
