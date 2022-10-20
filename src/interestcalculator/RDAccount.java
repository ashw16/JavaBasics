package interestcalculator;

import java.util.Scanner;

public class RDAccount extends Account {
	double RDInterestRate;
	double RDamount;
	int noOfMonths;
	double MonthlyAmount;
	double General, SCitizen;
	Scanner sc = new Scanner(System.in);

	@Override

	double calculateInterest(double Ramount)
			throws InvalidMonthsException, InvalidAgeException, InvalidAmountException {
		this.RDamount = amount;
		System.out.println("Enter RD months");
		noOfMonths = sc.nextInt();
		System.out.println("Enter RD holder Age");
		int age = sc.nextInt();
		if (RDamount < 0) {
			throw new InvalidAmountException();
		}
		if (noOfMonths < 0) {
			throw new InvalidMonthsException();
		}
		if (age < 0) {
			throw new InvalidAgeException();
		}
		if (noOfMonths >= 0 && noOfMonths <= 6) {
			General = 0.750;
			SCitizen = 0.080;
		} else if (noOfMonths >= 7 && noOfMonths <= 9) {
			General = 0.775;
			SCitizen = 0.0825;
		} else if (noOfMonths >= 10 && noOfMonths <= 12) {
			General = 0.080;
			SCitizen = 0.0850;
		} else if (noOfMonths >= 13 && noOfMonths <= 15) {
			General = 0.0825;
			SCitizen = 0.0900;
		} else if (noOfMonths >= 16 && noOfMonths <= 18) {
			General = 0.0850;
			SCitizen = 0.0900;
		} else if (noOfMonths >= 22) {
			General = 0.0875;
			SCitizen = 0.0925;
		}
		RDInterestRate = (age < 50) ? General : SCitizen;
		return RDamount * RDInterestRate;

	}
}
