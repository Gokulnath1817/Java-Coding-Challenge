package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.exception.AgeInvalidException;
import com.exception.ResourceNotFoundException;
import com.model.Donation;
import com.model.Pet;
import com.service.PetService;

public class PetController {
	public static void main(String[] args) {
		PetService petService = new PetService();

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Press 1. Add Pet Details ");
			System.out.println("Press 2. Update Sold Pets ");
			System.out.println("Press 3. Display available pets ");
			System.out.println("Press 4.View All Donations");
		
			System.out.println("Press 0. to Exit");
			int input = sc.nextInt();
			if (input == 0) {
				System.out.println("Exiting Petpals..");
				break;
			}
			switch (input) {
			case 1:
				Pet pet = new Pet();
				sc.nextLine();
				System.out.println("Enter name");
				pet.setName(sc.nextLine());
				System.out.println("enter age");
				pet.setAge(sc.nextInt());
				System.out.println("enter breed");
				sc.nextLine();
				pet.setBreed(sc.nextLine());

				try {
					int status = petService.insertPets(pet);
					if (status == 1)
						System.out.println("Pet record added to DB..");
					else
						System.out.println("Insert operation failed..");

				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				catch (AgeInvalidException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				System.out.println("Enter the id of the pet you want to update as Sold:");

				try {
					petService.updateAvailabilty(sc.nextInt());
					System.out.println("Pet sold successfully..");
				} catch (ResourceNotFoundException e) {
					System.out.println(e.getMessage());
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}

				break;
			case 3:

				try {
					List<Pet> petlist = petService.DisplayUnsoldpets();
					for (Pet p : petlist) {
						System.out.println(p);
					}
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			case 4:

				try {
					List<Donation> donationlist = petService.DisplayallDonations();
					for (Donation d : donationlist) {
						System.out.println(d);
					}
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
