package com.techelevator;

import java.text.DecimalFormat;
import java.util.Random;

public class MainWorkers {

	public static void main(String[] args) {
		
		SalaryWorker mickey = new SalaryWorker("Mickey", "Mouse", 60000.00);
		SalaryWorker goofy = new SalaryWorker("Goofy", "Geef", 40000.00);
		HourlyWorker daisy = new HourlyWorker("Daisy", "Duck", 15.00);
		VolunteerWorker minnie = new VolunteerWorker("Minnie", "Mouse");	
		
		

		
		Worker[] employees = new Worker[] { mickey, goofy, daisy, minnie };
		
		int totalHours = 0;
		double totalPay = 0.0;
		DecimalFormat formater = new DecimalFormat("#.##");
		
		System.out.println("Employee  \t\t" + "Hours Worked \t\t" + "Pay");
		for(Worker employee : employees) {
			String name = employee.getLastName() + ", " + employee.getFirstName();
			Random rnd = new Random();
			int hours = rnd.nextInt(101);
			double pay = employee.calculateWeeklyPay(hours);
			totalHours += hours;
			totalPay += pay;
			System.out.println(name + "\t\t" + hours + "\t\t\t$" + formater.format(pay));
		}
		
		System.out.println();
		System.out.println("Total Hours: " + totalHours);
		System.out.println("Total Pay: $" + formater.format(totalPay));

	}

}
