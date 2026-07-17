package ternary_operator;
import java.util.*;
public class string_equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string 1:");
		String str1 = sc.nextLine();
		System.out.print("Enter a string 2:");
		String str2 = sc.nextLine();
		
		//String compare = (str1 == str2) ? "Same" : "notsame";
		String compare = (str1.equals(str2)) ? "Same" : "notsame";
		
		System.out.println(compare);

	}

}
