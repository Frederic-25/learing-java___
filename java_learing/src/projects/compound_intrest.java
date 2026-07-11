package projects;
import java.util.Scanner;

public class compound_intrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      
      double amaount;
      double rate;
      int times;
      int year;
      double compound;
      
      System.out.print("Enter the principal amount:");
      amaount = sc.nextDouble();
      
      System.out.print("Enter the interst rate (in %):");
      rate = sc.nextDouble() /100;
      
      System.out.print("Enter the times compound year:");
      times = sc.nextInt();
      
      System.out.print("Enter the years:");
      year = sc.nextInt();
      
      compound = amaount * Math.pow(1 + rate/year, year*times);
      System.out.print("the amount of 1 year is:$"+compound);
      
      sc.close();
      
	}

}
