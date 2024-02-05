import java.util.Scanner;
class student
{
	int a;
	int b;
	void display()
	{
		System.out.println("sum of "+a+ " and " +b+ " is " +(a+b));
	}
}
class test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  no 1:" );
		int s=sc.nextInt();
		System.out.println("enter  no 2:" );
		int s2=sc.nextInt();
		student obj1=new student();
		obj1.a=s;
		obj1.b=s2;
		obj1.display();
		
		
	}
}
