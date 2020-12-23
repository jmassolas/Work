package Home;
import java.util.Scanner;
public class String_Demo2 {
	public static void main(String[] args) {
	int size;
	double total=0;
	double Max;
	char[]city = {'D','l','l','a','s'};
	//double mylist[] = new double[size];
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the size of your array:");
size = input.nextInt();
double mylist[] = new double[size];
Max= mylist[0];
for (int i =0; i<mylist.length;i++) {
	mylist[i]=Math.random()*10;
	total= total+mylist[i]; 
	if(mylist[i]>Max)
	{
		Max =mylist[i];
		//System.out.print("The max is:"+Max);
	}
	else
		System.out.println("That the Max" +Max);
	System.out.println("the values are: "+mylist[i] );
	 
}
System.out.print("The max is:"+Max);
System.out.println("This is my total:"+total);
System.out.println(city);
}
}
