package week3.day1;

public class AxisBank extends BankInfo {
    
	public void deposit(int b) {
		
		
	     System.out.println("deposit is "+b);
	}
	public static void main(String[] args) {
		AxisBank obj=new AxisBank();
		obj.savings();
		obj.fixed();
		obj.deposit(1400);

	}

}
