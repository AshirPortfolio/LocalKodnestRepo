package deadline;

import java.util.Scanner;

public class StackApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size");
		int n=scan.nextInt();
		
		Stack s=new Stack(n);
		
		while(true)//infinite loop
		{
			System.out.println("press 1-------->PUSH");
			System.out.println("press 2-------->POP");
			System.out.println("press 3--------->DISPLAY");
			System.out.println("any other number for existing------->STOP");

			System.out.println("Enter your choice");
			int choice=scan.nextInt();
			
			switch(choice)
			{
			case 1:s.push();
			       break;
			case 2:s.pop();
			       break;
			case 3:s.display();
		           break;
		    default:System.exit(0);
			}

		}

	}

}
