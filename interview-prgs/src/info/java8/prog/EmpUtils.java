package info.java8.prog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpUtils {
	
	public List<Employee> getListEmp(){
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1,"subbu", "bpp"));
		list.add(new Employee(2,"raj", "hyd"));
		list.add(new Employee(3,"mahesh", "pune"));
		list.add(new Employee(4,"prasanth", "trivendrum"));
		return list;
	}
	
	public Map<String, Employee> getMapEmp(){
		Map<String, Employee> map = new HashMap<String, Employee>();
		map.put("subbu", new Employee(1,"subbu", "bpp"));
		map.put("raj", new Employee(2,"raj", "hyd"));
		map.put("mahesh", new Employee(3,"mahesh", "pune"));
		map.put("prasanth", new Employee(4,"prasanth", "trivendrum"));
		return map;
	}

}
