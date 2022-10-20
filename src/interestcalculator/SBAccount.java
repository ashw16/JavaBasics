package interestcalculator;

import java.util.Scanner;

public class SBAccount extends Account {
	double SBamount, SbInterestRate, interest;
	Scanner sc = new Scanner(System.in);

	@Override

	double calculateInterest(double amount) throws InvalidAmountException {
		this.SBamount = amount;
		if (SBamount < 0) {
			throw new InvalidAmountException();
		}
		System.out.println("select account type \n1. NRI \n2. Normal ");
		int accountChoice = sc.nextInt();
		switch (accountChoice) {
		case 1:
			SbInterestRate = .06;
			break;
		case 2:
			SbInterestRate = .04;
			break;
		default:
			System.out.println("please choose right account again");
		}
		return amount * SbInterestRate;
	}

}
