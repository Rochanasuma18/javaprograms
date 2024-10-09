package Strings;
class Dog3{
	private String name;
	private int age;
	private String color;
	private int cost;
	private String breed;
	
	//generic setter
		void setData(String name , int age , String color , int cost , String breed) {
		this.name= name;
		this.age= age;
		this.color= color;
		this.cost= cost;
		this.breed= breed;
	}
	
	
//specific Setter
void setName(String name) {
	this.name=name;
}

void setAge(int age) {
	this.age=age;
}

void setColor(String color) {
	this.color=color;
}

void setCost(int cost) {
	this.cost=cost;
}

void setBreed(String breed) {
	this.breed=breed;
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

//Generic getter
	void getData() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(breed);
	}
}
public class shadowSolution {
	public static void main(String[] args) {
		Dog3 d2= new Dog3();
		d2.setData("Snoofy", 5, "black", 4000, "GR");
		d2.getData();
		Dog3 d1 = new Dog3();
		d1.setName("Shofi");
		d1.setAge(2);
		d1.setColor("White");
		d1.setCost(5000);
		d1.setBreed("Pomerian");
		System.out.println("================");
		System.out.println(d1.getName());
		System.out.println(d1.getAge());
		System.out.println(d1.getColor());
		System.out.println(d1.getCost());
		System.out.println(d1.getBreed());
	}
}
