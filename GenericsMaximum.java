package com.bl.generics;

import java.util.Scanner;

public class GenericsMaximum {
	
	
	public static void main(String[] args) {
		GenericsMaximum max = new GenericsMaximum() ;
		
		max.findMaxString();
		max.findMaxInteger();
		max.findMaxFloat();
			}	
	
	public void findMaxString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string: ");
		String x = sc.next();
		System.out.println("Enter second string: ");
		String y = sc.next();
		System.out.println("Enter third string: ");
		String z = sc.next();
		
		String max;
		if(x.compareTo(y) > 0 && y.compareTo(z) > 0) {
			max = x;
		}
		else if (y.compareTo(x) > 0 && y.compareTo(z) > 0) {
			max = y;
		}
		else {
			max = z;
		}
		System.out.println("Maximum String is: " +max + " among " +x+ " "+ y+" and "+z);
	}
	
	public void findMaxInteger() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number: ");
		int x = sc.nextInt();
		System.out.println("Enter second Number: ");
		int y = sc.nextInt();
		System.out.println("Enter third Number: ");
		int z = sc.nextInt();
		

		int max;
		if(x > y && x > z) {
			max = x;
		}
		else if (y > x && y > z) {
			max = y;
		}
		else {
			max = z;
		}
		System.out.println("Maximum Number is: " +max + " among " +x+ " "+ y+" and "+z);
	}
	
	public void findMaxFloat() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Float Number: ");
		float x = sc.nextFloat();
		System.out.println("Enter second string: ");
		float y = sc.nextFloat();
		System.out.println("Enter third string: ");
		float z = sc.nextFloat();
		

		float max;
		if(x > y && x > z) {
			max = x;
		}
		else if (y > x && y > z) {
			max = y;
		}
		else {
			max = z;
		}
		System.out.println("Maximum String is: " +max + " among " +x+ " "+ y+" and "+z);
	}
}

