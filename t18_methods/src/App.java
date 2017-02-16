
class person{
	String name;
	int age;
	
	void speak(){
		System.out.println("My name is "+ name);
	}	
	int yearsToRetirement() {
		int yearsleft= 65-age;
		
		return yearsleft;
	}
	int getAge(){
		return age;
	}
	String getName(){
		return name;
	}
}

public class App {

	public static void main(String[] args) {
		
		person person1= new person();
		
		person1.name= "Joe";
		person1.age= 25;
		
		person1.speak();	//puts it as a comment in the tutorial for making the first line not print
		
		int years= person1.yearsToRetirement();
		System.out.println("Years till retirement: "+years);
		
		String name= person1.getName();
		int age= person1.getAge();
		
		System.out.println("Name is: "+ name);
		System.out.println("Age is: "+ age);
		
	}

}
