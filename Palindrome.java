
public class Palindrome {

	public static void main(String[] args) {


		int n=363;int rev=0,org=n;
		while(n!=0) {
		 	rev=rev*10+n%10;
			
			n=n/10;
		}//ex: 343=343;345=!543(is not palindrome)
if(org==rev) {
	System.out.println("the number is palidrome:"+org);
}else {
	System.out.println("the number is not palindrome:"+org);
}
	}
}


