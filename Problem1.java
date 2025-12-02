package Tasks;

import java.util.Scanner;

public class Problem1 {

	class Calculator {
		public double calculate(double a, double b, String operation) {
			operation = operation.toLowerCase();

			switch (operation) {

			case "addition":
				return a + b;

			case "subtraction":
				return a - b;

			case "multiplication":

				return a * b;

			case "division":

				if (b == 0) {
					throw new ArithmeticException("Cannot divide by zero");
				}
				return a / b;

			default:
				throw new IllegalArgumentException(
						"Invalid operation. Use: addition, subtraction, multiplication, division");
			}
		}
	}

	public static void main(String[] args) {
		Problem1 p1 = new Problem1();
		Calculator calculator = p1.new Calculator();
		Scanner scanner = new Scanner(System.in);

		System.out.println("=== Calculator Program ===");

		System.out.print("Enter first number a : ");
		double a = scanner.nextDouble();

		System.out.print("Enter second number b: ");
		double b = scanner.nextDouble();

		System.out.print("Enter type of operation (addition/subtraction/multiplication/division): ");
		String operation = scanner.next();

		double result = calculator.calculate(a, b, operation);
		System.out.println("The " + operation + " of " + a + " and " + b + " is " + result);
	}
}
