package org.edu;

public class Engineering extends Medicine{
	
	public void be() {
		System.out.println("BE");
	}
	public void btech() {
		System.out.println("BTech");
	}
	public static void main(String[] args) {
		Engineering E = new Engineering();
		E.be();
		E.btech();
		E.physiyo();
		E.dental();
		E.mbbs();
		
		
	}

}
