	//Author: Divine Iloh
	//BINS 5312
	//Date: 02/24/2022

package BINS_Casino;
import javax.swing.JOptionPane;

public class BINS_Casino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//declaring variables
		String user_input, msg;
		int play_option, numRolled;
		double amount, bet_won;
		int first_die, second_die, sum_of_dice;
		
		//use JOptionPane to receive user input
		user_input = JOptionPane.showInputDialog("Enter 1 to Play with 1 Die \nEnter 2 to Play with 2 Dice");
		play_option = Integer.parseInt(user_input);
		
		//first if statement to determine and run if the user enters 2 as the option
		if (play_option == 2)
		{
			user_input = JOptionPane.showInputDialog("Welcome to the 2 Die Game! \n"
					+ "How much money do you want to play");
			amount = Double.parseDouble(user_input);
			
			//variables to determine that dice was rolled twice and summed up into sum_of_dice
			first_die = (int) (Math.random()*6 + 1);
			second_die = (int) (Math.random()*6 + 1);
			sum_of_dice = first_die + second_die;
			
			//if statement to determine the sum of dice one and dice two and shows the if bet was won
			if (sum_of_dice == 2 || sum_of_dice == 4 || sum_of_dice == 10 || sum_of_dice == 12)
			{
				bet_won = (amount * 2);
				msg = ("You rolled " + first_die + " and " + second_die + "\n" +
						"You bet is doubled. You won $" + bet_won);
				JOptionPane.showMessageDialog(null, msg);
			}
			
			//if statement to determine the sum of dice one and dice two and shows bet amount has been tripled
			else if (sum_of_dice == 6)
			{
				bet_won = (amount * 3);
				msg = ("You rolled " + first_die + " and " + second_die + "\n" +
						"You bet is tripled. You won $" + bet_won);
				JOptionPane.showMessageDialog(null, msg);
			}
			
			//if statement to determine the sum of dice one and dice two and shows bet was lost
			else if (sum_of_dice == 3 || sum_of_dice == 5 || sum_of_dice == 7 || sum_of_dice == 8 || sum_of_dice == 9 || sum_of_dice == 11)
			{
				msg = ("You rolled " + first_die + " and " + second_die + "\n" +
						"Sorry! You lost all your $" + amount + " bet");
				JOptionPane.showMessageDialog(null, msg);
			}
		}
		
		//if else statement to determine if user enters 1 as option
		else if (play_option == 1)
		{
			user_input = JOptionPane.showInputDialog("Welcome to the 1 Die Game! \n"
					+ "How much money do you want to play");
			
			amount = Double.parseDouble(user_input);
			
			numRolled = (int) (Math.random()*6 + 1);
			
			//if statement to determine the number rolled and shows that bet was lost
			if (numRolled == 1 || numRolled == 2 || numRolled == 3)
			{
				msg = ("You rolled " + numRolled + "\n" +
						"You forfeit your bet of $" + amount);
				JOptionPane.showMessageDialog(null, msg);
			}
			
			//if else statement to determine the number rolled and shows that user gets back her bet
			else if (numRolled == 4)
			{
				msg = ("You rolled " + numRolled + "\n" +
						"You get back your bet of $" + amount);
				JOptionPane.showMessageDialog(null, msg);
			}
			
			//if else statement to determine the number rolled and shows that user gets back half his bet
			else if (numRolled == 5)
			{
				msg = "You rolled " + numRolled + "\n" +
						"You get half your bet back which is $" + (amount/2);
				JOptionPane.showMessageDialog(null, msg);
			}
			
			//else statement to determine when user wins the bet and doubles the bet
			else
			{
				msg = "You rolled " + numRolled + "\n" +
						"You bet is doubled! You won $" + (amount * 2);
				JOptionPane.showMessageDialog(null, msg);
			}
		}
		
		//else statement to show user when a wrong selection is entered
		else
			JOptionPane.showMessageDialog(null, "Wrong Selection! \nYou are required to select 1 or 2.");
				
			


	}

}
