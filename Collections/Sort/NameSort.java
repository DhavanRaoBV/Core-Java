package Sort;

import java.util.Comparator;

public class NameSort implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		System.out.println("Name Comparator");
		return o1.name.compareTo(o2.name);
	}
}
		