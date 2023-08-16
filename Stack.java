package deadline;

import java.util.Scanner;

public class Stack {
	 private int s[];
	 private int size;
	 private int top=-1;
	 private Scanner scan=new Scanner(System.in);
	 //1 constructor
	 public Stack(int n)
	 {
		 s=new int[n];
		 size=s.length;
	 }
     public void push()
     {
    	 if(top==size-1)//stack is full
    	 {
    		 System.out.println("push not possible");
    	 }
    	 else
    	 {
    		 System.out.println("enter the element");
    		 int ele=scan.nextInt();
    		 ++top;//increment top
    		 s[top]=ele; 
    	 }
     }
     public void pop()
     {
    	 if(top==-1)//stack is empty
    	 {
    		 System.out.println("pop not possible");
    	 }
    	 else
    	 {
    		 System.out.println("element delete at "+s[top]);
    		 --top;//decrement top
    	 }
 
     }
     public void display()
     {
    	 if(top==-1)
    	 {
    		 System.out.println("Display not possible");
    	 }
    	 else
    	 {
    		 for(int i=top;i>=0;i--)
    		 {
    			 System.out.println(s[i]);
    		 }
    	 }
     }

}
