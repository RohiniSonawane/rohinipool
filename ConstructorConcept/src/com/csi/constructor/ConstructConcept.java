/**
 * 
 */
package com.csi.constructor;

/**
 * @author Admin
 *
 */
class Employee{
	String Name="ruhi";
	int ID;
	double eee;
	long d;
	char t;
	float f;
	short s;
	byte b;
	boolean n;
	 Employee(){
		
		System.out.println("Employee Name : "+Name+"\n Employee ID : "+ID+"\nDouble value"+eee+"\n long :"+d+"\n char"+t+"float"+f+"\nShort"+s+"\nbyte"+b+"\nboolean"+n);
	}
	 Employee(double eID){
			
			System.out.println("\n Employee ID : "+eID);
		}
	 
}
class Department
{
	int f;
	int l;
	Department(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition :"+c);
		
	}
	Department(double a,double b)
	{
		double c=a+b;
	System.out.println("Addition :"+c);
	}
}
public class ConstructConcept {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e= new Employee();
		Employee ee= new Employee(12);
		Department w=new Department(23,30);
		Department f=new Department(3,30);

	

	}

}
