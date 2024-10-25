package inheritence;

class college
{
	void get()
	{
		System.out.println("college name is ABC");
	}
	
	void show()
	{
		System.out.println("College is govt aprooved");
	}
}

class stud extends college
{
	void staff()
	{
		System.out.println("36");
	}
}

public class Single 
{

	public static void main(String[] args) 
	{

		stud s= new stud();
		s.get();
		s.show();
		s.staff();
		
	}

}
