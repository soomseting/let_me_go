package com.LINKER.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.LINKER.order.service.OrderService;
import com.LINKER.order.service.OrderServiceImpl;
import com.LINKER.users.model.UsersDTO;
import com.LINKER.users.service.UsersService;
import com.LINKER.users.service.UsersServiceImpl;

@WebServlet("*.order")
public class OrderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public OrderController() {
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
		String command = uri.substring(conPath.length());
		
		System.out.println("요청경로:" + command);
		
		
		//사용할 서비스 선언
		OrderService service = new OrderServiceImpl();
		
		//order_sheet > order_success 
		if(command.equals("/jsp/order/order_sheet.jsp.order")) {//이걸 눌러야 sheet로 간다?
			//cart 
			// 상품정보
			
			request.setAttribute(conPath, command);
			
			request.getRequestDispatcher("order_sheet.jsp").forward(request, response);
		
		} else if(command.equals("/jsp/order/order_success.jsp.order")) {
			
//하하.. 이게 제가 맡은 게 거의 select 아니면 가끔 insert 하는 거 바ㅃㄲ에 없는 거 
			// 상품 정보
			// dto
			// insert 
			request.getRequestDispatcher("order_success.jsp").forward(request, response);
			
//		} else if(command.equals("/jsp/main/pay.jsp.cart")) { //결제하기 order_sheet > order_success
//			
//			request.getRequestDispatcher("order_success.jsp").forward(request, response);
//			
//		} else if(command.equals("/users/loginForm.users")) { //로그인 처리
			
		} else if(command.equals("/jsp/order/main.jsp.order")) { //home btn
			request.getRequestDispatcher("../main/main.jsp").forward(request, response);
		}
		
		
		
		
		
	}
}
