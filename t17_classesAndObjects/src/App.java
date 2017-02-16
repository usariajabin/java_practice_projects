
class person{
	String name;
	int age;
	
	//Classes contain data and subroutines(methods)
	
	void speak(){
		for(int i=0; i<3; i++){
			System.out.println("My name is "+ name+ "and my age is "+ age+ "years old.");
		}
	}
	void sayHello(){
		System.out.println("Hello there!");
	}

	
}

public class App {

	public static void main(String[] args) {
		
		person person1= new person();
		person1.name= "Jhon Doe";
		person1.age= 12;
		person1.speak();
		
		person person2= new person();
		person2.name= "Sarah Smith";
		person2.age= 99;
		person2.sayHello();
		
		
		System.out.println(person1.name);
		System.out.println(person2.age);

	}

}
