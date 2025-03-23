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

@WebServlet("*.users")
public class UsersController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UsersController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doAction(request, response);
	}

	protected void doAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();

		// 한글처리
		request.setCharacterEncoding("utf-8");

		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String command = uri.substring(conPath.length());

		System.out.println("요청경로:" + command);

		// 사용할 서비스 선언
		UsersService service = new UsersServiceImpl();

		// MVC2 기본 이동 방식은 포워드 방식입니다.
		if (command.equals("/users/join.users")) {

			request.getRequestDispatcher("join.jsp").forward(request, response);

		} else if (command.equals("/jsp/main/sign_up.jsp.users")) { // 회원가입기능

//			service.join(request, response);
			
			UsersDTO userDto = new UsersDTO();
			
			userDto.setUserName(request.getParameter("userName"));
			userDto.setEmail(request.getParameter("email"));
			userDto.setPassword(request.getParameter("password"));
			userDto.setPhone(request.getParameter("phone"));
			userDto.setMemCode(request.getParameter("memCode"));
			userDto.setUserAddress(request.getParameter("userAddress"));
			
			int cnt = service.addUser(userDto);
			
			// 이 밑에 부분 이제 회원가입 완료페이지 만들어서 연결시켜주면 됨
			
			request.getRequestDispatcher("signUp.jsp").forward(request, response);

		} else if (command.equals("/jsp/main/main.jsp.users")) { // 로그인화면 이동

			String email = request.getParameter("email");
			String password = request.getParameter("password");

			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@");

			UsersDTO userDto = new UsersDTO();
			userDto.setEmail(email);
			userDto.setPassword(password);

			int cnt = service.login(userDto);

			// 정보가 있으면 1 없으면 0
			if (cnt < 1) {
				// 회원가입 페이지로 넘기는 로직
				request.getRequestDispatcher("sign_up.jsp").forward(request, response);
			} else {
				session.setAttribute("userDto", userDto);

				// 로그아웃시
				// session.invalidate();

				request.getRequestDispatcher("main.jsp").forward(request, response);
			}

		} else if (command.equals("/jsp/main/signUp.jsp.users")) {//회원가입
			request.getRequestDispatcher("sign_up.jsp").forward(request, response);
		} else if (command.equals("/jsp/main/mains.jsp.users")) { // 로고 클릭
			request.getRequestDispatcher("main.jsp").forward(request, response);

		} else if (command.equals("/users/mypage.users")) { // 마이페이지
			request.getRequestDispatcher("order.jsp").forward(request, response);
			
		}
		
		else if(command.equals("/jsp/menu/menu1.jsp.users")) {//드룹다운 메뉴
			request.getRequestDispatcher("product_list.jsp").forward(request, response);
		}else if(command.equals("/jsp/menu/menu2.jsp.users")) {
			request.getRequestDispatcher("product_list_wood.jsp").forward(request, response);
		}else if(command.equals("/jsp/menu/menu3.jsp.users")) {
			request.getRequestDispatcher("product_list_illust.jsp").forward(request, response);
		}else if(command.equals("/jsp/menu/faq.jsp.users")) {
			request.getRequestDispatcher("faq.jsp").forward(request, response);
		}

	}
}
