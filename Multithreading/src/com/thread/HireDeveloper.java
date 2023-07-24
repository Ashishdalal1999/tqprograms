package com.thread;


import java.util.Scanner;

public class HireDeveloper {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the developer you want to hire(java/python/fullstack)");
			String dtype = sc.next();
			GetDeveloperType gd = new GetDeveloperType();
			Developer d = gd.getDeveloper(dtype);
			if (d == null) {
				System.out.println("No such developer");
			} else {
				d.salaryPaid();
				d.skills();
				Developer.workingHours();

			}
			sc.close();
		}

	}


