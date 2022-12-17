package org.system;

public class Desktop extends Computer {

	public int desktopSize() {
		return 14;

	}

	public static void main(String[] args) {
		Computer c=new Computer();
		System.out.println(c.computerModel());
		Desktop d=new Desktop();	
		System.out.println(d.desktopSize());
		
	}

}
