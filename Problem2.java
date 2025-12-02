package Tasks;

import java.util.Scanner;

public class Problem2 {

	public static String generateOddSeries(int a) {
		if (a <= 0)
			return "";

		StringBuffer result = new StringBuffer();

		int count = 0;
		int number = 1;
		while (count < a) {
			result.append(number);

			if (count < a - 1) {
				result.append(",");
			}
			number += 2;
			count++;
		}
		return result.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter integer a: ");
		int a = scanner.nextInt();

		String output = generateOddSeries(a);
		System.out.println("Output: " + output);

	}
}
