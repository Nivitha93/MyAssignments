package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("32 inch desktop");
	}
	
	public static void main(String[] args) {
		Desktop obj=new Desktop();
		obj.computerModel();
		obj.desktopSize();

	}

	

}
