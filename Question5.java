
public class Question5 {
	public static void main (String[] args){
		int [] factors = new int [20];
		for (int i = 2; i <= 20; i++) {
			int j = i;
			while (j!=1) {
				int k = 2;
				if (j%k==0) {
					j/=k;
					factors [k-1]++;
				}
				k++;
			}
		}
	}
}
