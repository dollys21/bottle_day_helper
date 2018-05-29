package com.bdh.app.dao;

import java.util.List;

import com.bdh.app.model.User;

public interface UserDAO {

	public void createUser(User user);
	public User getUserById(Integer userId);
	public List<User> getUserList();
	public User getByNamepass(User user);
}