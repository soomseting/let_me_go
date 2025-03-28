package com.LINKER.mapper;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;

import com.LINKER.users.model.UsersDTO;

public interface UsersMapper {
	int login(UsersDTO usersDto) throws ServletException, IOException;
	void join(UsersDTO usersDto) throws ServletException, IOException;
	int modify(Map<String, Object> params);
	int addUser(UsersDTO userDto);
	UsersDTO getUser(String email);
	int delete(String email);
}
