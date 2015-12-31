package com.mypcr.emulator;

public class MyPCR
{
	public MyPCR()
	{
		
	}
	
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public int sub(int a, int b)
	{
		return a-b;
	}
	
	public int mul(int a, int b)
	{
		return a*b;
	}
	
	public int div(int a, int b)
	{
		return (b==0) ? 0 : a/b;
	}
}
