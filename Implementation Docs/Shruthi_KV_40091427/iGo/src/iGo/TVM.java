package iGo;

import java.util.ArrayList;
import java.util.Scanner;

public class TVM {

 static boolean numberOrNot(String input) {
  try {
   Integer.parseInt(input);
  } catch (NumberFormatException ex) {
   return false;
  }
  return true;
 }

 public static void main(String[] args) {
  boolean rightInput = false;
  System.out.println("====Welcome to TVM=====");
  ArrayList<String> ticketType = new ArrayList<String>();
  ticketType.add("1.Rechargeable card");
  ticketType.add("2.Non-rechargeable ticket");
  System.out.println("Available ticket options are");
  for (int i = 0; i < ticketType.size(); i++) {
   System.out.println(ticketType.get(i));
  }
  System.out.println("Please enter your selection, 1 or 2");
  Scanner scanner = new Scanner(System.in);
  String input = scanner.next();

  while (!rightInput) {
   if (numberOrNot(input)) {
    if (Integer.parseInt(input) == 1 || Integer.parseInt(input) == 2) {
     System.out.println("Redirecting to next page....!!");
     rightInput = true;
    }
    else {
     System.out.println("Please enter right input, 1 or 2");
     input = scanner.next();
    }

   } else {
    System.out.println("Please enter right input, 1 or 2");
    input = scanner.next();
   }

  }
 }

}
