package deadline;

import java.util.Scanner;

public class QueueApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size");
		int n=scan.nextInt();
		
		Queue s=new Queue(n);
		
		while(true)//infinite loop
		{
			System.out.println("press 1-------->INSERT");
			System.out.println("press 2-------->DELETE");
			System.out.println("press 3--------->DISPLAY");
			System.out.println("any other number for existing------->STOP");

			System.out.println("Enter your choice");
			int choice=scan.nextInt();
			
			switch(choice)
			{
			case 1:s.insert();
			       break;
			case 2:s.delete();
			       break;
			case 3:s.display();
		           break;
		    default:System.exit(0);
			}

		}


	}

}
