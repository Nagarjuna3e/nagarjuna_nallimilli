package Tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem4 {

	public static Map<Integer, Integer> countMultiples(int[] number) {
		HashMap<Integer, Integer> countmap = new HashMap<Integer, Integer>();

		for (int i = 1; i <= 9; i++) {
			countmap.put(i, 0);
		}

		for (int num : number) {

			for (int divisor = 1; divisor <= 9; divisor++) {
				if (num % divisor == 0) {

					countmap.put(divisor, countmap.get(divisor) + 1);
				}
			}
		}
		return countmap;
	}

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of the array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i=0;i<size;i++) {
			
			arr[i] =sc.nextInt();
		}

		Map<Integer, Integer> result = countMultiples(arr);

		System.out.println(result);
	}
}

