package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.model.Donation;
import com.model.Pet;

public interface iAdoptDao {
	 int insertPets(Pet pet) throws SQLException;
	 boolean findOne(int id) throws SQLException;
	 void updateAvailabilty(int id) throws SQLException;
	 List<Pet> DisplayUnsoldPets() throws SQLException;
	 boolean isAgevalid(int age);
	 List<Donation> DisplayAllDonations() throws SQLException;
}
