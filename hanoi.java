import java.util.*;

class Hanoi {

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int n = 3;

		while (true) {
			System.out.print("N: ");
			
			if (input.hasNextLine()) {
				String in = input.nextLine();
				n = Integer.parseInt(in);
			}

			h(n);
		}
	}

	// log solution to screen, do not store any values
	private static void h(int n) {
		long startTime = System.currentTimeMillis();

		for (int m = 1; m <= (int) Math.pow(2, n) - 1; m++) {
			// calculate source
			int from = (m & m - 1) % 3;

			// calculate destination
			int to = ((m | m - 1) + 1) % 3;

			// log move (comment for large n values)
			System.out.println(from + " to " + to);
		}

		// calculate runtime
		long endTime = System.currentTimeMillis();
		long runTime = endTime - startTime;

		System.out.println("Done: " + (int) (Math.pow(2, n) - 1) + " steps.");
		System.out.println("Runtime: " + runTime + "ms\n");
	}

}