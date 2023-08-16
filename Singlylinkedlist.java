package deadline;

import java.util.Scanner;

public class Singlylinkedlist {
	class node{
		int data;
		node link;
	}
	private node first;
	private Scanner scan=new Scanner(System.in);

	public void insertrear()
	{
		node temp;
		System.out.println("enter the element");
		int ele=scan.nextInt();
		node newnode=new node();
		newnode.data=ele;
		newnode.link=null;
		if(first==null) 
		{
			first=newnode;
		}
		else
		{
			temp=first;
			while(temp.link!=null)
			{
				temp=temp.link;
			}
			temp.link=newnode;
		}
		
	}
	public void deleterear()
	{
	    node temp;
		if(first==null)
		{
			System.out.println("Delete not possible");
		}
		if(first.link==null)
		{
			System.out.println("element delete at "+first.data);
			first=null;
		}
		else
		{
			temp=first;
			while(temp.link.link!=null)
			{
				temp=temp.link;
			}
			System.out.println("element delete at "+temp.link.data);
			temp.link=null;
		}
	}
	public void insertfront()
	{
		System.out.println("enter the element");
		int ele=scan.nextInt();
		node newnode=new node();
		newnode.data=ele;
		newnode.link=null;
		if(first==null) 
		{
			first=newnode;
		}
		else
		{
			newnode.link=first;
			first=newnode;
		}
	}
	public void deletefront()
	{
		 node temp;
			if(first==null)
			{
				System.out.println("Delete not possible");
			}
			else if(first.link==null)
			{
				System.out.println("element delete at "+first.data);
				first=null;
			}
			else
			{
				System.out.println("delete the element "+first.data);
				first=first.link;
			}
	}
	public void display()
	{
		node temp;
		if(first==null)
		{
			System.out.println("display not possible");
		}
		else if(first.link==null)
		{
			System.out.println(first.data);
		}
		else
		{
			temp=first;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.link;
			}
			System.out.println();
		}
	
	}
}
