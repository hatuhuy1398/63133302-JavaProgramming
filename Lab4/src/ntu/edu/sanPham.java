package ntu.edu;

import java.util.*;

public class sanPham {
	
	private String tenSp;
	private double donGia;
	private double giamGia;
	
    public sanPham() 
    {
        this("iphone12",48,2);
    }
	
    public sanPham(String tenSp, double donGia)
    { 
    	this(tenSp, donGia, 0);
    } 
    
    public sanPham(String tenSp, double donGia, double giamGia) 
    {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
	
	private double getThueNhapKhau()
	{
        return 0.1 * donGia;
	}
	public void xuat() {
        System.out.printf("Ten san pham: %s\n",tenSp);
        System.out.printf("Đon gia: %.2f\n",donGia);
        System.out.printf("Giam gia: %.2f\n",giamGia);
        System.out.printf("Thue nhap khau: %.2f\n", getThueNhapKhau());
        System.out.println("-----------------------------------");
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten san pham: ");
        tenSp = scanner.nextLine();

        System.out.print("Nhap don gia: ");
        donGia = scanner.nextDouble();

        System.out.print("Nhap giam gia: ");
        giamGia = scanner.nextDouble();

       
        scanner.nextLine();
        scanner.close();
    }
	
	
	public static void main(String[] args) {
        
        sanPham sp1 = new sanPham("Laptop", 1000, 100);
        sp1.xuat();

        sanPham sp2 = new sanPham();
        sp2.nhap();
        sp2.xuat();

	}

	
	public String getTenSp()
	{ 
		return this.tenSp; 
	} 
	public double getDonGia()
	{ 
		return this.donGia; 
	} 
	public double getGiamGia()
	{ 
		return this.giamGia; 
	} 
	
	public void setTenSp(String tenSp)
	{ 
		this.tenSp = tenSp; 
	} 
	public void setDonGia(double donGia)
	{ 
		this.donGia = donGia; 
	}
	public void setGiamGia(double giamGia)
	{ 
		this.giamGia = giamGia; 
	}

}