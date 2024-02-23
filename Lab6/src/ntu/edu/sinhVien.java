package ntu.edu;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class sinhVien {
	private String hoten;
	private String email;
	private String sdt;
	private String cccd;
	
	
	public sinhVien(String hoten,String email, String sdt, String cccd) {
		super();
		this.hoten=hoten;
		this.email=email;
		this.sdt=sdt;
		this.cccd=cccd;
		
	}
	public sinhVien() {
		super();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<sinhVien> danhSachSv = new ArrayList<sinhVien>();
        
		for (int i = 0; i < 5; i++) {
            System.out.println("Nhap thong tin cua sinh vien " + (i + 1) + ":");
            sinhVien sv = new sinhVien();
            sv.nhap();
            danhSachSv.add(sv);
        }		
		
		for (sinhVien  sv : danhSachSv)
		{
           sv.xuat();
		}
		

	}
	public void nhap() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap hoten: ");
        hoten = scanner.nextLine();

        do {
            System.out.print("Nhap email: ");
            email = scanner.nextLine();

            if (isValidEmail(email)) {
                System.out.println("Email hop le.");
            } else {
                System.out.print("\nEmail khong hop le. Vui long nhap lai!!!! ");
            }
        } while (!isValidEmail(email));
 
        do {
        	System.out.print("Nhap so dien thoai: ");
            sdt = scanner.nextLine();

            if (isValidSdt(sdt)) {
                System.out.println("SDT hop le.");
            } else {
                System.out.print("\nSDT khong hop le. Vui long nhap lai!!!! ");
            }
        } while (!isValidSdt(sdt));
 
        do {
        	System.out.print("Nhap so CCCD/CMT: ");
            cccd = scanner.nextLine();

            if (isValidCccd(cccd)) {
                System.out.println("CCCD hop le.");
            } else {
                System.out.print("\nCCCD khong hop le. Vui long nhap lai!!!! ");
            }
        } while (!isValidCccd(cccd));
 
        
        
        
        System.out.println("");
	}
	private static boolean isValidEmail(String email) {
		// TODO Auto-generated method stub
		String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
	}
	
	private static boolean isValidSdt(String sdt) {
		// TODO Auto-generated method stub
		String regex = "0\\d{9.10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sdt);
        return matcher.matches();
	}
	
	private static boolean isValidCccd(String cccd) {
		// TODO Auto-generated method stub
		String regex = "[0-9]{15}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cccd);
        return matcher.matches();
	}
	
	public void xuat() 
	{
		System.out.println("HoTen: " + this.hoten);
		System.out.println("Email: " + this.email);
		System.out.println("So dien thoai: " + this.sdt);
		System.out.println("So CCCD: " + this.cccd);
		System.out.println("");
	}
	
	public String getTen() {
		return hoten;
	}
	public void setTen() {
		this.hoten=hoten;
		
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail() {
		this.email = email;
		
	}
	
	public String getSdt() {
		return sdt;
	}
	public void setSdt() {
		this.sdt = sdt;
		
	}
	
	public String getCccd() {
		return cccd;
	}
	public void setCccd() {
		this.cccd = cccd;
		
	}

	

}
