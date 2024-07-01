import java.util.Scanner;
class Area{
	double Area(double l,double b){       //constructor overloading with return value
		return l*b;
	}
	double Area(double r){
		return  3.14* r *r;
	}
	int Area(int a){
		return a*a;
	}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	Area rec=new Area();
	System.out.println("enter the length and breadth of rectangle:");
	double l=sc.nextDouble();
	double b=sc.nextDouble();
	double rectangleArea=rec.Area(l,b);
	System.out.println("rectangle area:"+rec.Area(l,b));
	System.out.println("enter the radius of circle:");
	double r=sc.nextDouble();
	System.out.println("circle area:"+rec.Area(r));
	System.out.println("enter the side of square:");
	int a=sc.nextInt();
	System.out.println("square area:"+rec.Area(a));
sc.close();
}
}
				