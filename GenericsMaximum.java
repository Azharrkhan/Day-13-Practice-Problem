package com.bl.generics;

import java.util.Scanner;

public class GenericsMaximum {
	
	
	public static void main(String[] args) {
		GenericsMaximum max = new GenericsMaximum() ;
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter three strings of your choice");
		System.out.println("Enter first string: ");
		String x = sc.next();
		System.out.println("Enter second string: ");
		String y = sc.next();
		System.out.println("Enter third string: ");
		String z = sc.next();
		max.findMax(x, y, z);
	}	
	
	public void findMax(String x, String y, String z) {
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
}

