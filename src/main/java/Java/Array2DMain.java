package Java;

import java.util.Scanner;

public class Array2DMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Array2D ao = new Array2D();
	
		System.out.println("Enter the class Count:");
		int cls=sc.nextInt();
		System.out.println("Enter the Student Count In a class:");
		int stu = sc.nextInt();
		ao.createArray(cls,stu);
		ao.insertData(cls,stu);
		ao.displayData(cls,stu);
	}
}	
	
