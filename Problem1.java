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
/* package Tasks;

import java.util.Scanner;

public class Calculator {

	public double addition(double a, double b) {
		double c = a + b;
		return c;
	}

	public double Substraction(double a, double b) {
		double c = a - b;
		return c;
	}

	public double multiplication(double a, double b) {
		double c = a * b;
		return c;
	}

	public double divison(double a, double b) {
		double c = a / b;
		return c;
	}
	
	
	public static void main(String[] args) {
		boolean flag = true;
		Calculator calculator = new Calculator();
		Scanner sc= new Scanner(System.in);
		while(flag) {
			System.out.println("Enter 1 for addition...");
			System.out.println("Enter 2 for Substraction...");
			System.out.println("Enter 3 for multiplication...");
			System.out.println("Enter 4 for divison...");
			System.out.println("Enter 5 for Exit...");
			int input = sc.nextInt();
			switch (input) {
			case 1: {
				System.out.println("Enter a firts number for addition");
				double a = sc.nextDouble();
				System.out.println("Enter a second number for addition...");
				double b = sc.nextDouble();
				System.out.println("addition for given two numbers == "+calculator.addition(a, b));	
				break;
			}
			case 2:{
				System.out.println("Enter a firts number for Substraction");
				double a = sc.nextDouble();
				System.out.println("Enter a second number for Substraction...");
				double b = sc.nextDouble();
				System.out.println("Substraction for given two numbers == "+calculator.Substraction(a, b));	
				break;
			}
			case 3:{
				System.out.println("Enter a firts number for multiplication");
				double a = sc.nextDouble();
				System.out.println("Enter a second number for multiplication...");
				double b = sc.nextDouble();
				System.out.println("multiplication for given two numbers == "+calculator.multiplication(a, b));	
				break;
			}
			case 4:{
				System.out.println("Enter a firts number for divison");
				double a = sc.nextDouble();
				System.out.println("Enter a second number for divison...");
				double b = sc.nextDouble();
				if(a!=0 && b!=0) {
					System.out.println("division for given two numbers == "+calculator.divison(a, b));
				}else {
					System.out.println("Its not possible to division with 'Zero' Pls enter valid numbers..");
				}
				break;
			}
			case 5:{
				System.out.println("Tqs for visiting my Calculator \n Visit again .....");
				flag=false;
				break;
			}
			default:{
				System.out.println("Invalid choice enter above options only......");
				
				System.out.println("\n  _________________________________  \n ");
			}
			
			
			}
		}
	}
}
*/
