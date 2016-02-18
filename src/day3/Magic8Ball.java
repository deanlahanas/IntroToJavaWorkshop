package day3;

// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….pub
	public static void main(String args[]) {
		{

			for (int i = 0; i < 100; i++) {

				// 2. Make a variable that will hold a random number and put a
				// random number into this variable using "new
				// Random().nextInt(4)"
				int a = new Random().nextInt(4);
				// 3. Print out this variable
				System.out.println(a);
				// 4. Get the user to enter a question for the 8 ball
				speak("Ask me a question");
				JOptionPane.showInputDialog(null, "Ask me a question");

				// 5. If the random number is 0
				if (a == 0) {
					speak("Yes");
					JOptionPane.showMessageDialog(null, "Yes");

				}

				// -- tell the user "Yes"

				// 6. If the random number is 1
				if (a == 1) {
					speak("No");
					JOptionPane.showMessageDialog(null, "No");

				} // -- tell the user "No"

				// 7. If the random number is 2
				if (a == 2) {
					speak("Maybe you should ask Google?");
					JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");

				}
				// -- tell the user "Maybe you should ask Google?"

				// 8. If the random number is 3
				if (a == 3) {
					speak("why would you ask me I am not that smart.");
					JOptionPane.showMessageDialog(null, "why would you ask me I am not that smart.");

				}
			}
		}
		// -- write your own answer
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
