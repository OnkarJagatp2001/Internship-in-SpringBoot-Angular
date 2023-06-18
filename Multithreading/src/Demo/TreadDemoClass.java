package Demo;

public class TreadDemoClass extends Thread{

	Thread t;
	TreadDemoClass()
	{
		t = new Thread();
		t.start();
		System.out.println("Child Thread");
	}
	
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println("Child " + i);
		}
	}
	
	public static void main(String args[])
	{
		System.out.println("Main");
		TreadDemoClass t1 = new TreadDemoClass();
//		t1.run();
		for(int i=0;i<10;i++)
		{
			t1.run();
			System.out.println("Main " + i*i );
		}
		
		
	}
}
