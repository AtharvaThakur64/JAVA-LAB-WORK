package com.Example;

public class ExceptionDemo2 {
	public static void main(String[]args)
	{
		try 
		{
			int a[]= new int[5]; //initialised array
			a[5]=50/5;
			int c=23/0;
		}
		catch(ArithmeticException e)// catches exception of arithmetic exception
		{
			System.out.println(e);
			System.out.println("you can not divide by zero");
		}
		catch (ArrayIndexOutOfBoundsException o)//catches the array exception
		{
			System.out.println(o);
		
		}
	}

}
