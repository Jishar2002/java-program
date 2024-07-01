import java.util.Scanner;
interface shape{
	void area();
	void perimeter();
}
class circle implements shape{
	double r;
	 public circle(double r){
		this.r=r;
	}
	 public void area(){
		System.out.println("area of circle:"+3.14*r*r);
	}
	 public void perimeter(){
		System.out.println("perimeter of circle:"+2*3.14*r);
	}
}
class rectangle implements shape{
	double l,b;
	 public rectangle(double l,double b)
	{
		this.l=l;
		this.b=b;
	}
	 public void area(){
		System.out.println("area of rectangle:"+l*b);
	}
	public void perimeter(){
		System.out.println("perimeter of rectangle:"+2*(l+b));
	}
}
public class main2{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	shape Shape=null;
	while(true){
		System.out.println("menu:");
		System.out.println("1.circle");
		System.out.println("2.rectangle");
		System.out.println("3.exit");
		System.out.println("choose an option:");
		
		int choice=sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("enter the radius of circle:");
					double r=sc.nextDouble();
					Shape =new circle(r);
					break;
				case 2:
					System.out.println("enter the length and breadth of rectangle:");
					double l=sc.nextDouble();
					double b=sc.nextDouble();
					Shape =new rectangle(l,b);
					break;
				case 3:
					System.out.println("exiting...");
					System.exit(0);
						default:
					System.out.println("invalid choice");
					continue;
					}
					Shape.area();
					Shape.perimeter();
					
		}
	}


}