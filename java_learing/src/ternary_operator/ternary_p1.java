package ternary_operator;
import java.util.Scanner;
public class ternary_p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        String result = (ch >= 'A' && ch <= 'Z') ? "Uppercase Letter" : "Lowercase Letter";

        System.out.println(result);

        sc.close();

	}

}
