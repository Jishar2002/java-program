class CPU
{
	int price=10000;
	class processor
	{
		int cores=4;
		String man="Pentium";
	}
	void proc()
	{
		CPU.processor pc=new CPU.processor();
		System.out.println("Processor:-\ncores="+pc.cores			+"\nManufacturer="+pc.man);
	}
	static class RAM
	{
		static int memory=14;
		static String man="Intel";
	}
	public static void main(String args[])
	{
		CPU cp=new CPU();
		CPU.RAM rm=new CPU.RAM();
		System.out.println("CPU:-\nPrice="+cp.price);
		cp.proc();
		System.out.println("RAM:-\nmemory="+rm.memory+"\nManufacturer="+rm.man);
	}
}