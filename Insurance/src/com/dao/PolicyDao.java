package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.exception.PolicyNotFoundException;
import com.model.Policy;

public interface PolicyDao {
	List<Policy> findAll() throws SQLException;
	int AddPolicy(Policy policy) throws SQLException;
	Policy DisplayPolicyById(int id) throws SQLException, PolicyNotFoundException;
	int DeactivatePolicyById(int id) throws SQLException, PolicyNotFoundException;
	int activatePolicy(int policyId) throws SQLException;
}
