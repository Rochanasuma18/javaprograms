package Java;

import java.util.Scanner;

public class Array3D {
public static String arr[][][];
public Scanner sc=new Scanner(System.in);

	public void createArray(int scl, int cls, int stu) {
		arr= new String[scl][cls][stu];
	}

	public void insertData(int scl,int cls, int stu) {
		System.out.println("Collecting student Age: ");
		for(int i=0;i<scl;i++) {
			System.out.println("Inside the Schools:"+(i+1));
			for(int j=0;j<cls;j++) {
				System.out.println("Inside the class number:"+(j+1));
				for(int k=0;k<stu;k++) {
					System.out.println("Enter the name of student number:"+(k+1));
					arr[i][j][k]=sc.next();
				}
			}
		}
		System.out.println("Data is loaded");
		System.out.println("-------------------------");
	}
	

	public void displayData(int scl,int cls, int stu) {
		System.out.println("Displaying student Age: ");
		for(int i=0;i<scl;i++) {
			System.out.println("Inside the Schools:"+(i+1));
			for(int j=0;j<cls;j++) {
				System.out.println("Inside the class number:"+(j+1));
				for(int k=0;k<stu;k++) {
					System.out.println("The name of student number-:"+(k+1)+"is"+arr[i][j][k]);
					
				}
			}
		}
        System.out.println("-------------");
		
	}


}
