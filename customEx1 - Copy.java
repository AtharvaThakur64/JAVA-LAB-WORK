package exception2;
0
import java.util.*;

public class customEx1 {

	public static void check(int a) //static function block
	{

		if (a<=0)
		{
			throw new ArithmeticException ("age should not be less than zero or negative"); //throws  exception for negative or zero age

		}

		else 
		{
			System.out.println("your age is "+a);//prints age
		}
	}

	public static void main(String[] args) // main block
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age;
		System.out.println("Enter your age");
		age=sc.nextInt();//input taken
		check(age);//function called
	}

}
