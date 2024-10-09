package Strings;

import java.util.Scanner;

public class Anagram {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the word-1:");
	String s1 = sc.next();
	System.out.println("Enter tye word-2:");
	String s2= sc.next();
	
	if(s1.length()==s2.length()) {
		//Creating an Array for word-1 & 2 
		char arr1[]= new char[s1.length()];
		char arr2[]= new char[s2.length()];
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i]=s1.charAt(i);
			arr2[i]=s2.charAt(i);
		}
		//sorting the array
		arr1= sortArray(arr1);
		arr2= sortArray(arr2);
		
		//checking the equality of the arrays
		for(int i=0;i<arr1.length;i++) {
			if (arr1[i]!=arr2[i]) {
				System.out.println("The given Strings are not anagrams");
				System.exit(0);
			}
		}
		System.out.println("The given Strings are anagrams");
	}
	else {
		System.out.println("The given strings are not anagrams");
	}
 }

private static char[] sortArray(char[] arr) {
	char temp;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
		}
	}
	return arr;
}
}
