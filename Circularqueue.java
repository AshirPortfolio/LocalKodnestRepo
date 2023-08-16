package deadline;

import java.util.Scanner;

public class Circularqueue {
	 private int cq[];
	 private int size;
	 private int f=0;
	 private int r=-1;
	 private int count=0;

	 private Scanner scan=new Scanner(System.in);
	 //1 constructor 
	 public Circularqueue(int n)
	 {
		 cq=new int[n];
		 size=cq.length;
	 }
     public void insert()
     {
    	 if(count==size)//Circularqueue is full
    	 {
    		 System.out.println("insert not possible");
    	 }
    	 else
    	 {
    		 System.out.println("enter the element");
    		 int ele=scan.nextInt();
    		 r=(r+1)%size;
    		 cq[r]=ele;
    		 count++;//increment count
    		
    	 }
     }
     public void delete()
     {
    	 if(count==0)//Circularqueue is empty
    	 {
    		 System.out.println("delete not possible");
    	 }
    	 else
    	 {
    		 System.out.println("element delete at "+cq[f]);
    		 f=(f+1)%size;
    		 count--;//decrement count
    	 }
 
     }
     public void display()
     {
    	 int f1=f;
    	 if(count==0)
    	 {
    		 System.out.println("Display not possible");
    	 }
    	 else
    	 {
    		 for(int i=1;i<=count;i++)
    		 {
    			 System.out.print(cq[f1]+" ");
    			 f1=(f1+1)%size;
    		 }
    		 System.out.println();
    	 }
     }

}
