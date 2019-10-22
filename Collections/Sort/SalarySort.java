package Sort;

import java.util.Comparator;

public class SalarySort implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		System.out.println("Salary Comparator");
		if (o1.salary < o2.salary)
			return -1;
		else if (o1.salary > o2.salary)
			return 1;
		return 0;
	}

}