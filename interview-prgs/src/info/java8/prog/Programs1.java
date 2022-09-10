package info.java8.prog;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Programs1 {

	public static void main(String[] args) {
		fetch2ndFridayOfNextMonth();
	}
	
	public static void fetchNamesNotFromHyd() {
		Predicate<Employee> p1 = i -> i.getLocation().contentEquals("hyd");
		System.out.println("total emp:"+EmpUtils.getListEmp().toString());
		List<String> namesList = EmpUtils.getListEmp().stream().filter(p1.negate()).map(i -> i.getEname()).collect(Collectors.toList());
		System.out.println("using predicate, names which are not from hyd:"+namesList.toString());
		// using for each
		List<String> namesList1 = new ArrayList<String>();
				EmpUtils.getListEmp().stream().forEach(i -> {
					if(!(i.getLocation().contentEquals("hyd"))) {
						namesList1.add(i.getEname());
					}
				});
		System.out.println("using for each, names which are not from hyd:"+namesList1.toString());
	}
	public static void fetch2ndFridayOfNextMonth() {
		//get the second friday of next month
		//Date date
		LocalDate firstInYear = LocalDate.of(2022, Month.OCTOBER, 31);
		LocalDate secondFriday = firstInYear.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY)).with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
		System.out.println("Second Friday on : " + secondFriday);
	}

}
