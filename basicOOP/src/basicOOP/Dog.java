/**
 * 
 */
package basicOOP;

/**
 * 
 */
public class Dog extends Animal{
	
	public Dog() {
		super();
		setSound("Bark");
	}
	
	public void digHole() {
		System.out.println("Dug a hole");
	}
	
	public void changeNum(int num) {
		num = num + 2;
		System.out.println(num);
	}
	
}
