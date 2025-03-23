package com.LINKER.mapper;

import java.io.IOException;

import javax.servlet.ServletException;

import com.LINKER.users.model.UsersDTO;

public interface UsersMapper {
	int login(UsersDTO usersDto) throws ServletException, IOException;
	void join(UsersDTO usersDto) throws ServletException, IOException;
	int addUser(UsersDTO userDto);
}
