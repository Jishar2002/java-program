import java.util.*;
class Person{
	String pname,address,gender;
	int age;
	Person(String p_name,String adres,String gendr,int _age_)
	{
		this.pname=p_name;
		this.address=adres;
		this.gender=gendr;
		this.age=_age_;
	}
}
class Employee extends Person{
	int empID;
	String cp_name;
	float salary;
	String qualification;
	Employee(String pname,String address,String gender,int age,int emp_ID,String cp_Name,float sal,String quali)
	{
		super(pname,address,gender,age);
		this.empID=emp_ID;
		this.cp_name=cp_Name;
		this.salary=sal;
		this.qualification=quali;
	}
}
class Teacher_2 extends Employee{
	int teacher_id;
	String department;
	String subject;
	Teacher_2(String pname,String address,String gender,int age,int emp_ID,String cp_Name,float sal,String quali,int tid,String depmt,String sub)
	{
		super(pname,address,gender,age,emp_ID,cp_Name,sal,quali);
		this.teacher_id=tid;
		this.department=depmt;
		this.subject=sub;
	}
	public void display(){
			Scanner sc=new Scanner(System.in);
			System.out.println("person name:"+pname);
			System.out.println("address:"+address);
			System.out.println("gender:"+gender);
			System.out.println("age:"+age);
			System.out.println("employee id:"+empID);
			System.out.println("company name:"+cp_name);
			System.out.println("salary:"+salary);
			System.out.println("qualification:"+qualification);
			System.out.println("t id:"+teacher_id);
			System.out.println("department:"+department);
			System.out.println("subject:"+subject);
		}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of teacher:");
		int n=sc.nextInt();
		Teacher_2 tobj[]=new Teacher_2[n];   //array of object creation
		for(int i=0;i<n;i++)
		{	
			System.out.println("enter the person name:");
			String p_name=sc.next();
			System.out.println("enter the address:");
			String adres=sc.next();
			System.out.println("enter gender:");
			String gendr=sc.next();
			System.out.println("enter age:");
			int _age_=sc.nextInt();
			System.out.println("enter the employee id:");
			int emp_ID=sc.nextInt();
			System.out.println("enter the  company name:");
			String cp_Name=sc.next();
			System.out.println("enter the salary of employee:");
			float sal=sc.nextFloat();
			System.out.println("enter the qualification of employee:");
			String quali=sc.next();
			System.out.println("teacher id:");
			int tid=sc.nextInt();
			System.out.println("enter the department of teacher:");
			String depmt=sc.next();
			System.out.println("enter the subject:");
			String sub=sc.next();
			
			tobj[i]=new Teacher_2(p_name,adres,gendr,_age_,emp_ID,cp_Name,sal,quali,tid,depmt,sub);
		}
		System.out.println("details of employee ");
		for(int i=0;i<n;i++)
		{
			tobj[i].display();
		}
	}
}