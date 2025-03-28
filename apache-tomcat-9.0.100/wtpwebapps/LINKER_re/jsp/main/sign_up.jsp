<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="../../css/sign_up.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="../../js/jquery-3.7.1.js"></script>
    <script src="../../js/script.js"></script>
</head>

<body>
    <section>
        <div class="sign_up_logo">
            <img src="../../img/logo.png" alt="logo">
        </div>
        <div class="sign_up_content">
            <div class="su_title">
                <h1>회원가입</h1>
            </div>
            <form action="/LINKER/jsp/main/sign_up.jsp.users">
            <div class="su_con_wrap">
                <div class="su_con_box">
                    <div class="su_ct">이름<span> *</span></div>
                    <div class="su_input"><input type="text" name="user_name" placeholder="이름을 입력해 주세요."></div>
                </div>
                <div class="su_con_box su_con_two">
                    <div class="su_ct">이메일<span> *</span></div>
                    <div class="su_input"><input type="text" name="email" placeholder="이메일을 입력해 주세요."></div>
                </div>
                <div class="su_con_box">
                    <div class="su_ct">비밀번호<span> *</span></div>
                    <div class="su_input"><input type="password" name="password" placeholder="비밀번호를 입력해 주세요. (8자리 이상)"></div>
                    <div class="su_input"><input type="password" placeholder="비밀번호를 한번 더 입력해주세요."></div>
                </div>
                <div class="su_con_box su_con_one">
                    <div class="su_ct">연락처<span> *</span></div>
                    <div class="su_input"><input type="text" name="phone" placeholder="연락처를 입력해 주세요."></div>
                </div>
                <div class="su_con_box su_con_thr">
                    <div class="su_ct">주소<span> *</span></div>
                    <div class="su_input"><input type="text" name="user_address" placeholder="주소를 입력해 주세요."></div>
                </div>
                <div class="su_con_box su_con_thr">
                    <div class="su_ct">회원 유형<span> *</span></div>
                    <div class="su_input su_ck">
                        <div class="su_flex">
                            <input type="checkbox" name="mem_code"><span>구매자</span>
                        </div>
                        <div class="su_flex">
                            <input type="checkbox" name="mem_code"><span>판매자</span>
                        </div class="su_flex">
                    </div>
                </div>
                <div class="su_con_box su_con_for">
                    <span id="sign_up_agree">회원 가입을 완료하면 자동으로 이용약관과 개인정보처리방침에 동의됩니다.</span>
                    <div class="su_input"><input type="submit" value="가입하기"></div>
                </div>
            </div>
            </form>
        </div>
    </section>
</body>

</html>