package projects;
import java.util.Scanner;

public class shopping_cart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  String item= sc.nextLine();
  int price=sc.nextInt();
  int like=sc.nextInt();
  
  System.out.println("what item you like to buy:"+ item);
  System.out.println("what is the price for each:"+ price);
  System.out.println("how many woukd you like:"+ like);
  
  double total = price * like;
  
  System.out.println("you have brough"+like+item+"'s");
  System.out.println("your total is $:"+total);
  
  sc.close()
	}

}
