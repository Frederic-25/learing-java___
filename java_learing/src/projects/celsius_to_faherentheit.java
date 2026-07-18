package projects;
import java.util.*;

public class celsius_to_faherentheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double temp;
		double result;
		String unit;
		
		System.out.print("Enter a temperature:");
		temp = sc.nextDouble();
		
		System.out.println("convert celsious to faherentheit(C or F):");
		unit = sc.next().toUpperCase();
		
		result = (unit.equals("C")) ? (temp-32)*5/9 : (temp*5/9)+32 ;
		System.out.printf("%.2f",result , unit);
		
		
	}

}
