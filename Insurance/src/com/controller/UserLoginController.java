package com.controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.exception.InvalidCredentialsException;
import com.model.User;
import com.service.UserService;

public class UserLoginController {

    public static void main(String[] args) {
        UserService userService = new UserService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("********INSURANCE******");
            System.out.println("Press 1. Login ");
            System.out.println("Press 0. to Exit");
            int input = sc.nextInt();
            if (input == 0) {
                System.out.println("Leaving insurance system");
                break;
            }

            switch (input) {
                case 1:
                    try {
                        System.out.println("Enter username");
                        sc.nextLine();
                        String loginUsername = sc.nextLine();
                        System.out.println("Enter password");
                        String loginPassword = sc.nextLine();

                        User user = userService.login(loginUsername, loginPassword);
                        if (user.getRole().equalsIgnoreCase("client")) {
                            ClientController.ClientMenu();
                        } else {
                            AgentController.AgentMenu();
                        }
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    } catch (InvalidCredentialsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                    default:
                    	System.out.println("Enter Valid input");
            }

        }
        sc.close();
    }
}

