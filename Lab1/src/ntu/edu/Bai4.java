package ntu.edu;

import java.util.Scanner;
import java.math.*;
import java.lang.*; 
import java.io.*;

public class Bai4 {
	static int a,b,c;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Nhập vào a ,b ,c : ");
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		
		double delta;
		
		delta = Math.pow(b,2)-4*a*c;
		if(delta < 0)
		{
			System.out.printf("Delta: %.1f\n", delta);
		}
		else 
		{
		System.out.printf("Delta: %.1f\n", delta);
		System.out.printf("sqrt Delta: "+Math.sqrt(delta));
		}
	}

}
