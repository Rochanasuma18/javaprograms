package Strings;

class Dog{
	private String name;
	private int age;
	private String color;
	private int cost;
	private String breed;
	
	//Generic setter
	void setData(String a, int b, String c, int d, String e) {
		name=a;
		age=b;
		color=c;
		cost=d;
		breed=e;
	}
	
	//Generic getter
	void getData() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(breed);
	}
}
public class Encapsulation {
public static void main(String[] args) {
	Dog d1= new Dog();
	d1.setData("Snoofy", 5, "black", 4000, "GR");
	d1.getData();
}
}
