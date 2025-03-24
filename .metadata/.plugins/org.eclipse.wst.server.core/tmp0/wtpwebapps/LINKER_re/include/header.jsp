<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div id="semi_wrap">
	<header>
		<!-- <div id="header_wrap"> -->
		<div class="header_first_line">
			<div class="logo_box">
				<a href="/LINKER/jsp/main/mains.jsp.users"><img src="${pageContext.request.contextPath }/img/logo.png" alt="logo"></a>
			</div>
			<div class="header_top_menu">
				<button class="sign_in">로그인</button>
				<button class="sign_up">
					<a class="su" href="/LINKER/jsp/main/signUp.jsp.users">회원가입</a>
				</button>
			</div>
		</div>
		<div class="header_second_line">
			<div class="drop_down">
				<ul class="main_menu">
					<li><a href="/LINKER/jsp/menu/menu1.jsp.users">아크릴굿즈</a></li>
					<li><a href="/LINKER/jsp/menu/menu2.jsp.users">우드굿즈</a></li>
					<li><a href="/LINKER/jsp/menu/menu3.jsp.users">일러스트굿즈</a></li>
					<li><a href="/LINKER/jsp/menu/faq.jsp.users">고객센터</a></li>
				</ul>
			</div>
			<div class="header_tool">
				<div class="left_tool">
					<input type="text" placeholder="검색어를 입력하세요..">
					<div class="search_icon">
						<img src="${pageContext.request.contextPath }/img/search_icon.png" alt="search_icon">
					</div>
				</div>
				<div class="right_tool">
					<div class="user_icon">
						<a href="/LINKER/jsp/order/order.jsp.users"><img src="${pageContext.request.contextPath }/img/user_icon.png" alt="user_icon"></a>
					</div>
					<div class="bucket_icon">
						<a href="/LINKER/jsp/cart/cart.jsp.users"><img src="${pageContext.request.contextPath }/img/cart_icon.png" alt="cart_icon"></a>
					</div>
				</div>
			</div>
		</div>
		<!-- </div> -->
	</header>
	<div id="header_bottom_line"></div>
</div>