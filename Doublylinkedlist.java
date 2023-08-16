package deadline;

import java.util.Scanner;

public class Doublylinkedlist {
	class node{
		node prelink;
		int data ;
		node nextlink;
	}
	private node first;
	private Scanner scan=new Scanner(System.in);

public void insertrear()
	 {
		 node temp;
		 System.out.println("enter the element");
		 int ele=scan.nextInt();
		 node newnode=new node();
		 newnode.prelink=null;
		 newnode.data=ele;
		 newnode.nextlink=null;
		 
		 if(first==null)
		 {
	      first=newnode;
		 }
		 else
		 {
			 temp=first;
			 while(temp.nextlink!=null)
			 {
				 temp=temp.nextlink;
			 }
			 temp.nextlink=newnode;
			 newnode.prelink=temp;
		 }
	 }
 public void deleterear()
	 {
		 node temp;
		 if(first==null)
		 {
			 System.out.println("delete is not possible");
		 }
		 else if(first.nextlink==null)
		 {
			 System.out.println(first.data);
			 first=null;
		 }
		 else
		 {
			 temp=first;
			 while(temp.nextlink.nextlink!=null)
			 {
				 temp=temp.nextlink;
			 }
			 System.out.println(temp.nextlink.data);
			 temp.nextlink=null;
		 }
			 
	 }
 public void insertfront()
 {
	 System.out.println("enter the element");
	 int ele=scan.nextInt();
	 node newnode=new node();
	 newnode.prelink=null;
	 newnode.data=ele;
	 newnode.nextlink=null;
	 
	 if(first==null)
	 {
      first=newnode;
	 }
	 else
	 {
		 newnode.nextlink=first;
	     first.prelink=newnode;
	     first=newnode;
	 }
	 
 }
 public void deletefront()
 {
	 if(first==null)
	 {
		 System.out.println("delete at front is not possible");
	 }
	 if(first.nextlink==null)
	 {
		 System.out.println(first.data);
		 first=null;
	 }
	 else
	 {
		 System.out.println("delete at front "+first.data);
		 first=first.nextlink;
		 first.prelink=null;
	 }
 }
 public void displayforward()
 {
	 node temp;
	 if(first==null)
	 {
		 System.out.println("dispplay is not possible");
	 }
	 else if(first.nextlink==null)
	 {
		 System.out.println(first.data);
	 }
	 else
	 {
		 temp=first;
		 while(temp!=null)
		 {
			 System.out.print(temp.data+" ");
			 temp=temp.nextlink;
		 }
		 System.out.println();
	 }
 }
 public void displayreverse()
 {
	 node temp;
	 if(first==null)
	 {
		 System.out.println("Display is not possible");
	 }
	 else if(first.nextlink==null)
	 {
		 System.out.println(first.data);
	 }
	 else
	 {
		 temp=first;
		 while(temp.nextlink!=null)
		 {
			 temp=temp.nextlink;
		 }
		 while(temp!=null)
		 {
			 System.out.print(temp.data+" ");
			 temp=temp.prelink;
		 }
		 System.out.println();
	 }
 }
}
