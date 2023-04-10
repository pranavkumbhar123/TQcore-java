package com.sort2;

public class Courses {

	private int cID;
	private String cName;
	
	public Courses()
	{
		
	}

	public Courses(int cID, String cName) {
		super();
		this.cID = cID;
		this.cName = cName;
	}

	public int getcID() {
		return cID;
	}

	public void setcID(int cID) {
		this.cID = cID;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	@Override
	public String toString() {
		return "Courses [cID=" + cID + ", cName=" + cName + "]";
	}
	
}
