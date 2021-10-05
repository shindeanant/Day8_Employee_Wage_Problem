package com.Day8EmployeeWage;

public class EmployeeWage {
	int wagePerHours = 20;
	int dailyHours = 8;
	int dailyWage;

	public void employeeAttdence() {
		int empCheck = (int) (Math.random() * 10) % 2;
		System.out.println(empCheck);

		if (empCheck == 1) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}
	}

	public void dailyWage() {
		dailyWage = wagePerHours * dailyHours;

		System.out.println("Employee Daily wage = " + dailyWage);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		EmployeeWage obj = new EmployeeWage();
		obj.employeeAttdence();
		obj.dailyWage();

	}

}
