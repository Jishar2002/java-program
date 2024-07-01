import java.util.*;

class Shape{
	void area(){
		System.out.println("this is the area method of the shape class");
}
}
class rectangle extends Shape{
	double l,b;
	 rectangle(double l,double b){
		this.l=l;
		this.b=b;
	}
	 void area(){
		System.out.println("area of rectangle:"+l*b);
	}
}
class circle extends Shape{
	double r;
	 circle(double r){
		this.r=r;
	}
	 void area(){
		System.out.println("area of circle:"+3.14*r*r);
	}
}
class square extends Shape{
	double a;
	square(double a){
		this.a=a;
	}
	void area(){
		System.out.println("area of square is:"+a*a);
	}
}
class moverriding{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length and width of rectangle:");
	double l=sc.nextDouble();
	double b=sc.nextDouble();
	Shape rectangle=new rectangle(l,b);
	rectangle.area();
	System.out.println("enter the radius of circle:");
	double r=sc.nextDouble();
	Shape circle=new circle(r);
	circle.area();
	System.out.println("enter the side of square:");	
	double a=sc.nextDouble();
	Shape square=new square(a);
	square.area();
}
}
	
