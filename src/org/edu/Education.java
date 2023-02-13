package org.edu;

public class Education {
	
	public void ug(String EDU) {
		System.out.println("Education UG"+EDU);
	}
	public void pg(String EDU) {
		System.out.println("Education PG"+EDU);
	}
	public static void main(String[] args) {
		Education E = new Education();
		E.ug("EDU");
		E.pg("EDU");
		
		
		
	}

}
