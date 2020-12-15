package demo1;

public class Fibomaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int m=10;
int p= 0;
int n=1;
for (int i=1; i<=m; i++)
{
	System.out.println(p+"");
	int sum=p+n;
	p=n;
	n=sum;
	//System.out.println(m);
}
}
}