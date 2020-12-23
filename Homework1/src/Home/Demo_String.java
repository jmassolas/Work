package Home;

public class Demo_String {
	public static void main(String[]args) {
		double[]yourlist = {2.5,3.8,9.6,1.2,3.6,4.1,3.18,2.9,9.17};
	double[] mylist = new double[10];
	mylist[0]=5.6;
	mylist[1] = 7.9;
	mylist[2]= 7.9;
	mylist[3] = 7.9;
	mylist[4] = 7.9;
	mylist[5] = 7.9;
	mylist[6] = 7.9;
	mylist[7] = 7.9;
	mylist[8] = 7.9;
	mylist[9] = 7.9;
for(int i = 0; i <mylist.length; i++) {
	System.out.println(i+":" +"this mylist  is the length:"+ mylist.length);
	System.out.println(mylist[7]);
	System.out.println(i+":" +"this yourlist is the length:"+ yourlist.length);
	System.out.println(yourlist[7]);
}
}
}
