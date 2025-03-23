package com.LINKER.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.LINKER.users.model.UsersDTO;
import com.LINKER.users.service.UsersService;
import com.LINKER.users.service.UsersServiceImpl;

@WebServlet("*.main")
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public MainController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		//한글처리
		request.setCharacterEncoding("utf-8");
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String command = uri.substring( conPath.length() );
		
		System.out.println("요청경로:" + command);
		
		
		//사용할 서비스 선언
		UsersService service = new UsersServiceImpl();
		
		//MVC2 기본 이동 방식은 포워드 방식입니다.
		if(command.equals("/users/join.main")) {
			
			request.getRequestDispatcher("join.jsp").forward(request, response);
		
		} else if(command.equals("/users/joinForm.main")) { //회원가입기능
			
			service.join(request, response);
			
		} else if(command.equals("/jsp/main/main.jsp.main")) { //로그인화면 이동

			String email = request.getParameter("email");
			String password = request.getParameter("password");
			
			UsersDTO userDto = new UsersDTO();
			userDto.setEmail(email);
			userDto.setPassword(password);
			
			int cnt = service.login(userDto);
			
			//정보가 있으면 1 없으면 0
			if(cnt < 1) {
				// 회원가입 페이지로 넘기는 로직
				request.getRequestDispatcher("sign_up.jsp").forward(request, response);
			} else {
				session.setAttribute("userDto", userDto);
				
				// 로그아웃시
				session.invalidate();
				
				request.getRequestDispatcher("main.jsp").forward(request, response);
			}
			
		} else if(command.equals("/users/loginForm.users")) { //로그인 처리
			
		} else if(command.equals("/users/mypage.users")) { //마이페이지
			request.getRequestDispatcher("order.jsp").forward(request, response);
		}
		
		
		
		
		
	}
}
