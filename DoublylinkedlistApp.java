package deadline;

import java.util.Scanner;

public class DoublylinkedlistApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		Doublylinkedlist dll=new Doublylinkedlist();
		
		while(true)//infinite loop
		{
			System.out.println("press 1-------->INSERTREAR");
			System.out.println("press 2-------->DELETEREAR");
			System.out.println("press 3-------->INSERTFRONT");
			System.out.println("press 4-------->DELETEFRONT");
			System.out.println("press 5--------->DISPLAYFORWARD");
			System.out.println("press 6--------->DISPLAYREVERSE");
			System.out.println("any other number for existing------->STOP");

			System.out.println("Enter your choice");
			int choice=scan.nextInt();
			
			switch(choice)
			{
			case 1:dll.insertrear();
			       break;
			case 2:dll.deleterear();
			       break;
			case 3:dll.insertfront();
		       break;
		    case 4 :dll.deletefront();
		       break;
			case 5:dll.displayforward();
		           break;
			case 6:dll.displayreverse();
	           break;
		    default:System.exit(0);
			}

		}

	}

}
