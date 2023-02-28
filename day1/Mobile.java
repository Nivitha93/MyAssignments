package week1.day1;

public class Mobile {
	public void makeCall() {
		String mobileModel="Sy2023";
		float mobileWeight = 260.5f;
		System.out.println("Mobile model is ");
	System.out.println(mobileModel);
		System.out.println("Mobile weight is");
		System.out.println(mobileWeight);
		
		
	}
	public void sendMsg() {
boolean fullCharged =true;
int mobileCost=8000;
System.out.println("Is it fully charged?");
System.out.println(fullCharged);

System.out.println("Cost of the mobile is");
System.out.println(mobileCost);
	}

	public static void main(String[] args) {
		Mobile obj=new Mobile();
		System.out.println("This is my mobile");
obj.makeCall();
obj.sendMsg();
	}

}
