import java.util.Scanner;
import javax.swing.JOptionPane;

public class January_Roy_Assignment02 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		//initializing all variables with names outlined by the assignment
		
		String firstname, lastname;
		char middleInitial;
		int age;
		double grossAnnualPay, taxRate, netAnnualPay;
		
		/* input dialog boxes asking the user for
		 * String/char input: firstname, lastname, middle initial
		 * Integer input: age
		 * Double input: grossAnnualPay, taxRate
		*/
		
		firstname = JOptionPane.showInputDialog("Please enter your first name.");
		middleInitial = JOptionPane.showInputDialog("Please enter your middle initial.").charAt(0);
		lastname = JOptionPane.showInputDialog("Please enter your last name.");
	
		// declaring a new variable to read the string input for age
		String howold;
		howold = JOptionPane.showInputDialog("Please enter your age.");
		age = Integer.parseInt(howold);
		
		// doing the same thing for the double variables, making sure to clearly name even placeholder variables
		
		String pay;
		pay = JOptionPane.showInputDialog("How much money did you make this year?");
		grossAnnualPay = Double.parseDouble(pay);
		
		String tax;
		tax = JOptionPane.showInputDialog("What is the tax rate where you live? Enter a decimal between 0 and 1.");
		taxRate = Double.parseDouble(tax);
		
		/* Error handling for taxRate that I can't implement yet as I haven't learned conditional statements in Java:
		 * If taxRate is a number higher than 1 (like if they entered 30 for 30 percent instead of 0.30),
		 * Divide it by 100 and set taxRate equal to that decimal, else leave it be
		 *  */


		
		// calculate net pay, net pay = gross pay - (gross pay * tax rate)
		netAnnualPay = grossAnnualPay - (grossAnnualPay * taxRate);
		
		// display output via console, printf statement calling different variables
		// remember %s for string, %d for int %f for double and %c for char
		
		System.out.printf("Hello %s %c. %s, \n", firstname, middleInitial, lastname);
		System.out.printf("You are %d years old now.\n", age);
		System.out.printf("You made $%.0f this year.\nWith the tax rate of %.2f, you took home $%.0f.\n", grossAnnualPay, taxRate, netAnnualPay);
		System.out.println("Good luck next year!");
		
		System.exit(0);
	}

}
