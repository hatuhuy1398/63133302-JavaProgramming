package ntu.edu;

import java.util.Scanner;
import java.util.Arrays;

public class Bai3 {
	static int n;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("nhap vao so luong phan tu cua mang: ");
		
		n = scanner.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Nhap cac phan tu cua mang:");
		
        for (int i = 0; i < n; ++i) {
        	
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Mang da sap xep: "+ Arrays.toString(arr));
        
        int min = arr[0];
        for (int i = 1; i < n; ++i) {
        	
        	min = Math.min(min, arr[i]);
            
        	
        }
        System.out.printf("Phan tu nho nhat mang la: %d\n", min);
        int Sum = 0;
        int count = 0;
        for (int i = 0; i < n; ++i) {
        	
        	if(arr[i]%3==0) {
        		Sum+=arr[i];
        		++count;
        	}
        }
        double average = (count > 0) ? (double) Sum / count : 0;
        System.out.println("Trung binh cong cac phan tu chia het cho 3: " + average);

        scanner.close();

	}

}
