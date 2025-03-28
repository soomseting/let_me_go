package com.LINKER.order.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.LINKER.mapper.UsersMapper;
import com.LINKER.users.model.UsersDAO;
import com.LINKER.users.model.UsersDTO;
import com.LINKER.util.mybatis.MybatisUtil;

public class OrderServiceImpl implements OrderService {

	private SqlSessionFactory sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
	
	@Override
	public void orders(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 값을 받음
		int user_id =  Integer.parseInt(request.getParameter("user_id"));
		String user_name = request.getParameter("user_name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String phone = request.getParameter("phone");
		String created_at = request.getParameter("created_at");
		String mem_code = request.getParameter("mem_code");
		int cart_id = Integer.parseInt(request.getParameter("cart_id"));
		int user_point = Integer.parseInt(request.getParameter("user_point"));
		String user_address = request.getParameter("user_address");

	}

	@Override
	public int login(UsersDTO usersDto) throws ServletException, IOException {
		SqlSession sql = sqlSessionFactory.openSession(true);
		UsersMapper user = sql.getMapper(UsersMapper.class);
		
		return user.login(usersDto);
	}

}
