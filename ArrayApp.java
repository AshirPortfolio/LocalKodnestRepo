package deadline;

import java.util.Scanner;

public class ArrayApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length");
		int n=scan.nextInt();
		
		Array a=new Array(n);
		
		while(true)//infinite loop
		{
			System.out.println("press 1.........inserting");
			System.out.println("press 2.........deleting");
			System.out.println("press 3.........display");
			System.out.println("any other number for existing");

			System.out.println("Enter your choice");
			int choice=scan.nextInt();
			
			switch(choice)
			{
			case 1:a.insert();
			       break;
			case 2:a.delete();
			       break;
			case 3:a.display();
		           break;
		    default:System.exit(0);
			}

		}
		
	}

}
