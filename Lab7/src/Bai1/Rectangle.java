package Bai1;
import java.util.*;

public class Rectangle {
	protected double length;
	protected double width;
	
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}


	public Rectangle() {
		super();
	}

	
	public void outPut()
	{
		System.out.println("Rectangle");
		System.out.println("Length: " + length +", Width: "+ width);
		System.out.println("Perimeter: " + this.getPeri() +"cm, Area "+ this.getArea()+" cm^2");
		System.out.println();
	}
	
	public void inPut()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Length: ");
		do {
            System.out.print(": ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Please enter a number.");
                System.out.print("length>0: ");
                scanner.next(); 
            }
            length = scanner.nextDouble();

            if (length <= 0) {
                System.out.println("The length must be a positive number. Please re-enter.");
            }
        } while (length <= 0);
		
		do {
            System.out.print("Width: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Please enter a number.");
                System.out.print("Nhập độ dài (phải là số dương): ");
                scanner.next(); 
            }
            width = scanner.nextDouble();

            if (width <= 0) {
                System.out.println("The length must be a positive number. Please re-enter.");
            }
        } while (width <= 0);
	}
	
	public double getPeri()
	{
		return (length+width)*2;
	}
	
	
	public double getArea()
	{
		return length*width;
	}
	

	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}

}
