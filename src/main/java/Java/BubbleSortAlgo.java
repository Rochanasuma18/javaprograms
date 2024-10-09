package Java;

import java.util.Scanner;

class BubbleSort{
        int arr[];
        int size;
        Scanner sc =new Scanner(System.in);
        
	public void createArray() {
		System.out.println("Enter the array size:");
		size= sc.nextInt();
		arr= new int[size];
		System.out.println("Array is created...........");
		System.out.println("===============================");
	}

	public void addElement() {
		System.out.println("Collecting Array Data");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array is created");
		System.out.println("===============================");
	}
	
	public void displayData() {
		System.out.println("The elements inside Array are:");
		   for(int i=0;i<size;i++) {
			   System.out.println(arr[i]+" ");
		   }
	}
	
	public void sort() {
		System.out.println("Sorting process initiated....");
		 int temp=0;
		 for(int i=0;i<size;i++) {
			 for(int j=i+1;j<size;j++) {
				 if(arr[i]>arr[j]) {
					 temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
					 
				 }
			 }
		 }
	}
	
	
}
public class BubbleSortAlgo {
public static void main(String[] args) {
	BubbleSort bs= new BubbleSort();
	bs.createArray();
	bs.addElement();
	bs.sort();
	bs.displayData();
	
  }
}
