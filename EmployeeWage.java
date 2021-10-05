package com.Day8EmployeeWage;

import java.util.Random;

public class EmployeeWage {
	int wagePerHours = 20;
	int dailyHours = 8;
	int dailyWage;
	int partTimeHours = 4;
	int partTimeWage;
	int empHour;
	int monthlyWage;
	int daysPerMonth = 20;

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

	public void employeePartTimeWage() {

		partTimeWage = wagePerHours * partTimeHours;

		System.out.println("Employee Part Time Wage :" + partTimeWage);
	}

	public void bySwitchCase() {
		Random ran = new Random();
		int empCheck = ran.nextInt(3);
		// System.out.println("Random Integers: " + empCheck);
		switch (empCheck) {
		case 1:
			empHour = 8;
			System.out.print("Present");
			break;
		case 2:
			empHour = 4;
			System.out.print("Part time");
			break;
		case 0:
			empHour = 0;
			System.out.println("Absent");
			break;
		}
		System.out.println();
	}

	public void monthlyWage() {
		monthlyWage = dailyWage * daysPerMonth;
		System.out.println("Monthly Wage Of Employee is =" + monthlyWage);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		EmployeeWage obj = new EmployeeWage(); // Create Object
		obj.employeeAttdence();
		obj.dailyWage();
		obj.employeePartTimeWage();
		obj.bySwitchCase();
		obj.monthlyWage();

	}

}
