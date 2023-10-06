package basicOOP;

public class WorkWithAnimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog fido = new Dog();
		
		fido.setName("Fido");
		System.out.println(fido.getName());
		
		fido.digHole();
		
		fido.setWeight(-1);
		
		int num = 10;
		
		System.out.println("Number before modification in function "+num);
		fido.changeNum(num);
		System.out.println("Number after modification in function "+num);
		
		System.out.println("Name before modification in function "+fido.getName());
		changeObjectName(fido);
		System.out.println("Name after modification in function "+fido.getName());
		///Though it seems like objects are pass by value, in java everything is pass by value only
	}
	
	public static void changeObjectName(Dog dog) {
		dog.setName("Marcus");
	}

}
