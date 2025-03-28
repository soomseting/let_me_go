<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>장바구니</title>
    <link rel="stylesheet" href="../../css/common.css">
    <link rel="stylesheet" href="../../css/cart.css">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="../../js/jquery-3.7.1.js"></script>
    <script src="../../js/script.js"></script>
    <script src="../../js/cart.js"></script>
</head>
<body>
    <%@ include file="../../include/popup.jsp" %>
    <%@ include file="../../include/header.jsp" %>
    <section class="sec_area">
    <div class="cart-container">
        <div class="cart-title">
            <h2>장바구니</h2>
            <div class="progress-bar">
                <span class="active">1. 장바구니 </span> 
                <span>> 2. 주문서작성  ></span> 
                <span>3. 주문완료  </span>
            </div>
        </div>
        
        <div id="empty-cart" class="cart-empty">
            <img src="../../img/cart-icon.png" alt="빈 장바구니">
            <p>장바구니가 비어 있습니다.</p>
            <button class="add-item-btn" onclick="goToMainPage()">상품 추가</button>
        </div>
        
        <div id="filled-cart" class="cart-filled hidden">
            <table class="cart-list">
                <tr>
                    <th><input type="checkbox" id="selectAll" onclick="toggleSelectAll()"> 상품</th>
                    <th>수량</th>
                    <th>가격</th>
                    <th>비고</th>
                </tr>
                <tr class="cart-item">
                    <td><input type="checkbox" class="item-check" onclick="updateTotal()"> 상품명</td>
                    <td>100</td>
                    <td class="item-price">150,000원</td>
                    <td><button class="delete-btn" onclick="deleteItem(this)">삭제</button></td>
                </tr>
                <tr class="cart-item">
                    <td><input type="checkbox" class="item-check" onclick="updateTotal()"> 오둥이키링</td>
                    <td>2</td>
                    <td class="item-price">3,000원</td>
                    <td><button class="delete-btn" onclick="deleteItem(this)">삭제</button></td>
                </tr>
            </table>
            
            <div class="cart-footer">
                <span class="total-price">총액 : <b id="total-price">0원</b></span>
                <button class="order-btn" disabled>주문하기</button>
            </div>
        </div>
    </div>
</section>
<%@ include file="../../include/footer.jsp" %>
</body>
</html>
