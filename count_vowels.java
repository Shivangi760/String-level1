import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String s = sc.nextLine();
	    s=s.trim();
	    int result = 0;
	    for(int i=1;i<s.length();i++)
	    { char ch = Character.toLowerCase(s.charAt(i));
	        if(ch=='a' || ch=='e' || ch=='i'  || ch=='o'|| ch=='u')
	        result ++;
	    }

	    System.out.println(result);
	}
}
