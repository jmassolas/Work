package eggrole1;

public class GenericMethod {

	public static void main(String[] args) {
		Integer[] integers = {1,2,3,4,5};
		String[] strings = {"london","paris","Beirut","mexico","Otawa"};
		//GenericMethod.<Integer>print(integers);
		print(integers);
		GenericMethod.<String>print(strings);
		
	}
	public static <E> void print(E[] list) {
	for(int i=0; i< list.length; i++)
System.out.println(list[i]+ "");
	System.out.println();
}
}
