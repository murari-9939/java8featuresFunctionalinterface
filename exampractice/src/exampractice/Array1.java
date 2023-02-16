package exampractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Array1 {
	public static void main(String[] args) {
		
		List<String>mk= new ArrayList<String>();
	mk.add("murari");
	mk.add("bhavesh");
	mk.add("manmohan");
//	System.out.println(mk);
	for(String str:mk) {}
	System.out.println(mk);
	
	List<String> snk = mk.stream().sorted()
	.collect(Collectors.toList());
	System.out.println(snk);
	}

}
