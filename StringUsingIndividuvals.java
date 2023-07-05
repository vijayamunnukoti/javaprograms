import java.util.Scanner;

public class StringUsingIndividuvals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String n,rev;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number ");
n=sc.next();//individuval number
for(int i=0;i<=n.length()-1;i++) {
	System.out.println(n.charAt(i));
}//reverse of digits using string
StringBuilder sb=new StringBuilder(n);
System.out.println(sb.reverse());
	


/* with out using funs
for(int i=0;i<=n.length()-1;i++){
	rev=rev+n.charAt(i);
	System.out.println(rev);
}*/}}