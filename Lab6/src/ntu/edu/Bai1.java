package ntu.edu;
import java.util.*;

public class Bai1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ho va ten: ");
		String hoTen = scanner.nextLine();
		int khoangTrangDT = hoTen.indexOf(' ');
	    int khoangTrangCC = hoTen.lastIndexOf(' ');
	    String ho = hoTen.substring(0, khoangTrangDT).toUpperCase();
        String tenLot = hoTen.substring(khoangTrangDT + 1, khoangTrangCC).toUpperCase();
        String ten = hoTen.substring(khoangTrangCC + 1).toUpperCase();
        
        System.out.println("Ho: " + ho);
        System.out.println("Ten lot: " + tenLot);
        System.out.println("Ten: " + ten);
        
        scanner.close();
		
	}

}
