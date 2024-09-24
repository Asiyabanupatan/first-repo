package com.Kodbook.services;

import com.Kodbook.entities.User;

public interface UserService {

	void addUser(User user);

	boolean userExists(String username, String email);

	boolean validateUser(String username, String password);

}
