package ntu.edu;

import java.util.Scanner;
import java.math.*;
import java.lang.*; 
import java.io.*;

public class Bai1 {
	static double a,b;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Nhập vào a ,b: ");
		
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		
		if(a == 0)
		{
			if(b == 0)
			{
				System.out.printf("PTVSN\n");
			}
			else
			{
				System.out.printf("PTVN\n");
			}
		}
		else 
		{
			double x = -b/a;
		System.out.printf("Pt co nghiem: %.1f",x );
		
		}
	}

}