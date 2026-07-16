package substring_method;
import java.util.Scanner;
public class extract_fisrtname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		String first;
		
		System.out.print("Enter your name:");
		name = sc.nextLine();
		first = name.substring(0,name.indexOf(" "));
		System.out.println(first);
	}

}
