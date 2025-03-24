<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>마이페이지-주문내역</title>
    <link rel="stylesheet" href="../../css/common.css">
    <link rel="stylesheet" href="../../css/order.css">
    <link rel="stylesheet" href="../../css/sidebar.css">

      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
      <script src="../../js/jquery-3.7.1.js"></script>
      <script src="../../js/script.js"></script>
      <script src="../../js/order.js"></script>

</head>
<body>
<%@ include file="../../include/popup.jsp" %>
<%@ include file="../../include/header.jsp" %>
<section class="sec_area">
    <!-- side-bar는 section태그 바로 밑에 위치시켜야함 -->
    <%@ include file="../sidebar/sidebar.jsp" %>
    <div class="container">
        <div class="content">
            <strong>주문조회</strong>
            <div class="coment">
              <span>주문 내역을 확인할 수 있습니다.</span>
            </div>
        </div>

            <table class="order-table">
                <tr>
                    <th>주문번호</th>
                    <th>주문일자</th>
                    <th>상품명</th>
                    <th>구매자</th>
                    <th>주문수량</th>
                    <th>주문상태</th>
                </tr>
                <tr>
                    <td>202503161144</td>
                    <td>2025-03-17</td>
                    <td>오둥이키링</td>
                    <td>안종수</td>
                    <td>2</td>
                    <td>
                      <select class="order-status" onchange="updateOrderStatus(this)">
                        <option value="주문 대기 중">주문 대기 중</option>
                        <option value="제작 중">제작 중</option>
                        <option value="배송 준비 중">배송 준비 중</option>
                        <option value="배송 완료">배송 완료</option>
                    </select>                    
                    </td>
                </tr>
            </table>
            <div class="pagination">
                <a href="#"><span class="double-next" onclick="goToLastPage()"><img src="../../img/left_db_arrow.png" alt="#"></span></a>
                <a href="#"><span class="next" onclick="goToNextPage()"><img src="../../img/left_arrow.png" alt="arrow"></span></a>
                <a href="#"><span class="page-num" id="currentPage">1</span></a>
                <a href="#"><span class="prev" onclick="goToPreviousPage()"><img src="../../img/right_arrow.png" alt="arrow"></span></a>
                <a href="#"><span class="double-prev" onclick="goToFirstPage()"><img src="../../img/right_db_arrow.png" alt="#"></span></a>
            </div>
        </div>
    </div>
  </section>
    <%@ include file="../../include/footer.jsp" %>
    <script>
       
  </script>
</body>
</html>