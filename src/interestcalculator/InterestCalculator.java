package interestcalculator;

import java.util.Scanner;

public class InterestCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("SELECT THE OPTIONS: " + "\n1." + "Interest Calculator –SB" + "\n2."
				+ "Interest Calculator –FD " + "\n3." + "Interest Calculator –RD " + "\n4." + "Exit");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			SBAccount sb = new SBAccount();
			try {
				System.out.println("Enter the Average SB amount");
				double amount = sc.nextDouble();
				System.out.println("Interest gained is: $" + sb.calculateInterest(amount));
			} catch (InvalidAmountException e) {
				System.out.println("Exception: Invalid Amount");
			}
			break;
		case 2:

			try {
				FDAccount fd = new FDAccount();
				System.out.println("Enter the FD Amount");
				double fAmount = sc.nextDouble();
				System.out.println("Interest gained is: $" + fd.calculateInterest(fAmount));
			} catch (InvalidAgeException e) {
				System.out.println("Invalid Age Entered");
			} catch (InvalidAmountException e) {
				System.out.println("Invalid Amount Entered");
			} catch (InvalidDaysException e) {
				System.out.println("Invalid Days Entered");
			}
			break;

		case 3:
			try {
				RDAccount rd = new RDAccount();
				System.out.println("Enter the RD Amount:");
				double RAmount = sc.nextDouble();
				System.out.println("Interest gained is: $" + rd.calculateInterest(RAmount));
			} catch (InvalidAgeException e) {
				System.out.println("Invalid Age Entered");
			} catch (InvalidAmountException e) {
				System.out.println("Invalid Amount Entered");
			} catch (InvalidMonthsException e) {
				System.out.println("Invalid Months Entered");
			}
			break;

		case 4:
			System.out.println("DO YOU WANT TO CALCULATE AGAIN ????" + " " + "RUN AGAIN THE PROGRAM");
		default:
			System.out.println("Wrong Choice");
		}

	}

}
