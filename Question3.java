
public class Question3 {
	public static void main (String [] args){
		long number=600851475143L;
		for (long i=2L; i<number;i++){
			if (number%i==0){
				System.out.println(i);
				do {
					number/=i;
				} while (number%i==0);
			}
				
		}
	}
}
