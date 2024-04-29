import java.util.*;
class publisher
{
	String pub_name;
}
class book extends publisher
{
	String book_name;
	String author;
	float price;
}
class literature extends book
{
	Scanner sc2=new Scanner(System.in);
	
	
	void read2()
	{
		System.out.println("enter the book details");
		System.out.println("enter publication name:");
		pub_name=sc2.next();
		System.out.println("enter the book name:");
		book_name=sc2.next();
		System.out.println("enter author:");
		author=sc2.next();
		System.out.println("enter the book price:");
		price=sc2.nextFloat();
	}
	void display1()
	{
		System.out.println("literature book details");
		System.out.println("publication name:"+pub_name);
		System.out.println("book name:"+book_name);
		System.out.println("author:"+author);
		System.out.println("book price:"+price);
	}
	
}
class fiction extends book
{
	Scanner sc=new Scanner(System.in);
	
	void read()
	{
		System.out.println("enter the book details");
		System.out.println("enter publication name:");
		pub_name=sc.next();
		System.out.println("enter the book name:");
		book_name=sc.next();
		System.out.println("enter author:");
		author=sc.next();
		System.out.println("enter the book price:");
		price=sc.nextFloat();
	}
	void display2()
	{
		System.out.println("fiction book details");
		System.out.println("publication name:"+pub_name);
		System.out.println("book name:"+book_name);
		System.out.println("author:"+author);
		System.out.println("book price:"+price);
	}
	public static void main(String args[])
	{
		literature lit=new literature();
		fiction fic=new fiction();
		fic.read();
		lit.read2();
		fic.display2();
		lit.display1();
	}
}


	
	
	
	
	
	
	
	
	
	
	
	
