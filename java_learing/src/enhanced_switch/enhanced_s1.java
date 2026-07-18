package enhanced_switch;
import java.util.*;

public class enhanced_s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Menu restuarent
		Scanner sc = new Scanner(System.in);
		
		String menu;
		
		System.out.print("Enter food you want(Pizza/Burger/sandwich/coffe):");
		menu = sc.next();
		
		switch(menu){
			case "Pizza" -> 
				System.out.println("your ordered is Pizza its prize is $100");
			case "Burger" -> 
				System.out.println("your ordered is Burger its prize is $150");
			case "Sandwich" ->
				System.out.println("your ordered is sandwich its prize is $200");
			case "Coffee" ->
				System.out.println("your ordered is coffe its prize is $50");
			default -> 
				System.out.println("your order is not found");
		}
	}	

	}
