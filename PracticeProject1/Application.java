
public class Application {

	public static void main(String[] args) {
		int y = 12;
		Boolean isPrime = true;

		for (int x = 2; x < y; x = x + 1) {
			int z = y % x;
			if (z == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime)
			System.out.println(y + " is a prime number");
		else
			System.out.println(y + " is not a prime number");

	}

}
