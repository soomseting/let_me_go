<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div id="pop">
            <div id="pop_box">
                <div class="pop_content">
                    <div class="popup_logo">
                        <button id="close"><img src="../../img/close_icon.png" alt="close_icon"></button>
                        <img src="../../img/logo.png" alt="logo">
                    </div>
                <form action="/LINKER/jsp/main/main.jsp.users">
                    <div class="pop_sec">
                        <span class="pop_one pop_user"><input type="text" name="email" placeholder="이메일을 입력하세요"></span>
                        <span class="pop_one pop_user"><input type="password" name="password" placeholder="비밀번호를 입력하세요"></span>
                        <div class="pop_sub_flex_box">
                            <input type="checkbox"><strong id="check_span">이메일 저장</strong>
                        </div>
                        <span class="pop_one pop_sign_in"><input type="submit" value="로그인"></span>
                    </div>
                    <div class="pop_sec_footer">
                        <button class="pop_user"><strong><a class="su2" href="/LINKER/jsp/main/signUp.jsp.users">회원가입</a></strong></button>
                        <button class="pop_user"><strong>비밀번호 찾기</strong></button>
                    </div>                    
        		</form>
                </div>
            </div>
        </div>