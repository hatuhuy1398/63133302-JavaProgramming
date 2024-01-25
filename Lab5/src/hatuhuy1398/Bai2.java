package hatuhuy1398;


import java.util.*;


public class Bai2 {
	
	private static void Menu() {
		System.out.println("****************************************");
		System.out.println("*************Chon chuc nang*************");
		System.out.println("*************1.Nhap*********************");
		System.out.println("*************3.Sap xep******************");
		System.out.println("*************2.Xuat*********************");
		System.out.println("*************4.Ngau nhien***************");
		System.out.println("*************5.Xoa**********************");
		System.out.println("***********6.Thoat chuong trinh*********");
		System.out.println("****************************************");
	}
	private static void Nhap(ArrayList<String> listName) {
		Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap vao ho ten: ");
            String hoTen = scanner.nextLine();
            listName.add(hoTen);
            
	}
	private static void Xuat(ArrayList<String> listName) {
		
        System.out.print("\nDanh sach ho ten: \n");
        for(String hoTen:listName) {
        	System.out.printf("%s\n",hoTen);
        }
        
	}
	private static void sapXep(ArrayList<String> listName) {
		Collections.sort(listName);
		Collections.reverse(listName);
		 System.out.print("\nDanh sach ho ten da sap xep: \n");
		for(String hoTen:listName) {
			
        	System.out.printf("%s",hoTen);
        }
	}
	private static void ngauNhien(ArrayList<String> listName) {
		Collections.shuffle(listName);
		 System.out.print("\nDanh sach vao ho ten ngau nhien: \n");
		for(String hoTen:listName) {
        	System.out.printf("\n%s\n",hoTen);
        }
	}
	private static void xoa(ArrayList<String> listName) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao ten can xoa: ");
	    String hoTenCanXoa = scanner.nextLine();
	    Iterator<String> iterator = listName.iterator();
	    boolean found = false;

	    while (iterator.hasNext()) {
	        String hoTen = iterator.next();
	        if (hoTen.equals(hoTenCanXoa)) {
	            iterator.remove();
	            found = true;
	            System.out.println("Xoa thanh cong");
	            break;
	        }
	    }

	    if (!found) {
	        System.out.println("Khong tim thay ten can xoa trong danh sach!!");
	    }
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> listName = new ArrayList<String>();
		int choice ;
        do {
        	Menu();
        	
        	System.out.print("Nhap vao lua chon 1->6: ");
        	choice = scanner.nextInt();
           
            switch (choice) {
                case 1:
                    Nhap(listName);
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
                	xoa(listName);
                	break;
                case 6:
                    System.out.println("Ứng dụng đã thoát.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Hãy chọn lại.");
            }
        }while(choice != 6);
		
		
	}

}
