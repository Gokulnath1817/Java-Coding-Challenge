package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.PolicyDao;
import com.dao.PolicyDaoImpl;
import com.exception.PolicyNotFoundException;
import com.model.Policy;

public class PolicyService {
PolicyDao dao=new PolicyDaoImpl();
	public List<Policy> findAll() throws SQLException {
		return dao.findAll();
	}
	public int AddPolicy(Policy policy) throws SQLException {
		// TODO Auto-generated method stub
		return dao.AddPolicy(policy);
	}
	public Policy DisplayPolicyById(int id) throws SQLException, PolicyNotFoundException {
		// TODO Auto-generated method stub
		return dao.DisplayPolicyById(id);
	}
	public int updatePolicy(int policyId, String newName, double newPremium, int newInterest,int RateofIntrest) {
		// TODO Auto-generated method stub
		return 0;
	}
	public int DeletePolicyby(int policyId) throws SQLException, PolicyNotFoundException {
		// TODO Auto-generated method stub
		return dao.DeactivatePolicyById(policyId);
	}
	public int activatePolicy(int policyId) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
