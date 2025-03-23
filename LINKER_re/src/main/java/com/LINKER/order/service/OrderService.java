package com.LINKER.order.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.LINKER.users.model.UsersDTO;

public interface OrderService {
	
	void orders(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
	int login(UsersDTO usersDto) throws ServletException, IOException;
	
}
