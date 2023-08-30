import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		ArrayList <State> List = new ArrayList<>();
		State s1= new State("Erode",638152);
		State s2=new State("Salem",632514);
		State s3=new State("Cbe",635241);
		State s4=new State("Madurai",663254);
		
		ArrayList <State> List1 = new ArrayList<>();
		State s5= new State("Pune",638254);
		State s6=new State("Mumbai",932514);
		State s7=new State("Nagpur",635241);
		State s8=new State("Nashik",562354);
		
		
		List.add(s1);
		List.add(s2);
		List.add(s3);
		List.add(s4);
		
		List1.add(s5);
		List1.add(s6);
		List1.add(s7);
		List1.add(s8);
		
		HashMap<String ,ArrayList <State> > List2 =new HashMap<>();
		List2.put("Tamil Nadu", List1);
		List2.put("Maharastra", List1);
		
		TreeMap<String,HashMap<String ,ArrayList <State> >> List3 =new TreeMap<>();
		List3.put("India", List2);
		
		System.out.println(List3);
		
		
		
	}
	 

}
