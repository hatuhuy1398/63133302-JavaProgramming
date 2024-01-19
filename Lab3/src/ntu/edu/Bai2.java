package ntu.edu;

import java.util.Scanner;

public class Bai2 {
	static int N;

	public static void main(String[] args) 
	{
//		Scanner scanner = new Scanner(System.in);
//		
//		
//		System.out.print("Nhập vào N: ");
//		
//		N = scanner.nextInt();
//		
//		for(int i=1; i<=10;++i)
//		{
//			System.out.printf("%d x %d = %d", N, i, N*i);
//			System.out.println();
//		}
		for(int i =1;i<10;++i) 
			for(int j =1;j<=10;++j) {
				System.out.printf("%d x %d = %d", i, j, i*j);
				System.out.println();
			}
		
	}

}
