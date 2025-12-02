package Tasks;

import java.util.Scanner;

public class Problem3 {

	public static String generateOddSeriesUpto(int a) {
		if (a <= 0)
			return "";

		int limit = a % 2 == 0 ? a - 1 : a;
		StringBuffer result = new StringBuffer();

		int count = 0;
		int number = 1;
		while (count < limit) {
			result.append(number);

			if (count < limit-1) {
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

		String output = generateOddSeriesUpto(a);
		System.out.println("Output: " + output);
		
	}
}
