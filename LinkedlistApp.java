package deadline;

import java.util.Scanner;

public class LinkedlistApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	Singlylinkedlist ll=new Singlylinkedlist();
	
	while(true)//infinite loop
	{
		System.out.println("press 1-------->INSERTREAR");
		System.out.println("press 2-------->DELETEREAR");
		System.out.println("press 3-------->INSERTFRONT");
		System.out.println("press 4-------->DELETEFRONT");
		System.out.println("press 5--------->DISPLAY");
		System.out.println("any other number for existing------->STOP");

		System.out.println("Enter your choice");
		int choice=scan.nextInt();
		
		switch(choice)
		{
		case 1:ll.insertrear();
		       break;
		case 2:ll.deleterear();
		       break;
		case 3:ll.insertfront();
	       break;
	    case 4 :ll.deletefront();
	       break;
		case 5:ll.display();
	           break;
	    default:System.exit(0);
		}

	}

}
}
