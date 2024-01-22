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
		sapXepSinhVien(hoTen, diem, n);
		for (int i = 0; i < n; ++i) {
	           
     	   System.out.println("Sinh vien " + (i + 1) + ":");
            System.out.println("Ho ten: " + hoTen[i]);
            System.out.println("Điem: " + diem[i]);
            System.out.println("Hoc luc: " + hocLuc(diem[i]));
            System.out.println();
		}
	}
	static void sapXepSinhVien(String[] hoTen, double[] diem, int n)
	{
		boolean ok;

        for (int i = 0; i < n - 1; ++i) {
            ok = false;

            for (int j = 0; j < n - i - 1; ++j) {
                if (diem[j] > diem[j + 1]) {
                    double temp = diem[j];
                    diem[j] = diem[j + 1];
                    diem[j + 1] = temp;
                    ok = true;
                    
                    String tempString = hoTen[j];
                    hoTen[j] = hoTen[j + 1];
                    hoTen[j + 1] = tempString;
                    ok = true;
                }
            }

          
            if (!ok) {
                break;
            }
        }
	}	private static String hocLuc(double diem) {
        if (diem >= 9.0) {
            return "Xuat Sac";
        } else if (diem >= 7.5) {
            return "Gioi";
        } else if (diem >= 6.5) {
            return "Kha";
        }else if (diem >= 5.0) {
            return "Trung Binh";
        }
        else {
            return "Dot";
        }
    }

}
