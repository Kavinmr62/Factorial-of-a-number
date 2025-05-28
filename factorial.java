import java.util.*;
public class factorial
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=1;
		for(int i=1;i<=n;i++){
		    p*=i;
		}
		String s=Integer.toString(p);
		for(int i=0;i<s.length();i++){
		    System.out.print(s.charAt(i)+" ");
		}
	}
}
