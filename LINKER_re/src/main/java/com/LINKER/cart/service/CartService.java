package com.LINKER.cart.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface CartService {
	void regist(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
	void getList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
	void getContent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
	void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
	void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
	
	





}
