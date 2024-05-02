
package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import com.model.Policy;
import com.service.PolicyService;

public class ClientController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PolicyService policyService = new PolicyService();

		while (true) {
			System.out.println("Press 1. Display All policies");
			System.out.println("Press 0. Logut");

			int input = sc.nextInt();

			if (input == 0) {
				System.out.println("Logging out.....");
				break;
			}

			switch (input) {

			case 1:
				try {
					List<Policy> policy = policyService.findAll();
					for (Policy p : policy) {
						System.out.println(p);
					}
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				break;

			default:
				System.out.println("Enter valid input");
			}

		}
	}

	public static void ClientMenu() {
		String[] args = { "" };
		main(args);
	}

}
