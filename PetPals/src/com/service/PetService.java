package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.iAdoptDao;
import com.dao.iAdoptDaoImpl;
import com.exception.AgeInvalidException;
import com.exception.ResourceNotFoundException;
import com.model.Donation;
import com.model.Pet;

public class PetService {
	iAdoptDao dao=new iAdoptDaoImpl();
	public int insertPets(Pet pet) throws SQLException, AgeInvalidException {
		// TODO Auto-generated method stub
		boolean isageValid=dao.isAgevalid(pet.getAge());
		if (!isageValid) {
			throw new AgeInvalidException("Age should not be negative");
		}
		return dao.insertPets(pet);
	}
	public void updateAvailabilty(int id) throws SQLException, ResourceNotFoundException {
		boolean isPetIdValid=dao.findOne(id);
		if(!isPetIdValid) {
			throw new ResourceNotFoundException("Invalid Pet Id...try again..");
		}
		dao.updateAvailabilty(id);
	}
	public List<Pet> DisplayUnsoldpets() throws SQLException {
		// TODO Auto-generated method stub
		return dao.DisplayUnsoldPets();
	}
	public List<Donation> DisplayallDonations() throws SQLException {
		// TODO Auto-generated method stub
		return dao.DisplayAllDonations();
	}

}
