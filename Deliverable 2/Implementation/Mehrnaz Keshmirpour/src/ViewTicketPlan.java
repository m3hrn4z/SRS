import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class ViewTicketPlan {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String input;
		int i;
		HashMap<Integer, String> ticket = new HashMap<Integer, String>();
		HashMap<Integer, String> detail = new HashMap<Integer, String>();
	
		// show the instruction for the user at the beginning of the program
		System.out.println("****************************************************************");
		System.out.println("****************************************************************");
		System.out.println("****************************************************************");
		System.out.println("***************     Author: Mehrnaz Keshmirpour   **************\n");
		System.out.println("This program is a Ticket Vending Machine Simulator\n");
		System.out.println("This program displays ticket plans with details and fares");
		System.out.println("To TVM user upon selecting Non-rechargeable ticket plans\n");
		System.out.println("To exit the program user should enter q or Q.\n");
		System.out.println("****************************************************************");
		System.out.println("****************************************************************");
		System.out.println("****************************************************************");
		
		ticket.put(1, "1 trip");
		ticket.put(2, "2 trips");
		ticket.put(3, "10 trips");
		ticket.put(4, "Unlimited Evening");
		ticket.put(5, "Unlimited Weekend");
		ticket.put(6, "1 day");
		ticket.put(7, "3 days");
		ticket.put(8, "Weekly pass");
		ticket.put(9, "Monthly pass");
		ticket.put(10, "Group fare");

		detail.put(1, "Regular fare: $3.50\r\n" + 
				"Reduced fare – age 6 -17: $2.50\r\n" + 
				"Reduced fare – age 65 and +: $2.50\n\n" +
				"The ticket is valid for 120 minutes after it is validated");
		detail.put(2, "Regular fare: $6.50\r\n" + 
				"Reduced fare - age 6 -17: $4.25\r\n" + 
				"Reduced fare - age 65 and +: $4.25\n\n"
				+ "Your fare card can be used for 120 minutes once it has been validated");
		detail.put(3, "Regular fare: $29\r\n" + 
				"Reduced fare - age 6 -17: $17.50\r\n" + 
				"Reduced fare - age 65 and +: $17.50\n\n"
				+ "Each trip can be used for 120 minutes once it has been validated");
		detail.put(4, "Regular fare\r\n" + 
				"$5.50\n\n"
				+ "Unlimited travel between 6 p.m. and 5 a.m.\r\n" + 
				"This transit fare must be used for the first time before midnight.");
		detail.put(5, "Regular fare\r\n" + 
				"$14.00\n\n"
				+ "This transit fare is valid between 4 p.m. on Friday and 5 a.m. on Monday.");
		detail.put(6, "Regular fare\r\n" + 
				"$10\n\n"
				+ "This transit fare is valid for 24 hours from the time it is validated (not from the time it is purchased).\r\n" + 
				"Example: a fare validated at 10 p.m. on Monday will be valid until 9:59 p.m. on Tuesday.");
		detail.put(7, "Regular fare\r\n" + 
				"$19.50\n\n"
				+ "This transit fare is valid for three consecutive days from the time it is validated.\r\n" + 
				"Example: validation at 10 a.m. on Tuesday, expiry 11:59 p.m. on Thursday.");
		detail.put(8, "Regular fare: $26.75\r\n" + 
				"Reduced fare - age 6 -17: $16\r\n" + 
				"Reduced fare - age 65 and +: $16\n\n"
				+ "This transit fare is valid from Monday until 11:59 p.m. on Sunday.");
		detail.put(9, "Fares\r\n" + 
				"Regular fare: $86.50\r\n" + 
				"Reduced fare - age 6 -17: $52\r\n" + 
				"Reduced fare students - age 18 and +: $52\r\n" + 
				"Reduced fare - age 65 and +: $52\n\n"
				+ "This transit fare is valid from the first to the last day of the month.");
		detail.put(10, "Group fare\r\n" + 
				"$17.50\n\n"
				+ "The ticket is valid for 120 minutes after it is validated.");
		

		while (true) {
			System.out.println("\n---------------------(To Exit, Please Enter Q )----------------------\n");
			
			for (Entry e:ticket.entrySet()) {
				System.out.println(e.getKey() + ". " + e.getValue());
			}
			System.out.println("\nPlease Enter a number between 1 and 10 for Ticket Type:");

			input = scanner.nextLine();

			// check whether user enters Q to quit the program 
			if (input.equalsIgnoreCase("q"))
				return;
			
			// check whether user enters a number
			try {
				i = new Integer(input);
			}
			catch (NumberFormatException e){
				System.out.println("****************************************************************");
				System.out.println("The Input is not a Number. Please Enter a number:");
				continue;
			}
			
			// check whether user enters a valid number
			if (i<1 || i>10) {
				System.out.println("****************************************************************");
				System.out.println("The Input is not a valid Number. Please Enter a number between 1 and 10.");
				continue;
			}
			
			System.out.println("************************* Non-rechargeable Ticket Plans ***************************");
			System.out.println("Ticket Type: " + ticket.get(i) + "\n");
			System.out.println(detail.get(i));
			
			System.out.println("\nPlease press Enter to continue and return to the main menu");
			input = scanner.nextLine();
		}
	}
}
