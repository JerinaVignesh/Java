package org.edu;

public class Medicine {

	public void physiyo() {
		System.out.println("Pysiyo");
	}
	public void dental() {
		System.out.println("Dental");
	}
	public void mbbs() {
		System.out.println("MBBS");
	}
	public static void main(String[] args) {
		Medicine M = new Medicine();
		M.physiyo();
		M.dental();
		M.mbbs();
		
	}
}
