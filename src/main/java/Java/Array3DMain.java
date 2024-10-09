package Java;

import java.util.Scanner;

public class Array3DMain {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Array3D ao = new Array3D();
	System.out.println("Enter the School number:");
	int scl=sc.nextInt();
	System.out.println("Enter the class Count:");
	int cls=sc.nextInt();
	System.out.println("Enter the Student Count In a class:");
	int stu = sc.nextInt();
	ao.createArray(scl,cls,stu);
	ao.insertData(scl,cls,stu);
	ao.displayData(scl,cls,stu);
}
}
