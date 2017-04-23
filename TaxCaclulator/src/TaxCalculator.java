import java.util.Scanner;

public class TaxCalculator {
	double input;

	static Scanner scanner = new Scanner(System.in);
	{

		System.out.println("Enter Your DOB in the following format: YYYY");
	}

	public void calculator() throws Exception {

		try {

			double input = scanner.nextInt();
			double taxed = (input - 11500) * 0.8;

			if ((input > 1_000_000 || input < 100)) {

				throw new Exception();

			} else {
				System.out.println("Your Yearly income after tax is: " + (taxed + 11500));
			}
			
			//add NI
			//Your pay	Class 1 National Insurance rate
			//£157 to £866 a week (£680 to £3,750 a month)	12%
			//Over £866 a week (£3,750 a month)	2%

		} catch (Exception ex) {
			System.out.println("Please enter an income between 100 and 1000000 without currency or commas");
		}

		finally {
		}

	}
}