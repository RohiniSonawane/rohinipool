/**
 * 
 */
package com.csi.constructor;

/**
 * @author Admin
 *
 */
class Emp {
	int c;
	int d;

	public Emp(int a, int b) {
		c = a;
		d = b;
		int s = c + d;
		System.out.println("Addition :" + s);
	}

	public Emp(Emp e) {
		c = e.c;
		d = e.d;

		int f = c + d;
		System.out.println("Addition :" + f);
	}

}

public class CopyConstruct {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1 = new Emp(22, 33);
		Emp e2 = new Emp(e1);

	}

}
