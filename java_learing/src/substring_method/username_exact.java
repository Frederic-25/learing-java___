package substring_method;
import java.util.Scanner;

public class username_exact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String mail ;
		String username;
		
		System.out.print("Enter a mail:");
		mail = sc.next();
		
		username = mail.substring(0,mail.indexOf("@"));
		System.out.println(username);

	}

}
