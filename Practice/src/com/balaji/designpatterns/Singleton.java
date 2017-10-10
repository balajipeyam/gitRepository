package com.balaji.designpatterns;

public class Singleton {
	private String x = "string";
	private static String s = "static";
	private final String f = "final";
	private static final String sf = "static final";
	

	private Singleton() {
		x="string changed";
		s="static changed";
	}
	
	private static Singleton object=new Singleton();
	
	public static Singleton getInstance()
	{
		return object;
	}
	
//	public static Singleton getInstance()
//	{
//		if(object==null)
//		{
//			object=new Singleton();
//		}
//		return object;
//	}
	
}
