import java.util.*;

class Employee{
	int empID;
	String eName;
	float salary;
	String address;
	Employee(int emp_ID,String e_Name,float sal,String addrs)
	{
		this.empID=emp_ID;
		this.eName=e_Name;
		this.salary=sal;
		this.address=addrs;
	}
}
class Teacher extends Employee{
	String department;
	String subject;
	Teacher(int empID,String eName,float salary,String address,String depmt,String sub)
	{
		super(empID,eName,salary,address);
		this.department=depmt;
		this.subject=sub;
	}
	public void display(){
			Scanner sc=new Scanner(System.in);
			System.out.println("employee id:"+empID);
			System.out.println("name:"+eName);
			System.out.println("salary:"+salary);
			System.out.println("address:"+address);
			System.out.println("department:"+department);
			System.out.println("subject:"+subject);
		}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of teacher:");
		int n=sc.nextInt();
		Teacher tobj[]=new Teacher[n];   //array of object creation
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the employee id:");
			int empID=sc.nextInt();
			System.out.println("enter the employee name:");
			String eName=sc.next();
			System.out.println("enter the salary of employee:");
			float salary=sc.nextFloat();
			System.out.println("enter the address of employee:");
			String address=sc.next();
			System.out.println("enter the department of teacher:");
			String depmt=sc.next();
			System.out.println("enter the subject:");
			String sub=sc.next();
			
			tobj[i]=new Teacher(empID,eName,salary,address,depmt,sub);
		}
		System.out.println("details of employee ");
		for(int i=0;i<n;i++)
		{
			tobj[i].display();
		}
	}
}