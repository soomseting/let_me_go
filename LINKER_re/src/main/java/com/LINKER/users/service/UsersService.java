package com.LINKER.users.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.LINKER.users.model.UsersDTO;

public interface UsersService {
	
	void join(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
	int login(UsersDTO usersDto) throws ServletException, IOException;
	void modify(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
	void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
	public int addUser(UsersDTO usersDto);
//	void getUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
