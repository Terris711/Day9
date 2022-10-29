package Day9;

public class fibonacci {

	public static void main(String[] args) {
		int n = 10;

		System.out.println("Using loop: ");
		for (int i = 0; i < n; i++) {
			System.out.println("fib(" + i + ") = " + fibIterative(i));
		}
		
		System.out.println("Using recursion O(2^n): ");
		for (int i = 0; i < n; i++) {
			System.out.println("fib(" + i + ") = " + fibRecursion(i));
		}
		
		System.out.println("Using recursion O(N) recursion: ");
		for (int i = 0; i <= n - 1; i++) {
			System.out.println("fib(" + i + ") = " + fib(i));
		}
	}

	public static int fibIterative(int n) {
		int fibVal = 0;
		int curVal = 1;
		int lastVal = 0;

		if (n == 0) {
			fibVal = 0;
		} else if (n == 1) {
			fibVal = 1;
		} else {
			for (int i = 1; i < n; i++) {
				fibVal = curVal + lastVal;
				lastVal = curVal;
				curVal = fibVal;
			}
		}
		return fibVal;
	}
	// Time complexity: O(N)

	public static int fibRecursion(int n) {
		int fibVal = 0;

		if (n == 0) {
			fibVal = 0;
		} else if (n == 1) {
			fibVal = 1;
		} else {
			fibVal = fibRecursion(n - 1) + fibRecursion(n - 2);
		}
		return fibVal;
	}
	// Time complexity: O(2^N)
	
	public static int fib(int n) {
		int[] fibArr = new int[n + 2];
		
		fibArr[0] = 0;
		fibArr[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			fibArr[i] = fibArr[i - 1] + fibArr[i - 2];
		}
		return fibArr[n];
	}
	// Time complexity: O(N)
}
