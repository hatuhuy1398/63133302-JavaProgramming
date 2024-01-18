package ntu.edu;

import java.util.Scanner;
import java.math.*;
import java.lang.*; 
import java.io.*;

public class Bai3 {

	static double a;
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Nhập vào canh: ");
		
		a = scanner.nextDouble();
		
		double V;
		V = Math.pow(a,3);
		
		
		System.out.printf("The tích: %.1f\n", V);
		
		
	}

}
