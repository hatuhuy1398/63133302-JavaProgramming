package ntu.edu;

import java.util.Scanner;
import java.math.*;
import java.lang.*; 
import java.io.*;

public class Bai3 {
	static int sodien;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Nhập vào sodien: ");
		
		sodien = scanner.nextInt();
		
		int tien =0;
		if(sodien < 50)
		{	
			tien += sodien*1000;
			System.out.printf("Tien dien: %d",tien );
		}
		else 
		{
			tien = 50*1000 + (sodien - 50)*1200;
			System.out.printf("Tien dien: %d",tien );
		}
	}

}