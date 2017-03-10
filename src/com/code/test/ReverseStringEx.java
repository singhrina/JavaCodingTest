package com.code.test;

public class ReverseStringEx {

	
	  public void reverse(String str) { // String original = str; String
	  String reverse = ""; 
	  for (int i = str.length() - 1; i >= 0; i--) 
	  { reverse =reverse + str.charAt(i);
	  
	  } 
	  System.out.println(reverse);
	  }
	 

	public void getMaxNo(int a[]) {
		for (int i = 1; i < a.length; i++) {
			int temp = a[0];
			if (temp < a[i]) 
			{
				temp = a[i];

			}
		}
	}

	public static void main(String[] args) {
		ReverseStringEx rs = new ReverseStringEx();
		rs.reverse("rina");
		
    	   int a[]={1,4,7,9,10};
    	   for( int i =1;i<a.length;i++)
    	   ReverseStringEx rs1 = new ReverseStringEx();
		   System.out.println("the max no is :" + rs1.getMaxNo(a));
		

	}

}
