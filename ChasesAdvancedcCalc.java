package Project1;

import java.util.Scanner;

public class ChasesAdvancedcCalc {

	public static void main(String[] args) {
		float a,b,res=0;
		char choice;
		Scanner scan = new Scanner(System.in);
		do
		{
			System.out.println("\n\nMain Menu: \n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Squared\n6.Squareroot\n7.Exponential\n8.Sine\n9.Cosine"
					+ "\na.Tangent\nb.Absolute\nc.Logrhythm \nd.Multiply by PI\ne.Multiply by e\nf.e to the power\ng.ArcSine\nh.ArcCosine\ni.ArcTangent\nj.To Degrees"
					+ "\nk.To Radians\nq.Exit");
			System.out.println("Enter your choice: ");
			choice= scan.next().charAt(0);
			switch(choice) { 
			case'1':
				System.out.println("Enter two numbers: ");
				a = scan.nextFloat();
				b = scan.nextFloat();
				
				res = a+b;
				System.out.println("Result: " + res);
				break;
			case'2':
				System.out.println("Enter two numbers: ");
				a = scan.nextFloat();
				b = scan.nextFloat();
				
				res = a-b;
				System.out.println("Result: " + res);
				break;
			case'3':
				System.out.println("Enter two numbers: ");
				a = scan.nextFloat();
				b = scan.nextFloat();
				
				res = a*b;
				System.out.println("Result: " + res);
				break;
			case'4':
				System.out.println("Enter two numbers: ");
				a = scan.nextFloat();
				b = scan.nextFloat();
				
				res = a/b;
				System.out.println("Result: " + res);
				break;
			case'5':
				System.out.println("Enter a number: ");
				a = scan.nextFloat();
				
				res = (float) Math.pow(a,2);
				System.out.println("Result: " + res);
				break;
			case'6':
				System.out.println("Enter a number: ");
				a = scan.nextFloat();
				
				res = (float) Math.sqrt(a);
				System.out.println("Result: " + res);
				break;
			case'7':
				System.out.println("Enter a base number: ");
				a = scan.nextFloat();
				System.out.println("Enter a power number: ");
				b = scan.nextFloat();
				
				res = (float) Math.pow(a,b);
				System.out.println("Result: " + res);
				break;
			case'8':
				System.out.println("Enter a number: ");
				a = scan.nextFloat();
				
				res = (float) Math.sin(a);
				System.out.println("Result: " + res);
				break;
			case'9':
				System.out.println("Enter a number: ");
				a = scan.nextFloat();
				
				res = (float) Math.cos(a);
				System.out.println("Result: " + res);
				break;
			case'a':
				System.out.println("Enter a number: ");
				a = scan.nextFloat();
				
				res = (float) Math.tan(a);
				System.out.println("Result: " + res);
				break;
			case'b':
					System.out.println("Enter a number: ");
					a = scan.nextFloat();
					
					res = Math.abs(a);
					System.out.println("Result: " + res);
					break;
			case'c':
				System.out.println("Enter a number: ");
				a = scan.nextFloat();
				
				res = (float) Math.log(a);
				System.out.println("Result: " + res);
				break;
			case'd':
				System.out.println("Enter a number: ");
				a = scan.nextFloat();
				
				res = (float) (a*(Math.PI));
				System.out.println("Result: " + res);
				break;
			case'e':
				System.out.println("Enter a number: ");
				a = scan.nextFloat();
				
				res = (float) (a*Math.E);
				System.out.println("Result: " + res);
				break;
			case'f':
				System.out.println("Enter a number: ");
				a = scan.nextFloat();
				
				res = (float) Math.pow(Math.E, a);
				System.out.println("Result: " + res);
				break;
			case'g':
				System.out.println("Enter a number: ");
				a = scan.nextFloat();
				
				res = (float)Math.asin(a);
				System.out.println("Result: " + res);
				break;
			case'h':
				System.out.println("Enter a number: ");
				a = scan.nextFloat();
				
				res = (float)Math.acos(a);
				System.out.println("Result: " + res);
				break;
			case'i':
				System.out.println("Enter a number: ");
				a = scan.nextFloat();
				
				res = (float)Math.atan(a);
				System.out.println("Result: " + res);
				break;
			case'j':
				System.out.println("Enter a number: ");
				a = scan.nextFloat();
				
				res = (float) Math.toDegrees(a);
				System.out.println("Result: " + res);
				break;
			case'k':
				System.out.println("Enter a number: ");
				a = scan.nextFloat();
				
				res = (float)Math.toRadians(a);
				System.out.println("Result: " + res);
				break;
			case'q':
				System.exit(0);
				break;
			default:
				System.out.println("The choice is not present");
			}
		}
		while(choice!='q');

	}

}

