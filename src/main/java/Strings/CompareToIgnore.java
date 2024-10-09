package Strings;

public class CompareToIgnore {
	public static void main(String[] args) {
		String s1="Suma";
		String s2="suma";
		
		if(s1.compareToIgnoreCase(s2)==0) {
			System.out.println("Srtings are equal");
		}
		
		else {
			System.out.println(s1.compareTo(s2));
			System.out.println("Strings are not equal");
		}
		
		String s3= new String("ram");
		String s4= new String("ram");
		
		if(s3.compareToIgnoreCase(s4)==0) {
			System.out.println("Strings are equal");
		}
		
		else {
			System.out.println(s3.compareTo(s4));
			System.out.println("Strings are not equal");
		}
	  }
}
