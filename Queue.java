package deadline;

import java.util.Scanner;

public class Queue {
	 private int q[];
	 private int size;
	 private int f=0;
	 private int r=-1;

	 private Scanner scan=new Scanner(System.in);
	 //1 constructor 
	 public Queue(int n)
	 {
		 q=new int[n];
		 size=q.length;
	 }
     public void insert()
     {
    	 if(r==size-1)//queue is full
    	 {
    		 System.out.println("insert not possible");
    	 }
    	 else
    	 {
    		 System.out.println("enter the element");
    		 int ele=scan.nextInt();
    		 ++r;//increment rear(r)
    		 q[r]=ele; 
    	 }
     }
     public void delete()
     {
    	 if(f>r || r==-1)//queue is empty
    	 {
    		 System.out.println("delete not possible");
    	 }
    	 else
    	 {
    		 System.out.println("element delete at "+q[f]);
    		 ++f;//increment front
    	 }
 
     }
     public void display()
     {
    	 if(f>r || r==-1)
    	 {
    		 System.out.println("Display not possible");
    	 }
    	 else
    	 {
    		 for(int i=f;i<=r;i++)
    		 {
    			 System.out.print(q[i]+" ");
    		 }
    		 System.out.println();
    	 }
     }

}
