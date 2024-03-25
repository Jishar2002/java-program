import java.util.*;
class searchelement
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no of elemets in an array:");
	int num=sc.nextInt();
	int array[]=new int[6];
	System.out.println("enter the elemets in an array:");
	for(int i=0;i<num;i++)
	{
		array[i]=sc.nextInt();
	}
	System.out.println("enter the elemets to search :");
	int key=sc.nextInt();
	int flag=0,time=0;
	for(int i=0;i<num;i++)
	{
		if(array[i]==key)
		{
			flag=1;
			System.out.println("Found at"+(i+1)+"th position");
		}
	}
	if(flag==0)
	{
		System.out.println("key not found");
	}
	}
}
