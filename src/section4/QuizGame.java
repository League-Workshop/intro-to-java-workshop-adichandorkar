package section4;

import javax.swing.JOptionPane;

import section3.SpeakAndSpell;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score
		int score=0;
		
		// 2.  Ask the user a question 
		String Bolt=JOptionPane.showInputDialog("who is the fastest person in the world?");
		
		// 3.  Use an if statement to check if their answer is correct
		if(Bolt.equals("Usain Bolt")) {
			score++;
		}
		
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
String Williams=		JOptionPane.showInputDialog("Which tennis star has a sister named Venus?");
if(Williams.equals("Serena Williams")) {
	
}
String James=JOptionPane.showInputDialog("Which NBA star is moving to the LA Lakers?");
if(James.equals("LeBron James")) {
	
}
String Eagles=JOptionPane.showInputDialog("Which team won the NFL  2018 superbowl?");
if(Eagles.equals("Philadelphia Eagles")){
	
}
String Warriors=JOptionPane.showInputDialog("Which team won the NBA Finals?'");
if(Warriors.equals("Golden State Warriors")) {
	
}

		
		
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
