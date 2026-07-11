package projects;
import java.util.Scanner;

public class area_volume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double rad;
		double cicurfrence;
		double area;
		double volume;
		
		System.out.print("enter a radius:");
		rad = sc.nextDouble();
		
		cicurfrence = 2* Math.PI * rad;
		System.out.println("circumference  "+ cicurfrence+"cm");
		
		area=Math.PI * Math.pow(rad, 2);
		System.out.println("area:"+area+"cm");
		
		volume = (4.0/3.0)*Math.PI*Math.pow(rad, 2);
		System.out.println("voume:"+volume+"cm");

	}

}
