package programs.Day2;

import java.text.DecimalFormat;

public class PetrolAvgPrice {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		int pprice[] = new int[6];
		pprice[0] = 110;
		pprice[1] = 115;
		pprice[2] = 112;
		pprice[3] = 113;
		pprice[4] = 105;
		pprice[5] = 103;
		
		System.out.println("Average Petrol price is " + df.format(average(pprice)));
	}
	
	static double average (int pprice[]) {
		
		double sum = 0;
		for (int i = 0; i<pprice.length; i++) {
			sum = sum + pprice[i];
		}
		
		double avg = sum/pprice.length;
		
		return avg;
	}
	
}
