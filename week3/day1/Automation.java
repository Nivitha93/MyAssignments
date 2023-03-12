package week3.day1;

public class Automation extends MultipleLanguage implements Language,TestTool  {

	public static void main(String[] args) {
		Automation auto=new Automation();
		auto.selenium();
		auto.java();
		auto.ruby();
		auto.python();

		

	}

	public void selenium() {
		
		System.out.println("Selenium is Automation frame work");
	}

	public void java() {
	
	System.out.println("Java is mother language for Selenium");	
		
	}

	
	public void ruby() {
		System.out.println("Ruby Supports Selinium");
		
	}

}
