package Com.Array;

interface animal{
	void makesound();
}
class Dog implements animal{
	public void makesound() {
		System.out.println("bow bow");
	}
	public void jump() {
		System.out.println("jump jump");
	}
}
class cat implements animal{
	public void makesound() {
		System.out.println("meow meow");
		
	}
}

public class Demo1 {
	public static void main(String[] args) {
		animal [] arr=new animal[4];
		arr[0]=new Dog();
		arr[1]=new cat();
		arr[2]=new cat();
		arr[3]=new Dog();
		for(animal a:arr) {
			a.makesound();
		}
	}

}
