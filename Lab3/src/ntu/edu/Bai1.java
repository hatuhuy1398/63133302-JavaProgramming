package ntu.edu;

import java.util.Scanner;

public class Bai1 {
	static int N;

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
			System.out.print("Nhập vào so can kiem tra: ");
			
			N = scanner.nextInt();
			
			boolean ok = true;
			for(int i=2; i < N-1; ++i)
			{
				if(N % i == 0){
					ok = false;
					break; }
			++i;
			}
			if(ok == false){
				System.out.println("Khong phai la so nguyen to!");
			}
			else
			{
				System.out.printf("N = %d la so nguyen to!", N);
			}
		
	}

}
