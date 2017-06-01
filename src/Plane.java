
public class Plane extends Vehicle{
	public Plane()
	{
		System.out.println("A new plane is created");
	}
	public String start()
	{
		return"The plane starts";
	}
	public String accelerates()
	{
		return "The plane accelerates";
	}
	public String stop()
	{
		return "The plane stops";
	}
	public final String barrelRole()
	{
		return "The plane does a barrel role";
	}
}
