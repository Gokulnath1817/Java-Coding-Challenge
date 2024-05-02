package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.exception.PolicyNotFoundException;
import com.model.Policy;
import com.utility.DBConnection;

public class PolicyDaoImpl implements PolicyDao{

	@Override
	public List<Policy> findAll() throws SQLException {

		
			Connection con = DBConnection.dbConnect();
			String sql = "SELECT * from policy";
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rst = pstmt.executeQuery();
			List<Policy> list = new ArrayList<>();
			while(rst.next()) {
				int id = rst.getInt("id");
				String Name = rst.getString("name");
				double premium = rst.getDouble("premium");
				int Interestrate = rst.getInt("rate_of_interest");
				Policy policy = new Policy(id, Name, premium,Interestrate );
				list.add(policy);
			}
			
			DBConnection.dbClose();
			return list;
		
	}

	@Override
	public int AddPolicy(Policy policy) throws SQLException {
		Connection con = DBConnection.dbConnect();
		String sql = "INSERT INTO policy(name, premium, rate_of_interest) VALUES(?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, policy.getName());
		pstmt.setDouble(2, policy.getPremium());
		pstmt.setFloat(3, (float) policy.getRateOfInterest());
		
		int status = pstmt.executeUpdate();
	
		DBConnection.dbClose();		
		return status;
	}

	@Override
	public Policy DisplayPolicyById(int id) throws SQLException, PolicyNotFoundException {
		Connection con = DBConnection.dbConnect();
		String sql = "SELECT * from policy where id=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, id);
		ResultSet rst = pstmt.executeQuery();
		while(rst.next()) {
			int policyid = rst.getInt("id");
			String name = rst.getString("name");
			double premium = rst.getDouble("premium");
			int rateOfInterest = rst.getInt("rate_of_interest");
			Policy policy = new Policy(policyid, name, premium, rateOfInterest);
			return policy;
		}
		DBConnection.dbClose();
		return null;
	}

	@Override
	public int DeactivatePolicyById(int id) throws SQLException, PolicyNotFoundException {
		Connection con = DBConnection.dbConnect();
		String sql="delete from policy where id =?";
		//prepare the statement 
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, id);
		int status=pstmt.executeUpdate();
		DBConnection.dbClose();
		return status;
		
	}

		@Override
		public int activatePolicy(int policyId) throws SQLException {
			Connection con = DBConnection.dbConnect();
			String sql = "UPDATE policy SET active='YES' WHERE id=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, policyId);
			int status = pstmt.executeUpdate();
			return status;
	}


}
