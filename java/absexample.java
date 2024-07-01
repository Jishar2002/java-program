import java.util.*;

abstract class Shapes{
	abstract void area();
	
}
class rectangle extends Shapes{
	double l,b;
	rectangle(double l,double b){
		this.l=l;
		this.b=b;
	}
	void area(){
		System.out.println("area of rectangle is:"+l*b);
	}
}
class circle extends Shapes{
	double r;
	circle(double r){
		this.r=r;
	}
	void area(){
		System.out.println("area of circle is:"+3.14*r*r);
	}
}
class square extends Shapes{
	double a;
	square(double a){
		this.a=a;
	}
	void area(){
		System.out.println("area of square is:"+a*a);
	}
}
class absexample{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length and width of rectangle:");
	double l=sc.nextDouble();
	double b=sc.nextDouble();
	Shapes rectangle=new rectangle(l,b);
	rectangle.area();
	
	System.out.println("enter the radius of circle:");
	double r=sc.nextDouble();
	Shapes circle=new circle(r);
	
	circle.area();
	
	System.out.println("enter the side of square:");	
	double a=sc.nextDouble();
	Shapes square=new square(a);
	square.area();
}
}
	 
	