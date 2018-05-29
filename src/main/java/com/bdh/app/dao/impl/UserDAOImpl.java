package com.bdh.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bdh.app.rowmapper.UserRowMapper;
import com.bdh.app.dao.UserDAO;
import com.bdh.app.model.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void createUser(User user) {
		String CREATE_USER_SQL = "INSERT INTO user ( first_name, last_name,password ) VALUES (?, ?,?)";
		int update = jdbcTemplate.update(CREATE_USER_SQL, user.getFirstName(), user.getLastName(),user.getPassword());

		if(update == 1)
			System.out.println("User "+user.getFirstName() + " " + user.getLastName() + " Added Sucessfully");
	}

	@Override
	public User getUserById(Integer userId) {
		String GET_USER_SQL = "SELECT * FROM USER WHERE USER_ID =?";
		User user = jdbcTemplate.queryForObject(GET_USER_SQL, new UserRowMapper(), userId);
		return user;
	}

	@Override
	public List<User> getUserList() {
		String GET_ALL_USERS = "SELECT * FROM USER";
		return jdbcTemplate.query(GET_ALL_USERS, new UserRowMapper());
		 
	}

	@Override
	public User getByNamepass(User user) {
		String GET_USER_SQL = "SELECT * FROM USER WHERE FIRST_NAME =? and PASSWORD=?";
		User user2 = jdbcTemplate.queryForObject(GET_USER_SQL, new UserRowMapper(), user.getFirstName(),user.getPassword());
return user2;
	}

}