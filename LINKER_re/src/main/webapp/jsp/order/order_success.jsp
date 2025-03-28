<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>주문 완료</title>
    <link rel="stylesheet" href="../../css/common.css">
    <link rel="stylesheet" href="../../css/order_success.css">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="../../js/jquery-3.7.1.js"></script>
    <script src="../../js/bootstrap.min.js"></script>
    <script src="../../js/script.js"></script>
</head>
<body>
    <div id="pop">
        <div id="pop_box">
            <div class="pop_content">
                <div class="popup_logo">
                    <button id="close"><img src="../../img/close_icon.png" alt="close_icon"></button>
                    <img src="../../img/logo.png" alt="logo">
                </div>
                <div class="pop_sec">
                    <span class="pop_one pop_user"><input type="text" placeholder="이메일을 입력하세요"></span>
                    <span class="pop_one pop_user"><input type="password" placeholder="비밀번호를 입력하세요"></span>
                    <div class="pop_sub_flex_box">
                        <input type="checkbox"><strong id="check_span">이메일 저장</strong>
                    </div>
                    <span class="pop_one pop_sign_in"><input type="submit" value="로그인"></span>
                </div>
                <div class="pop_sec_footer">
                    <button class="pop_user"><strong><a class="su2" href="../../sign_up.html">회원가입</a></strong></button>
                    <button class="pop_user"><strong>비밀번호 찾기</strong></button>
                </div>
            </div>
        </div>
    </div>
    <%@ include file="../../include/header.jsp" %>
    <section class="sec_area sec_content">
        <div class="orderSucess-container">
            <div class="orderSucess-header">
                <h3>주문완료</h3>
                <div class="progress-bar">
                    <span>1. 장바구니 </span>> 
                    <span> 2. 주문서작성  </span> >
                    <span class="active">3. 주문완료  </span> 
                </div>
            </div>
            <div class="pay">
                <div class="pay-content">
                    <h2>결제가 완료되었습니다! 🎉</h2>
                    <p>주문이 성공적으로 접수되었습니다.</p>
                </div>
            </div>
    
            <div class="home-btn">
                <a href="../../order.html" class="od-btn">주문상세</a>
                <a href="/LINKER/jsp/order/main.jsp.order" class="main-btn">홈</a>
            </div>
        </div>
    </section>
    <%@ include file="../../include/footer.jsp" %>
    
</body>
</html>