package week1.day2;

public class Palindrome {

	public static void main(String[] args) {

		
	  int num=34343,temp,sum=0,rem;
 	    
      temp=num;
                for(;num>0;num/=10){
                 rem=num%10;
                 sum=(sum*10)+rem;
                }
      if(sum==temp) {
      System.out.println(temp+" is a palindrome number ");
      }
      else {
      System.out.println(temp+" is not a palindrome number ");
      }


	}

}
