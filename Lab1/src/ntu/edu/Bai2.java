/**
 * 
 */
package ntu.edu;
import java.util.Scanner;
import java.math.*;
import java.lang.*; 
import java.io.*;

public class Bai2 {

	static double length, width;
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập vào chiều dài: ");
		
		length = scanner.nextDouble();
		
		System.out.print("Nhập vào chiều rộng: ");
		
		width = scanner.nextDouble();
		
		double S, P;
		P = (length + width)*2;
		S = length * width;
		
		System.out.printf("Chu vi: %.1f \n", P);
		System.out.printf("Diện tích: %.1f\n", S);
		System.out.printf("Cạnh nhỏ nhất: "+ Math.min(length, width));
		
	}

}
