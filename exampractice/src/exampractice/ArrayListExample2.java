package exampractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListExample2 {
	public static void main(String[] args) {

		List<Employee> mk = new ArrayList<Employee>();
		Employee e1 = new Employee();
		e1.setEmpId(1);
		e1.setEmpName("Murari");
		e1.setSalary(30000);
		
		Employee e2 = new Employee();
		e2.setEmpId(2);
		e2.setEmpName("Manmohan");
		e2.setSalary(40000);
		
		Employee e3 = new Employee();
		e3.setEmpId(3);
		e3.setEmpName("Bhavesh");
		e3.setSalary(35000);
		
		Employee e4 = new Employee();
		e4.setEmpId(4);
		e4.setEmpName("Bhavesh");
		e4.setSalary(38000);
		
		mk.add(e1);
		mk.add(e2);
		mk.add(e3);
		mk.add(e4);
		System.out.println(mk);
		
		// employee have salary more the 40k then increase salary by 10% 
		for(Employee e : mk) {
			if(e.getSalary() >= 40000) {
				e.setSalary(e.getSalary() + ((e.getSalary()*10)/100));
			}
		}

		//  sort on the basis on the basis of name asce order, 
		//if name is same then sort on the basis of salary desc order
//		List<Employee> snk = mk.parallelStream()
//				.sorted((o1,o2)->{
//					int res = o1.getEmpName().compareTo(o2.getEmpName());
//					if( res == 0) {
//						return o2.getSalary() - o1.getSalary();
//					}else {
//						return res;
//					}
//				})
//				.collect(Collectors.toList());
		
	//  sort on the basis on the basis of name asce order, 
			//if name is same then sort on the basis of salary asc order
		List<Employee> snk = mk.parallelStream()
				.sorted((o1,o2)->{
					int res = o2.getEmpName().compareTo(o1.getEmpName());
					if( res == 0) {
						return o2.getSalary() - o1.getSalary();
					}else {
						return res;
					}
				})
				.collect(Collectors.toList());
		System.out.println(snk);
	}

}
