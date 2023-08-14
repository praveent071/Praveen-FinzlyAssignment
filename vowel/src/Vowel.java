
import java.util.Scanner;
import java.util.LinkedList;
public class Vowel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		StringBuilder d = new StringBuilder();
		char[] chars = a.toCharArray();
		boolean repeated;
		for(int i=0;i<chars.length;i++) {
			repeated = false;
			for(int j=i+1;j<chars.length;j++) {
				if(chars[i] == chars[j] ) {
					repeated = true;
					break;
				}
			}
			if(!repeated) {
				d.append(chars[i]);
			}
		}
		d.toString();
		System.out.println(d);
		
		int b = 0;
		for (int i=0;i<d.length();i++) {
			if(d.charAt(i)=='a'||d.charAt(i)=='e'||d.charAt(i)=='i'||d.charAt(i)=='u'||d.charAt(i)=='o') {
				b++;
				
			}
		}
		if(b==5) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}

}
