import java.util.Scanner;

public class Conversion{
	public static void main(String[] args) {
		Conversion conv = new Conversion();
	}
	
	public Conversion() {
		java.util.Scanner scn = new java.util.Scanner(System.in);
		
		System.out.println("Enter the number of feet: ");
		int numberOfFeet = scn.nextInt();
		if(numberOfFeet < 0) {
			System.out.println("Please enter a valid number. More than 0.");
		}else {
			int answer = numberOfFeet * 12;
			System.out.println("The number of inches is " + answer + ".");
		}
	}
}