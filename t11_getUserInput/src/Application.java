import java.util.Scanner;

public class Application {
	public static void main(String[] args){
		
		//Create a new scanner object
		Scanner input= new Scanner (System.in);
		
		//Output the prompt
		System.out.println("Enter a floating point value: ");
		
		//Wait for the user to input something
		double value= input.nextDouble();
		
		//Tell them what they entered
		System.out.println("You entered: "+ value);
		}
	}


