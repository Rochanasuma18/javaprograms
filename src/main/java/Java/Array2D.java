package Java;

import java.util.Scanner;

public class Array2D {
	public static String arr[][];
	public Scanner sc=new Scanner(System.in);

		public void createArray(int cls, int stu) {
			arr= new String[cls][stu];
		}

		public void insertData(int cls, int stu) {
			System.out.println("Collecting student Name: ");
				for(int j=0;j<cls;j++) {
					System.out.println("Inside the class number:"+(j+1));
					for(int k=0;k<stu;k++) {
						System.out.println("Enter the name of student number:"+(k+1));
						arr[j][k]=sc.next();
					}
				}
		
			System.out.println("Data is loaded");
			System.out.println("-------------------------");
		}
		

		public void displayData(int cls, int stu) {
			System.out.println("Displaying student Name: ");
				for(int j=0;j<cls;j++) {
					System.out.println("Inside the class number:"+(j+1));
					for(int k=0;k<stu;k++) {
						System.out.println("The name of student number-"+(k+1)+" is :"+arr[j][k]);
						
					}
				}
	
	        System.out.println("-------------");
			
		}

	}
