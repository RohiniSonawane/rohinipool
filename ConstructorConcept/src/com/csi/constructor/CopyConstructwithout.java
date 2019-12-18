package com.csi.constructor;

class student
{
	int id;
	int no;
	//int c;
	student(int i,int j)
	{
		
		id=i;
		no=j;
	
	
		
	}
	student()
	{
	}
		void display()
		{
			System.out.println("ID :"+id+"\nRoll NO :"+no);
		}
	}

public class CopyConstructwithout {
	public static void main(String[] args) {
		student s=new student(20,30);
		student s1=new student();
		s1.id=s.id;
		s1.no=s.no;
		s.display();
		s1.display();
		
	
		
	}

}
