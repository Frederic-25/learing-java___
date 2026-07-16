package substring_method;
import java.util.*;

public class last_4digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String num;
		String last;
		
		System.out.print("Enter a number:");
		num = sc.nextLine();
		
		last = num.substring(num.length()-4);
		System.out.print(last);
	}

}
