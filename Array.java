package deadline;

import java.util.Scanner;

public class Array {
	private int arr[];
	private Scanner scan=new Scanner(System.in);
    public Array(int n)
    {
    	arr=new int[n];
    }
    public void insert()
    {
    	System.out.println("enter the position from 0 to "+(arr.length-1));
    	int pos=scan.nextInt();
    	System.out.println("enter the elements");
    	int ele=scan.nextInt();
    	arr[pos]=ele;
    }
    public void delete() 
    {
    	System.out.println("enter the position to delete the element ");
    	int pos=scan.nextInt();
    	System.out.println("element is deleted is "+arr[pos]);
    	arr[pos]=0;
    }
    public void display()
    {
    	for(int i=0;i<=arr.length-1;i++) {
    		System.out.print(arr[i]+" ");
    	}
    		System.out.println();
    }

}
