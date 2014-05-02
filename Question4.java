import java.io.Console;


public class Question4 {
	public static void main (String[] args){
		int product = 0;
		int reverse = 0;
		int largest = 0;
		for (int x = 999; x > 900; x--) {
			for (int y = 999; y >= x; y--) {
				product = x*y;
				reverse = reverse(product);
				if (product == reverse) {
					if (product > largest) {
						largest = product;
					}
				}
			}
		}

		System.out.print(largest);
	}
	
	public static int reverse (int toReverse) {
		int reverse = 0;
		
		while (toReverse!=0) {
			int remainder = toReverse %10;
			reverse = reverse * 10 + remainder;
			toReverse /=10;
		}
		return reverse;
	}
}
