package com.innerclass;

class OuterClass
{
	private static int a=10;
	private String name="Java";
	
	static class StaticInner
	{
		static int b=20;
		private String lang="Python";
		
		void show()
		{
			System.out.println(a);
			//System.out.println(name);
		}
		
	}
}

public class StaticInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
