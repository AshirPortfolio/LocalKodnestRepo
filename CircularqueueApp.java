package deadline;

import java.util.Scanner;

public class CircularqueueApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the Circularqueue");
		int n=scan.nextInt();
		
		Circularqueue cq=new Circularqueue(n);
		
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
			case 1:cq.insert();
			       break;
			case 2:cq.delete();
			       break;
			case 3:cq.display();
		           break;
		    default:System.exit(0);
			}

		}



	}

}
