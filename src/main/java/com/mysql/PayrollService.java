package com.mysql;

import java.util.ArrayList;
import java.util.List;

public class PayrollService {
	
	@Override
	public String toString() {
		return "PayrollService [payroll=" + payroll + "]";
	}

	private List<PayrollDetail> payroll;
	
	public PayrollService() {
		
	}
	
    public PayrollService(List<PayrollDetail> list) {
		this.payroll = new ArrayList<PayrollDetail>(list);
	}

	public int countEntries() {
		return  payroll.size();
	}

	public void addRecordToPayroll(PayrollDetail payrolldata) {
		payroll.add(payrolldata);
		
	}
   
}