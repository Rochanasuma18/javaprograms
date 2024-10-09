package Strings;

public class CompareTo {
	public static void main(String[] args) {
		String s1="Suma";
		String s2="suma";
		
		if(s1.compareTo(s2)==0) {
			System.out.println("Strings are equal");
		}
		
		else {
			System.out.println(s1.compareTo(s2));
			System.out.println("Strings are not equal");
		}
		
		String s3= new String("ram");
		String s4= new String("ram");
		
		if(s3.compareTo(s4)==0) {
			System.out.println("Strings are equal");
		}
		
		else {
			System.out.println(s3.compareTo(s4));
			System.out.println("Strings are not equal");
		}
	  }
}
