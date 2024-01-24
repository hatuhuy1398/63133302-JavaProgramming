package hatuhuy1398;
import java.util.*;


public class Bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> listName = new ArrayList<>();
	   
        while(true) {
        	Menu();
        	System.out.print("Nhap vao lua chon 1->6: ");
            int choice = scanner.nextInt();
           
            scanner.nextLine();
           
            switch (choice) {
                case 1:
                    Nhap(listName, scanner);;
                    break;
                case 2:
                    Xuat(listName);
                    break;
                case 3:
                    sapXep(listName);
                    break;
                case 4:
                    ngauNhien(listName);
                    break;
                case 5:
                	xoa(listName,scanner);
                	break;
                case 6:
                    System.out.println("Ứng dụng đã thoát.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Hãy chọn lại.");
            }
        }
		
		
	}
	 static void Menu() {
		System.out.println("****************************************");
		System.out.println("*************Chon chuc nang***********");
		System.out.println("*************1.Nhap*********************");
		System.out.println("*************3.Sap xep******************");
		System.out.println("*************2.Xuat*********************");
		System.out.println("*************4.Ngau nhien***************");
		System.out.println("*************5.Xoa**********************");
		System.out.println("***********6.Thoat chuong trinh*********");
		System.out.println("****************************************");
	}
	 static void Nhap(ArrayList<String> listName, Scanner scanner) {
	
            System.out.print("Nhap vao ho ten: ");
            String hoTen = scanner.nextLine();
            listName.add(hoTen);
            
	}
	static void Xuat(ArrayList<String> listName) {
		
        System.out.print("\nDanh sach vao ho ten: \n");
        for(String hoTen:listName) {
        	System.out.printf("%s\n",hoTen);
        }
        
	}
	static void sapXep(ArrayList<String> listName) {
		Collections.sort(listName);
		Collections.reverse(listName);
		 System.out.print("\nDanh sach vao ho ten sap xep: \n");
		for(String hoTen:listName) {
			
        	System.out.println(hoTen);
        }
	}
	static void ngauNhien(ArrayList<String> listName) {
		Collections.shuffle(listName);
		 System.out.print("\nDanh sach vao ho ten ngau nhien: \n");
		for(String hoTen:listName) {
        	System.out.printf("\n%s\n",hoTen);
        }
	}
	static void xoa(ArrayList<String> listName, Scanner scanner) {
		System.out.print("Nhap vao ten can xoa: ");
        String hoTenCanXoa = scanner.nextLine();
        boolean found = false;

        for (String hoTen : listName ) {
            if (hoTen.equals(hoTenCanXoa)) {
                listName.remove(hoTen);
                found = true;
                System.out.println("xoa thanh cong");
                break;
            }
        }

        if (found) {
            System.out.println("Khong tim thay ten can xoa trong danh sach!!");
        }
	}

}
