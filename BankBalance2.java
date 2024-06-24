// Chapter 6 example (page 207)

import java.util.Scanner;

public class BankBalance2
{
	public static void main(String[] args)
	{
		// Variables and constants
		double balance;
		int response;
		int year = 1;
		final double INT_RATE = 0.03;
		Scanner keyboard = new Scanner(System.in);

		// Input Phase
		System.out.print("Please enter initial bank balance >> ");
		balance = keyboard.nextDouble();

		// Processing and output phases
		do 
		{
			balance += (balance + INT_RATE);
			System.out.println("After year " + year + " at " + INT_RATE + " interest rate, balance is $" + balance);
			year = year + 1;
			System.out.println("\nDo you want to see the balance for ANOTHER year?");
			System.out.print("Enter 1 for yes or any other number for no >> ");
			response = keyboard.nextInt();
			
		} while(response == 1); // end of while loop

		System.out.println("Have a great day!");
	} // end of main()
} // end of class block