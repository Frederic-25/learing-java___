package projects;
import java.util.*;

public class weight_converstion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double lbs;
		double kbs;
		double lbskbs;
		double kbslbs;
		int choice;
		
		System.out.println("Weight convertion program");
		System.out.println("1.convert lbs to kbs.");
		System.out.println("2.convert kgs to lbs.");
		
	    System.out.println("choose an option");
		choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.print("Enter the weight of lbs:");
			lbs=sc.nextDouble();
			lbskbs= lbs*0.45359237;
			System.out.printf("lbs to kgs:%.2f" , lbskbs);
		}
		else if(choice == 2) {
			System.out.print("Enter the weight of kbs:");
			kbs=sc.nextDouble();
			kbslbs=kbs*2.20462;
			System.out.printf("kgs to lbs:%.2f", kbslbs);
		}else {
			System.out.println("Invalid option.");
			}
	}
}
