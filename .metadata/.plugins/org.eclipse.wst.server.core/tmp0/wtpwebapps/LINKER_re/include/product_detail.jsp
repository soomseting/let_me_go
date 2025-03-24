<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>LINKER</title>
    <link rel="stylesheet" href="css/common.css">
    <link rel="stylesheet" href="css/product_detail.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="js/jquery-3.7.1.js"></script>
    <script src="js/script.js"></script>
</head>
<body>
    <%@ include file="popup.jsp" %>
    <%@ include file="header.jsp" %>
    <section>
        <div class="product_detail_wrap">
            <div class="product_detail_img">
                <div class="detail_main">
                    <img src="img/product_detail.png" alt="product_detail">
                </div>
                <div class="detail_sub">
                    <div class="de_sub pr_ping"><img src="img/product_detail.png" alt="product_detail"></div>
                    <div class="de_sub"><img src="img/product_detail2.png" alt="product_detail"></div>
                    <div class="de_sub"><img src="img/product_detail3.png" alt="product_detail"></div>
                </div>
            </div>
            <div class="product_detail_con">
                <div class="de_con_header">
                    <p class="pr_company">잇츠유어프라임타임 ></p>
                    <p class="pr_title">오둥이 아크릴키링 2종 (택1)</p>
                    <strong>5,000원</strong>
                </div>
                <div class="pr_sub_con">
                    <div class="pr_sub_mini">
                        <div class="pr_detail_left">
                            <p>카드 혜택</p>
                        </div>
                        <div class="pr_detail_right pdr">
                            <p>하나카드 1/3/5/10만원</p>
                            <p>롯데카드 청구할인</p>
                            <p>하나카드 무이자 최대 12만원</p>
                        </div>
                    </div>
                    <div class="pr_sub_mini">
                        <div class="pr_detail_left">
                            <p>카드 혜택</p>
                        </div>
                        <div class="pr_detail_right">
                            <strong>무료/택배</strong>
                            <p>전국 | 지역별 추가 배송비 부과</p>
                        </div>
                    </div>
                    <div class="pr_sub_mini pr_sel">
                        <div class="pr_detail_left">
                            <p>제품 종류</p>
                        </div>
                        <div class="pr_detail_right">
                            <select name="" id="">
                                <option value="1">오둥이 아크릴 키링(구름)</option>
                                <option value="2">오둥이 아크릴 키링(베이직)</option>
                                <option value="3">오둥이 아크릴 키링(옐로우)</option>
                            </select>
                        </div>
                    </div>
                    <div class="pr_sub_mini pr_sel">
                        <div class="pr_detail_left">
                            <p>제품 수량</p>
                        </div>
                        <div class="pr_detail_right">
                            <select name="" id="">
                                <option value="1">1</option>
                                <option value="2">2</option>
                                <option value="3">3</option>
                            </select>
                        </div>
                    </div>
                </div>
                <div class="product_detail_btn">
                    <button class="pr_btn_left">장바구니</button>
                    <button class="pr_btn_right">구매하기</button>
                </div>
            </div>
        </div>
        <div class="detail_bar">
            <p>상품 설명</p>
            <img src="img/down_arrow_icon.png" alt="down_arrow_icon">
        </div>
        <div class="detail_content">
            <img src="img/product_content.png" alt="product_content">
        </div>


    </section>
    <%@ include file="footer.jsp" %>
</body>
</html>
