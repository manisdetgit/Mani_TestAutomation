package programs.Day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 10;
		int a = 0;
		int b = 1;
		int c;
		System.out.print(" " + a);
		System.out.print(" " + b);
		for(int i=3;i<=n;i++) {
			c = a+b;
			a = b;
			b = c;
			System.out.print(" " + b);
		}
	}
}
