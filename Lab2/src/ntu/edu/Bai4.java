package ntu.edu;

import java.util.Scanner;
import java.math.*;
import java.lang.*; 
import java.io.*;

public class Bai4 {
	static double a,b,c;
	static int sodien;
	 // Các hàm thực hiện công việc cho từng chức năng
    private static void PTB1() {
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
    		System.out.printf("Pt co nghiem: %.1f\n",x );
    		
    		}
       
    }

    private static void PTB2() {
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
			System.out.printf("Pt co nghiem: %.4f\n",x );
			
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

    private static void tinhTienDien() {
    	Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Nhập vào sodien: ");
		
		sodien = scanner.nextInt();
		
		int tien =0;
		if(sodien < 50)
		{	
			tien += sodien*1000;
			System.out.printf("Tien dien: %d\n",tien );
		}
		else 
		{
			tien = 50*1000 + (sodien - 50)*1200;
			System.out.printf("Tien dien: %d\n",tien );
		}
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            
            System.out.println("----- Menu -----");
            System.out.println("1. PTB1");
            System.out.println("2. PTB2");
            System.out.println("3. Tính tiendien");
            System.out.println("4. Thoát");

           
            System.out.print("Nhập lựa chọn của bạn (1-4): ");
            choice = scanner.nextInt();

            // Xử lý lựa chọn
            switch (choice) {
                case 1:
                    PTB1();
                    break;
                case 2:
                    PTB2();
                    break;
                case 3:
                    tinhTienDien();
                    break;
                case 4:
                    System.out.println("Ứng dụng đã thoát.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Hãy chọn lại.");
            }
        } while (choice != 4);

        
        scanner.close();
    }

   
}
