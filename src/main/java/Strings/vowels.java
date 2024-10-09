package Strings;

import java.util.Scanner;

class vowelsCode{
	void countVowelConsonant(String s) {
		int vowel_count=0;
		int consonant_count=0;
		System.out.println("calculating the vowels and consonant count:");
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||
			s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {
				vowel_count++;
			}
			else {
				consonant_count++;
			}
		}
		System.out.println("The vowel count is ="+vowel_count);
		System.out.println("The consonant count is="+consonant_count);
		System.out.println("===============================");
		
	}
	
	void lowerCaseVowels(String s) {
		int lower_vowel_count=0;
		System.out.println("calculating the lower case vowels count:");
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				lower_vowel_count++;
			}
		}
		System.out.println("The lower case vowel count is="+lower_vowel_count);
		System.out.println("===============================");
	}
		
	void upperCaseVowels(String s) {
		int upper_vowel_count=0;
		System.out.println("calculating the upper case vowels count:");
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				upper_vowel_count++;
			}
		}
			System.out.println("The upper case vowel count is="+upper_vowel_count);
			System.out.println("===============================");
}
	
	void replaceAllVowels(String s) {
		String str_temp="";
		System.out.println("Replacing all the vowels with a special character :");
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||
			s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {
				str_temp = str_temp + '@';
	}
			else {
				str_temp = str_temp + s.charAt(i);
			}
		}
			System.out.println("The replaced String is: "+str_temp);
			System.out.println("===============================");
		
	}
		
	void replaceUpperCaseVowels(String s) {
		String str_temp="";
		System.out.println("Replacing all the UpperCase vowels with a special character :");
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {
				str_temp = str_temp + '@';
			}
			else {
				str_temp = str_temp + s.charAt(i);
			}
			}
		System.out.println("The replaced String is: "+str_temp);
		System.out.println("===============================");
	}
	
	void replaceLowerCaseVowels(String s) {
		String str_temp="";
		System.out.println("Replacing all the LowerCase vowels with a special character :");
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				str_temp = str_temp + '@';
			}
			else {
				str_temp = str_temp + s.charAt(i);
			}
			}
		System.out.println("The replaced String is: "+str_temp);
		System.out.println("===============================");
	}
	
	void individualVowels(String s) {
		String str_temp="";
		System.out.println("Replacing individual Vowels with an individual special character:");
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='a'|| s.charAt(i)=='A') {
				str_temp = str_temp + '@';
			}
			else if(s.charAt(i)=='e'|| s.charAt(i)=='E') {
				str_temp = str_temp + '#';
		}
			else if(s.charAt(i)=='i'|| s.charAt(i)=='I') {
				str_temp = str_temp + '&';
			}
			else if(s.charAt(i)=='o'|| s.charAt(i)=='O') {
				str_temp = str_temp + '*';
			}
			else if(s.charAt(i)=='u'|| s.charAt(i)=='U') {
				str_temp = str_temp + '$';
			}
			else {
				str_temp = str_temp + s.charAt(i);
			}
	}
		System.out.println("The replaced String is: "+str_temp);
		System.out.println("===============================");
	}
}	
	
public class vowels {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the String:");
	String s = sc.nextLine();
    vowelsCode vc = new vowelsCode();
    vc.countVowelConsonant(s);
    vc.lowerCaseVowels(s);
    vc.upperCaseVowels(s);
    vc.replaceAllVowels(s);
    vc.replaceUpperCaseVowels(s);
    vc.replaceLowerCaseVowels(s);
    vc.individualVowels(s);
}
}


