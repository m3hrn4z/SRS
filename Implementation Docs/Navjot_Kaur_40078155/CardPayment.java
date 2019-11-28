import java.util.Scanner;

/*
 * Implemented TVM-US-07
 As a Commuter, I want to be able to make a cash payment.
 Author: Navjot Kaur
 Date: 27 November 2019
 */

public class CardPayment 
{
	public static void main(String[] args) 
	{
		double bill=3.75; //bill for the trip
		String s_amount; 	//amount entered by the user in string 
		double amount,balance;		//amount entered by the user in double
		String get_receipt;	//user's response for getting the receipt
		Scanner sc = new Scanner(System.in);
		System.out.println("************************************************");
		System.out.println("**************PAYMENT BY CASH*******************");
		System.out.println("************************************************");
		System.out.println();
		System.out.println("Your bill: $"+bill);
		System.out.println("(Allowed denominations "
				+ "Bills- $5,$10,$20    OR Coins- $1,$2)");	//showing allowed denominations
		
		System.out.print("\nPlease enter amount=");	//prompting user to enter amount
		while(true)
		{
			try
			{
				s_amount = sc.nextLine();
				amount = Double.parseDouble(s_amount);
				break;
			}
			catch(NumberFormatException e)
			{
				System.out.print("This is not a VALID input! Please enter correct amount=");
			}
		}
		
		
		while(amount<bill)	//validating the amount
		{
			System.out.println("Entered amount is less than the bill. Please enter a value greater than the bill");
			s_amount = sc.nextLine();
			
			amount = Double.parseDouble(s_amount);
		}
		balance = amount - bill;
		System.out.print("\nPAYMENT DONE!\n\n"	//Displaying the results
				+ "Please collect your balance : $"+balance+"\n"
				+ "Do you want a receipt for this transaction?(Yes/No)");
		get_receipt = sc.nextLine();
		//System.out.println();
		if(get_receipt.toLowerCase().compareTo("yes")==0)	//user's choice for getting the receipt
		{
			System.out.println("Please collect your receipt");
		}
		System.out.println("\n*************Thankyou and Goodbye****************");
		
		sc.close();
		
	}
	

	void makePayment()
	{
		
	}
}

