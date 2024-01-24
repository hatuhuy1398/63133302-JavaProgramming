package hatuhuy1398;

import java.util.*;

public class Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<>();
		System.out.println("Nhap vao danh sach so thuc(n or N :exit)! ");
		double sum=0;
		
		while(true) {
			try {
				Double x = scanner.nextDouble();
				list.add(x);
				System.out.print("Nhap them(y/N): ");
				scanner.nextLine();
				String choice =scanner.nextLine();
				
				if(choice.equals("N")||choice.equals("n")){
				break;}
				
			} catch (InputMismatchException e) {
				System.out.println("Error!! Vui long nhap lai!");
				scanner.nextLine();
			}
		}
		System.out.println("Danh sach so thuc da nhap!");
		for(double num:list) {
			System.out.printf("%.1f\t",num);
		}
		
		for(double num:list) {
			sum+=num;
		}
		System.out.printf("\nTong cua day so thuc vua nhap: %.1f",sum);
		
		}
	
}