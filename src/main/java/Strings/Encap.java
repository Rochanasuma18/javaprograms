package Strings;

class Dog1{
	private String name;
	private int age;
	private String color;
	private int cost;
	private String breed;

//specific Setter
void setName(String a) {
	name=a;
}

void setAge(int b) {
	age=b;
}

void setColor(String c) {
	color=c;
}

void setCost(int d) {
	cost=d;
}

void setBreed(String e) {
	breed=e;
}

//Specific Getter
String getName() {
	return name;
}

int getAge() {
	return age;
}

String getColor() {
	return color;
}

int getCost() {
	return cost;
}

String getBreed() {
	return breed;
}
}
public class Encap {
public static void main(String[] args) {
	Dog1 d1= new Dog1();
	d1.setName("Shofi");
	d1.setAge(2);
	d1.setColor("White");
	d1.setCost(5000);
	d1.setBreed("Pomerian");
	
	System.out.println(d1.getName());
	System.out.println(d1.getAge());
	System.out.println(d1.getColor());
	System.out.println(d1.getCost());
	System.out.println(d1.getBreed());
}
}
