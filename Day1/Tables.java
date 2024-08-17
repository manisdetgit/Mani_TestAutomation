package programs.Day1;

public class Tables {
	public static void main(String[] args) {
		
		int n = 10;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=10; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println("------------------------------------------------");
		}
	}
	

}
