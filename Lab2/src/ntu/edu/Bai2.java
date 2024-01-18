package ntu.edu;

import java.util.Scanner;
import java.math.*;
import java.lang.*; 
import java.io.*;

public class Bai2 {
	static double a,b,c;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Nhập vào a ,b ,c : ");
		
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
		
		
		if(a == 0)
		{
			if(b == 0)
			{
				if(c == 0)
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
				double x = -c/b;
			System.out.printf("Pt co nghiem: %.4f",x );
			
			}
		}
		else
		{
			double delta;
			
			delta = Math.pow(b,2)-4*a*c;
			
			if(delta < 0)
			{
				System.out.printf("PTVN\n");
			}
			else 
			{
				if(delta==0) {
					double x= -b/(2*a);
					System.out.printf("PT co nghiem kep: %.1f \n",x);
				}
				else {
					
					double x1=(-b+Math.sqrt(delta))/(2*a);
					double x2=(-b-Math.sqrt(delta))/(2*a);
					System.out.printf("PT co nghiem x1:  %.1f\n",x1);
					System.out.printf("PT co nghiem x2:  %.1f\n",x2);
				}
			}
			
		}
		
	}

}
