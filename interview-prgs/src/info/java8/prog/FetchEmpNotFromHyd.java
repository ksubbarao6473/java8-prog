package info.java8.prog;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FetchEmpNotFromHyd {

	public static void main(String[] args) {
		Predicate<Employee> p1 = i -> i.getLocation().contentEquals("hyd");
		List<String> namesList = EmpUtils.getListEmp().stream().filter(p1.negate()).map(i -> i.getEname()).collect(Collectors.toList());
		System.out.println("names which are not from hyd:"+namesList.toString());
	}

}
