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
		
		
		Animal doggy = new Dog();
		Animal kitty = new Cat();
		
		System.out.println("Doggy says: "+doggy.getSound());
		System.out.println("Kitty says: "+kitty.getSound());
		
		Animal[] animals = new Animal[4];
		animals[0] = doggy;
		animals[1] = kitty;
		
		System.out.println("Doggy says: "+animals[0].getSound());
		System.out.println("Kitty says: "+animals[1].getSound());
		
		speakAnimal(doggy);
		
		((Dog)doggy).digHole();
		
		//fido.bePrivate();
		fido.accessPrivate();
		
		//Abstract Class Demo
		Giraffe giraffe = new Giraffe();
		giraffe.setName("Frank");
		System.out.println(giraffe.getName());
		
	}
	
	public static void changeObjectName(Dog dog) {
		dog.setName("Marcus");
	}
	
	public static void speakAnimal(Animal randAnimal) {
		System.out.println("Animal says: "+randAnimal.getSound());
	}

}
