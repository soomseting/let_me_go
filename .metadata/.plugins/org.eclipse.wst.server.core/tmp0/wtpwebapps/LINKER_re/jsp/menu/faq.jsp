<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>자주하는질문</title>
  <link rel="stylesheet" href="../../css/faq.css">
  <link rel="stylesheet" href="../../css/common.css">
  <link rel="stylesheet" href="../../css/writeBtn.css">
  <link rel="stylesheet" href="../../css/sidebar.css">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="../../js/jquery-3.7.1.js"></script>
    <script src="../../js/script.js"></script>
    <script src="../../js/faq.js"></script>

</head>
<body>
  <%@ include file="../../include/header.jsp" %>
  <section>
    <%@ include file="../sidebar/sidebar_user_center.jsp" %>
  <div class="faq-container">
    <h3>자주하는 질문 (FAQ)</h3>
    
    <div class="faq-section">
      <ul>
        <li>
          <button class="faq-question">키링 주문은 어떻게 하나요?
            <span class="faq-date">2025-03-18</span>
          </button>
          <p class="faq-answer">상품을 선택하고, 디자인 옵션을 선택한 후, 장바구니에 담고 결제를 완료하면 주문이 완료됩니다.</p>
        </li>
        <li>
          <button class="faq-question">맞춤형 디자인도 가능한가요?
            <span class="faq-date">2025-03-18</span>
          </button>
          <p class="faq-answer">네, 고객님이 원하는 디자인을 업로드하여 맞춤형 키링을 제작할 수 있습니다.</p>
        </li>
        <li>
            <button class="faq-question">배송은 얼마나 걸리나요?
                <span class="faq-date">2025-03-18</span>
            </button>
            <p class="faq-answer">일반적으로 제작 후 3~5일 이내에 배송됩니다. 단, 맞춤형 디자인의 경우 제작 시간이 더 걸릴 수 있습니다.</p>
        </li>
        <li>
            <button class="faq-question">키링이 손상되었어요, 어떻게 해야 하나요?
                <span class="faq-date">2025-03-18</span>
            </button>
            <p class="faq-answer">상품을 수령하신 후 7일 이내에 교환 요청을 해주시면, 상태를 확인 후 교환이 가능합니다.</p>
        </li>
        <li>
            <button class="faq-question">디자인이 마음에 들지 않으면 환불 가능한가요?
                <span class="faq-date">2025-03-18</span>
            </button>
            <p class="faq-answer">맞춤형 제품은 주문 후 제작되기 때문에 환불이 어려운 점 양해 부탁드립니다. 다만, 불량품은 교환 가능합니다.</p>
        </li>
        <li>
            <button class="faq-question">도매 주문도 가능한가요?
                <span class="faq-date">2025-03-18</span>
            </button>
            <p class="faq-answer">네, 대량 주문에 대해서는 할인 혜택이 제공됩니다. 문의하기 페이지를 통해 자세한 사항을 확인해주세요.</p>
        </li>
      </ul>
    </div>
  </div>
</section>
<%@ include file="../../include/footer.jsp" %>
</body>
</html>
