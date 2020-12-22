import java.util.Scanner; 
public class SwapAttempt 
{ 
	public static void main(String[] args) 
	{ 
	// declare variables 
	int x, y,temp; 
	// enter values 
	Scanner keyboard = new Scanner(System.in); 
	System.out.print("Enter value for x "); 
	x = keyboard.nextInt(); 
	System.out.print("Enter value for y "); 
	y = keyboard.nextInt(); 
	// code attempting to swap two variables 
	temp = x;
	x = y;
	y = temp;
	System.out.println("x = " + x);
	System.out.println("y = " + y);
	}
}
