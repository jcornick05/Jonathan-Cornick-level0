

		import javax.swing.JOptionPane;

import org.omg.Messaging.SyncScopeHelper;

		public class SleepyHead {

			public static void main(String[] args) {
				
				boolean isWeekday, isVacation;
				
				
				
				
				//Ask the user for these values using
				int w = (JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
				 JOptionPane.YES_NO_OPTION));
				if(w==0) {
					isWeekday = true;
				}
				else {
					isWeekday = false;
				}
				      
				int v = (JOptionPane.showConfirmDialog(null, "Are you on vacation", "", 
						 JOptionPane.YES_NO_OPTION));
				if(v==0) {
					isVacation = true;
				}
				else {
					isVacation = false;
				}
				 
				 
				
				if (!isWeekday||isVacation) {
					JOptionPane.showMessageDialog(null, "Sleep in!");	
					}
					    	   
				  if (isWeekday&&!isVacation) {
					  JOptionPane.showMessageDialog(null, "Get up lazybones!");	
				}
				  
					
				
				  

				/*
				 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
				 * print “get up lazybones!” If it is a weekday, and we are on vacation,
				 * print “sleep in”.
				 */
			

			
			}
		


	}


