package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.exception.PolicyNotFoundException;
import com.model.Policy;
import com.service.PolicyService;

public class AgentController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PolicyService policyService = new PolicyService();
		
		while(true) { 
			System.out.println("Press 1. Create New Policy");
			System.out.println("Press 2. Display All Policies");
			System.out.println("Press 3. View a Policy By its ID");
			System.out.println("Press 4. Delete a Policy by Id");
			System.out.println("Press 5. Activate Policies");
			System.out.println("Press 0. Logout");
			
			int input = sc.nextInt(); 
			
			if(input == 0) { 
				System.out.println("Exiting the Agent Ops....");
				break;
			}
			
			switch(input) {
			
				case 1:
					try {
						Policy policy=new Policy();
						System.out.println("Enter name of policy");
						sc.nextLine();
						String policyName = sc.nextLine();
						policy.setName(policyName);
						System.out.println("Enter Policy premium");
						double premium = sc.nextDouble();
						policy.setPremium(premium);
						System.out.println("Enter rate of interest");
						int InterestRate= sc.nextInt();		
						policy.setRateOfInterest(InterestRate);
						int status = policyService.AddPolicy(policy);
						
						if(status == 1) {
							System.out.println("New Policy created successfully");
						}
						else {
							System.out.println("Try Again");
						}
					}catch(SQLException e) {
						System.out.println(e.getMessage());
					}
					
					break;
				
				case 2:
					try {
					List<Policy> policy = policyService.findAll();
					for (Policy p : policy) {
						System.out.println(p);
					}
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				break;
					
					
				case 3:
					try {
						List<Policy> policylist = policyService.findAll();
						for(Policy p : policylist) {
							System.out.println(p);
						}
						System.out.println("");
						System.out.println("Enter policy id to view the policy in detail");
						int id = sc.nextInt();
						
						Policy policy = policyService.DisplayPolicyById(id);
						System.out.println(policy);
						
					} catch (SQLException e) {
						System.out.println(e.getMessage());
					} catch (PolicyNotFoundException e) {
						System.out.println(e.getMessage());
					}
					
					break;
				/*
				case 4:
					try {
						List<Policy> p = policyService.findAll();
						for(Policy policy : p) {
							System.out.println(p);
						}
						
						System.out.println("Enter the policy ID that you want to update:");
						
						int policyId = sc.nextInt();

						System.out.println("Enter updated name of the policy");
						sc.nextLine();
						String newName = sc.nextLine();
						System.out.println("PREMIUM");
						double newPremium = sc.nextDouble();
						System.out.println("RATE OF INTEREST");
						int newInterest = sc.nextInt();
						
						int status = policyService.updatePolicy(policyId, newName, newPremium, newInterest);
						if(status==1) {
							System.out.println("Policy data updated successfully");
						}
						else {
							System.out.println("policy is not updated succesfully");
						}
						
					}catch(SQLException e) {
						System.out.println(e.getMessage());
					}
					
					break;*/
					
				case 4:
					try {
						List<Policy> policy = policyService.findAll();
						System.out.println("ID  NAME  PREMIUM  RATE_OF_INTEREST  ACTIVE");
						for(Policy p : policy) {
							System.out.println(p);
						}			
						System.out.println("Enter policy ID you want to delete");
						int policyId = sc.nextInt();
						try {
							int status = policyService.DeletePolicyby(policyId);
							if(status==1) {
								System.out.println("POLICY  has been deactivated Successfully");
							}
							else {
								System.out.println("Please try again to Deactivate policy..");
							}
						} catch (PolicyNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}catch(SQLException e) {
						System.out.println(e.getMessage());
					}
					
					break;
					
				case 5:
					try {
						List<Policy> policy = policyService.findAll();
						System.out.println("ID  NAME  PREMIUM  RATE_OF_INTEREST  ACTIVE");
						for(Policy  p: policy) {
							System.out.println(p);
						}
						System.out.println("");
						
						System.out.println("Enter policy ID you want to activate");
						
						int policyId = sc.nextInt();
						
						int status = policyService.activatePolicy(policyId);
						if(status==1) {
							System.out.println("POLICY " + policyId + " has been activated");
						}
					}catch(SQLException e) {
						System.out.println(e.getMessage());
					}
					
					break;
					
				default:
						System.out.println("invalid input");
			}
			
		}

	}

	public static void AgentMenu() {
		String[] menu= {""};
		main(menu);			
	}

}