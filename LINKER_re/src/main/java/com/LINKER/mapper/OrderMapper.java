package com.LINKER.mapper;

import java.io.IOException;

import javax.servlet.ServletException;

import com.LINKER.users.model.UsersDTO;

public interface OrderMapper {
	int login(UsersDTO usersDto) throws ServletException, IOException;
}
