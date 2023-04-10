package com.enumdemo;

class ConstantDays
{
	static final String SUNDAY="SUNDAY";
	static final String MONDAY="MONDAY";
	static final String TUESDAY="TUESDAY";
	static final String WENESDAY="WEDNESDAY";
	static final String THURSDAY="THURSDAY";
	static final String FRIDAY="FRIDAY";
	static final String SATURDAY="SATURDAY";
}
public class EnumDemo1 {
	
	 enum Days{SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY};

	public static void main(String[] args) {
		
		Days d1=new Day;
		Days d2=new Days.FRIDAY;
		
		if(d1.equals(d2))
		{
			System.out.println("Equal");
		}


		

	}

}
