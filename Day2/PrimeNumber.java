package programs.Day2;

public class PrimeNumber {

	public static void main(String[] args) {
		isprime(11);
	}
	
	static void isprime(int n) {
		boolean flag = true;
		for (int i=2; i<=n/2; i++) {
			if(n%i==0) {
				flag = false;
			}
		}
		if(flag == true){
			System.out.println("Given number is Prime " + n);
		}else
			System.out.println("Given number is not Prime " + n);
	}
}
