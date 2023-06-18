package InheritancePrograms;

public class Car extends Vehicle{
	void drive()
	{
		System.out.print("Drive Car");
	}
	public static void main(String []args)
	{
		//Vehicle v=new Vehicle();
		Car c= new Car();
		//v.drive();
		c.drive();
	}
}
