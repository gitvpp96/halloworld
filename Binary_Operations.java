package vpp;

import java.util.Scanner;

public class Binary_Operations {
	static int b1,b2,b3;
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter 2 binary num");
		b1=scn.nextInt();
		b2=scn.nextInt();
		b3=b1+b2;
		System.out.println(Integer.toBinaryString(b3));
	}

}
