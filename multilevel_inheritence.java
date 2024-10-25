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

class exam extends stud
{
	void seatno()
	{
		System.out.println("Seat number is : 100");
	}
	
	void sub()
	{
		System.out.println("English");
	}
}

public class Single 
{

	public static void main(String[] args) 
	{

		exam s= new exam();
		s.get();
		s.show();
		s.staff();
		s.seatno();
		s.sub();
		
	}

}
