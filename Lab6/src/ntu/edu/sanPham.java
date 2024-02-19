package ntu.edu;

import java.util.*;

public class sanPham {
	private String tenSp;
	private double donGia;
	private String hang;
	
	public sanPham(String tenSp, double donGia, String hang) {
		super();
		this.tenSp = tenSp;
		this.donGia = donGia;
		this.hang = hang;
	}


	public static void main(String[] args) {
		ArrayList<sanPham> danhSachSp = new ArrayList<sanPham>();
        
		for (int i = 0; i < 5; i++) {
            System.out.println("Nhap thong tin cua tung san pham " + (i + 1) + ":");
            sanPham sp = new sanPham();
            sp.nhap();
            danhSachSp.add(sp);
        }		
		
		for (sanPham sp : danhSachSp)
		{
            if (sp.getHang().equalsIgnoreCase("Nokia"))
			{
				sp.xuat();
			}
		}
		
	}

	 public void nhap() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhap ten san pham: ");
	        tenSp = scanner.nextLine();

	        System.out.print("Nhap gia san pham: ");
	        donGia = scanner.nextDouble();
	        scanner.nextLine();

	        System.out.print("Nhap hang san pham: ");
	        hang = scanner.nextLine();
	        
	        System.out.println("");
	 }
	
	public void xuat() 
	{
		System.out.println("Ten: " + this.tenSp);
		System.out.println("Gia: " + this.donGia);
		System.out.println("Hang: " + this.hang);
		System.out.println("");
	}
	

	public sanPham() {
		super();
	}

	public String getTenSp() {
		return tenSp;
	}


	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}


	public double getDonGia() {
		return donGia;
	}


	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}


	public String getHang() {
		return hang;
	}


	public void setHang(String hang) {
		this.hang = hang;
	}


}