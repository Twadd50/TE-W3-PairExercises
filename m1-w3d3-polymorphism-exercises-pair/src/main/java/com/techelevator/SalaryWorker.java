package com.techelevator;

public class SalaryWorker implements Worker {
	
	private double annualSalary;
	private String firstName;
	private String lastName;
	
	public SalaryWorker(String firstName, String lastName, double annualSalary) {
		this.annualSalary = annualSalary;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
 	
	public double getAnnualSalary() {
		return annualSalary;
	}

	@Override
	public double calculateWeeklyPay(int hoursWorked) {
		return annualSalary / 52.00;
	}
}
