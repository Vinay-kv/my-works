package com.static_non_static_block;

public class bbb 
{
	{
		System.out.println("inside nonstatic block of bbb");
	}
	
	static
	{
		System.out.println("inside static block of bbb");
	}

	public bbb() 
	{
		
		System.out.println("inside constructor of bbb");
		
	}
	


}
