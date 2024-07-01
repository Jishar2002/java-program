import java.util.*;

class publisher{
	String pub_name;
	publisher(String pub_name)
	{
		this.pub_name=pub_name;
	}
}
class book extends publisher{
	String bname,author;
	float price;
	book(String pub_name,String bname,String author,float price)
	{
		super(pub_name);
		this.bname=bname;
		this.author=author;
		this.price=price;
	}
}
class literature extends book{
	literature(String pub_name,String bname,String author,float price){
		super(pub_name,bname,author,price);
	}

	void display()
	{
		System.out.println("literature details");	
		System.out.println("publisher name:"+pub_name);
		System.out.println("book name:"+bname);
		System.out.println("book author:"+author);
		System.out.println("book price:"+price);
}
}
class fiction extends book{
	fiction(String pub_name,String bname,String author,float price){
	super(pub_name,bname,author,price);
	}
	void display2(){
		System.out.println("fiction details");	
		System.out.println("publisher name:"+pub_name);
		System.out.println("book name:"+bname);
		System.out.println("book author:"+author);
		System.out.println("book price:"+price);
		
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);


		System.out.println("enter the literature details:");
		System.out.println("enter the publisher name:");
		String pub_name=sc.next();
		System.out.println("enter book name:");
		String bname=sc.next();
		System.out.println("enter author name:");
		String author=sc.next();
		System.out.println("enter book price:");
		float price=sc.nextFloat();
		literature lite=new literature(pub_name,bname,author,price);
		lite.display();
		
		System.out.println("enter the fiction details:");
		System.out.println("enter the publisher name:");
		String pu_name=sc.next();
		System.out.println("enter book name:");
		String name=sc.next();
		System.out.println("enter author name:");
		String bauthor=sc.next();
		System.out.println("enter book price:");
		float  bprice=sc.nextFloat();
		fiction fict=new fiction(pu_name,name,bauthor,bprice);
		fict.display2();
		
		
	}
}
