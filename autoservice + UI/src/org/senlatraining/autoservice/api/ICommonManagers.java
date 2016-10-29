package org.senlatraining.autoservice.api;

import org.senlatraining.autoservice.entity.*;

public interface ICommonManagers {
	final String SORT_BY_SURNAME = "v List sorted by --> surName!";
	final String SORT_BY_STATUS = "v List sorted by --> status!";
	final String SORT_BY_PRICE = "v List sorted by --> price!";
	final String SORT_BY_DATE_REGISTRATION = "v List sorted by --> date of registration!";
	final String SORT_BY_DATE_COMPLETE = "v List sorted by --> date of complete work!";
	final String SORT_BY_DATE_PLAN_START = "v List sorted by --> date of plan start of work!";
	
	public void saveArray();
}
