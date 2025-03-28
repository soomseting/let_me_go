<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>주문서작성</title>
    <link rel="stylesheet" href="../../css/common.css">
    <link rel="stylesheet" href="../../css/order_sheet.css">
    <link rel="stylesheet" href="../../css/sidebar.css">
    <link rel="stylesheet" href="../../css/writeBtn.css">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="../../js/jquery-3.7.1.js"></script>
    <script src="../../js/script.js"></script>
    <script src="../../js/order_sheet.js"></script>

</head>

<body>
    <%@ include file="../../include/popup.jsp" %>
    <%@ include file="../../include/header.jsp" %>
    <section class="sec_area">
        <div class="order-container">
            <div class="order-header">
                <h3>주문서</h3>
                <div class="progress-bar">
                    <span>1. 장바구니 </span>>
                    <span class="active"> 2. 주문서작성 </span> >
                    <span>3. 주문완료 </span>
                </div>
            </div>
            <div class="delivery_title">
                <strong>배송지</strong>
            </div>

            <div class="delivery_address">
                <p><strong>안종수</strong></p>
                <p>010-1234-5678</p>
                <p>주소:서울시 강남구</p>
            </div>

            <strong>주문 상품</strong>
            <div class="product_section">
                <div class="order-item">
                    <div>
                        <span>오둥이 키링</span>
                        <p>수량: 2개</p>
                    </div>
                </div>
                <p><strong>총 주문금액: ₩3,000원</strong></p>
            </div>

		<form action="/LINKER/jsp/order/order_success.jsp.order">
            <button type="submit" class="pay">결제하기</button>
		</form>

        </div>
    </section>
    <footer class="footer">
        <div class="footer_box">
            <ul class="footer_menu">
                <li><a href="#">이용후기</a></li>
                <li><a href="#">마이페이지</a></li>
                <li><a href="#">이용약관</a></li>
                <li><a href="#">개인정보처리방침</a></li>
            </ul>

            <div class="line">
                <div class="line_top">
                    <p class="line_top_p">(주)링커 | 서울시 강남구 | 미니플젝 : 링커 | 개인정보관리책임자 : 손유경 | 사업자등록번호 : 123-45-67890
                    </p>
                    <p class="line_top_p"> : 2025-서울강남-1234 | 유료직업소개사업등록번 호 : 제2025-1234567-89-0-12345호 | 고객센터 :
                        1234-5678 | 호스팅 사업자: Amazon Web Service(AWS)</p>
                </div>
                <div class="line_bottom">
                    <p class="line_bottom_p">(주)링커는 통신판매중개자이며, 통신판매의 당사자가 아닙니다. 상품, 상품정보, 거래에 관한 의무와 책임은 판매회원에게
                        있습니다.</p>
                    <p class="line_bottom_p">(주)링커 사이트의 상품/전문가/이벤트 정보, 디자인 및 화면의 구성, UI 등의 무단복제, 배포, 방송 또는 전송,
                        스크래핑 등의 행위는 저작권법, 콘텐츠산업 진흥법 등 관련법령에 의하여 엄격히 금지됩니다.</p>
                    <p class="line_bottom_p">Copyright © 2025 Jongsu Macne. All rights reserved.</p>
                </div>
            </div>
        </div>
    </footer>

</body>

</html>