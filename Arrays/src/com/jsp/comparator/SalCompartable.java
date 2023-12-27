package com.jsp.comparator;

import java.util.Comparator;

public class SalCompartable implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		return ((Employee)o2).sal-((Employee)o1).sal;
	}

	


}
