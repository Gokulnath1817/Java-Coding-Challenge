package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Donation;
import com.model.Pet;

import com.utility.DBConnection;

public class iAdoptDaoImpl implements iAdoptDao {

	@Override
	public int insertPets(Pet pet) throws SQLException {
		Connection con = DBConnection.dbConnect();
		String sql = "INSERT INTO Pet (name,age,breed) VALUES (?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, pet.getName());
		pstmt.setInt(2, pet.getAge());
		pstmt.setString(3, pet.getBreed());
		int status = pstmt.executeUpdate();
		DBConnection.dbClose();
		return status;

	}

	@Override
	public boolean findOne(int id) throws SQLException {
		Connection con = DBConnection.dbConnect();
		String sql = "select pet_id from pet where pet_id=?";
		PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(sql);
		pstmt.setInt(1, id);
		ResultSet rst = pstmt.executeQuery();
		boolean status = rst.next();
		DBConnection.dbClose();
		return status;
	}

	@Override
	public void updateAvailabilty(int id) throws SQLException {
		Connection con = DBConnection.dbConnect();
		String sql = "update pet set isavailable='sold' where pet_id=?";
		PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(sql);
		pstmt.setInt(1, id);
		pstmt.executeUpdate();
		DBConnection.dbClose();
	}

	@Override
	public List<Pet> DisplayUnsoldPets() throws SQLException {
		Connection con = DBConnection.dbConnect();
		String sql = "select * from pet where isavailable ='not sold'";
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rst = pstmt.executeQuery();
		List<Pet> list = new ArrayList<>();
		while (rst.next() == true) {
			int id = rst.getInt("pet_id");
			String name = rst.getString("name");
			int age = rst.getInt("age");
			String breed  = rst.getString("breed");
			String Availability=rst.getString("isavailable");
			Pet pet = new Pet(id, name, age, breed, Availability);
			list.add(pet);
		}
		DBConnection.dbClose();
		return list;
	}

	@Override
	public boolean isAgevalid(int age) {
		
		return age>=0;
	}

	@Override
	public List<Donation> DisplayAllDonations() throws SQLException {
		Connection con = DBConnection.dbConnect();
		String sql = "select * from Donation";
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rst = pstmt.executeQuery();
		List<Donation> list = new ArrayList<>();
		while (rst.next() == true) {
			int id = rst.getInt("donation_id");
			String name = rst.getString("donor_name");
			double amount = rst.getInt("amount");
			Donation donation = new Donation(id, name, amount);
			list.add(donation);
		}
		DBConnection.dbClose();
		return list;
	}

}
