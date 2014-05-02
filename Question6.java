
public class Question6 {
	public static void main (String [] args) {
		int difference;
		int sum = sumOfSquares(100);
		int square = squareOfSums(100);
		difference = square - sum;
		System.out.print(difference);
	}
	
	private static int sumOfSquares (int upTo) {
		int sum = 0;
		for (int i = 1; i <= upTo; i++) {
			sum += i*i;
		}
		return sum;
	}
	
	private static int squareOfSums(int upTo) {
		int square = 0;
		for (int i = 1; i <= upTo ; i++) {
			square += i;
		}
		return square*square;
	}
}


