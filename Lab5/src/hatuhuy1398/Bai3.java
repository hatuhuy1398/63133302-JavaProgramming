package hatuhuy1398;
import java.util.*;

public class Bai3 {
	static ArrayList<String> dSachSP = new ArrayList<String>();
	
	public static void Nhap(ArrayList<String> dSachSP) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap vao ten cac san pham:");
		String tenSP = scanner.nextLine();
		dSachSP.add(tenSP);
		
	}
	public static void Xuat(ArrayList<String> dSachSP) {
		System.out.println("Danh sach san pham:");
		for(String tenSP: dSachSP) {
			System.out.println(tenSP);
		}
	}
	private static void Menu() {
		System.out.println("****************************************");
		System.out.println("*************Chon chuc nang*************");
		System.out.println("******1.Nhap danh sach ten san pham");
		System.out.println("****3.Sap xep danh sach san pham theo thu tu giam dan*****");
		System.out.println("*****2.Xuat danh sach ten san pham*******");
		System.out.println("*************4.Gia trung binh theo cac loai san pham***************");
		System.out.println("*************5.Xoa ten san pham theo yeeu cau**********************");
		System.out.println("***********6.Thoat chuong trinh*********");
		System.out.println("****************************************");
	}
	public int compare(sanPham o1, sanPham o2) {
		return o1.donGia.compareTo(o2.donGia); }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int choice ;
        do {
        	Menu();
        	
        	System.out.print("Nhap vao lua chon 1->6: ");
        	choice = scanner.nextInt();
           
            switch (choice) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
          
                case 5:
                    System.out.println("Ứng dụng đã thoát.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Hãy chọn lại.");
            }
        }while(choice != 5);
		
		scanner.close();
		
}
	
}

