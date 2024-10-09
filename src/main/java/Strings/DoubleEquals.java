package Strings;

public class DoubleEquals {
public static void main(String[] args) {
	String s1="Suma";
	String s2="Suma";
	
	if(s1==s2) {
		System.out.println("Address are equal");
	}
	
	else {
		System.out.println("Address are not equal");
	}
	
	String s3= new String("ram");
	String s4= new String("ram");
	
	if(s3==s4) {
		System.out.println("Address are equal");
	}
	
	else {
		System.out.println("Address are not equal");
	}
  }
}
