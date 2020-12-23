package eggrole1;

public class GenericDemo {

	public static void main(String[] args) {
		GenericStack<String> stack1 =new GenericStack<>();
		stack1.push("London");
		stack1.push("Paris");
		stack1.push("Casa Blanca");
		System.out.println("City are:"+ stack1);
		
		GenericStack<Integer> stack2 =new GenericStack<>();
		stack2.push(1);
		stack2.push(2);
		stack2.push(21);
		System.out.println( stack2);
		
	}

}
