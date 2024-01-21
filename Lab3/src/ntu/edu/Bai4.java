package ntu.edu;

import java.util.Scanner;
import java.util.Arrays;


public class Bai4 {
	static int n;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("nhap vao so luong sinh vien: ");
		
		n = scanner.nextInt();
		
		String [] hoTen = new String[n];
		double[] diem = new double[n];
		for (int i = 0; i < n; i++) {
	            scanner.nextLine(); 
	            System.out.print("Nhap ho ten sinh vien thu " + (i + 1) + ": ");
	            hoTen[i] = scanner.nextLine();

	            System.out.print("Nhap diem sinh vien thu " + (i + 1) + ": ");
	            diem[i] = scanner.nextDouble();
	        }
		System.out.print("\nThong tin cua sinh vien:\n");
		for (int i = 0; i < n; ++i) {
           
        	   System.out.println("Sinh vien " + (i + 1) + ":");
               System.out.println("Ho ten: " + hoTen[i]);
               System.out.println("Điem: " + diem[i]);
               System.out.println("Hoc luc: " + hocLuc(diem[i]));
               System.out.println();
        }
		System.out.print("\nThong tin cua sinh vien sau khi sap xep:\n");
		double min = diem[0];
		
		for (int i = 1; i < n+1; ++i) {
			
	           if(min<diem[i]){
	        System.out.println("Sinh vien " + (i + 1) + ":");
            System.out.println("Ho ten: " + hoTen[i-1]);
            System.out.println("Điem: " + diem[i-1]);
            System.out.println("Hoc luc: " + hocLuc(diem[i-1]));
            System.out.println();
            min = diem[i];
   
	        }     
		}
		
	}
	private static String hocLuc(double diem) {
        if (diem >= 8.0) {
            return "Gioi";
        } else if (diem >= 6.5) {
            return "Kha";
        } else if (diem >= 5.0) {
            return "Trung binh";
        } else {
            return "Dot";
        }
    }

}
