package deadline;

import java.util.Scanner;

public class SinglylinkedlistApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Singlylinkedlist sll=new Singlylinkedlist();
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
			case 1:sll.insertrear();
			       break;
			case 2:sll.deleterear();
			       break;
			case 3:sll.insertfront();
		       break;
		    case 4 :sll.deletefront();
		       break;
			case 5:sll.display();
		           break;
		    default:System.exit(0);
			}
		}

	}

}
