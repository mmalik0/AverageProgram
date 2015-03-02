
import java.util.Scanner;

import javax.swing.JOptionPane;

public class AverageFormula {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] s = new int[10];
		int Average = 0;
		
		for (int x = 0; x < 10; x++) {
			System.out.print("Enter value #" + (x + 1) + ": ");
			s[x] = keyboard.nextInt();
			Average += s[x]; // same average = average + s[x] e.g. x+=2 same as, x = x+2
		}
		
		
		JOptionPane.showMessageDialog(null, "Average of the values is " + Average);
		keyboard.close();
	}

}
