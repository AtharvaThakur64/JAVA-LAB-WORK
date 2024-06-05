package exceptionsol;
import java.util.*;//import java util class

public class Solution1 
{

	public static void main(String[] args) 
	{
		int age;
		Scanner sc = new Scanner(System.in);//scanner used for taking input
		try //try block used for identify exception
		{
			System.out.println("Enter age:");
			age = sc.nextInt();// used nextInt for taking only integer as input
			if(age>18) 
			{
				System.out.println("eligible for voting ");//output will be print
			}
			else
			{
				System.out.println("not eligible for voting");
			}
			
		}
		catch(InputMismatchException e)//catches the exceptions
		{
			System.out.println(e);//prints  the exception
		
		}
		
		
		// TODO Auto-generated method stub

	}

}
