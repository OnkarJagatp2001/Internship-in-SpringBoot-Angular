package AbstractClass;

public class FountainPen extends Pen{
 
	void write()
	{
		System.out.println("Fountain Pen writes Smooth");
	}
	void refill()
	{
		System.out.println("Refill the pen with ink");
	}
	public static void main(String args[])
	{
		FountainPen fp=new FountainPen();
		fp.write();
		fp.refill();
	}
}
