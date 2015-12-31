package com.mypcr;

import com.mypcr.emulator.MyPCR;

public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		MyPCR mypcr = new MyPCR();
		
		System.out.println(mypcr.add(5, 2));
		System.out.println(mypcr.sub(5, 2));
		System.out.println(mypcr.mul(5, 2));
		System.out.println(mypcr.div(2, 0));
	}

}
