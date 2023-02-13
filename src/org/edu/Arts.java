package org.edu;

public class Arts extends Education {
	
	public void bsc() {
		System.out.println("BSC");
	}
	public void bEd() {
		System.out.println("bED");
	}
	public void ba() {
		System.out.println("BA");
	}
	public void bba() {
		System.out.println("BBA");
	}
	public void ug(String ug) {
		System.out.println("Arts UG"+ug);
	}	
	public void pg(String pg) {
		System.out.println("Arts PG"+pg);
		
	}
	public static void main(String[] args) {
		Arts A= new Arts();
		A.bsc();
		A.bEd();
		A.ba();
		A.bba();
		A.ug("Arts");
		A.pg("Arts");
		A.ug
		
		
		
		
		
	
	}

}
