package com.static_non_static_block;

public class aaa extends bbb
{
	{
		System.out.println("inside nonstatic block of aaa");
	}
	
	static
	{
		System.out.println("inside static block of aaa");
	}

	public aaa() 
	{
		super();
		System.out.println("inside constructor of aaa");
		
		
	}
	
	

}
