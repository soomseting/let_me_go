/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.100
 * Generated at: 2025-03-22 10:33:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.order_005fsheet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class order_005fsheet_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>주문서작성</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../../css/common.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../../css/order_sheet.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../../css/sidebar.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../../css/writeBtn.css\">\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"../../js/jquery-3.7.1.js\"></script>\r\n");
      out.write("    <script src=\"../../js/script.js\"></script>\r\n");
      out.write("    <script src=\"../../js/order_sheet.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div id=\"pop\">\r\n");
      out.write("        <div id=\"pop_box\">\r\n");
      out.write("            <div class=\"pop_content\">\r\n");
      out.write("                <div class=\"popup_logo\">\r\n");
      out.write("                    <button id=\"close\"><img src=\"img/close_icon.png\" alt=\"close_icon\"></button>\r\n");
      out.write("                    <img src=\"../../img/logo.png\" alt=\"logo\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"pop_sec\">\r\n");
      out.write("                    <span class=\"pop_one pop_user\"><input type=\"text\" placeholder=\"이메일을 입력하세요\"></span>\r\n");
      out.write("                    <span class=\"pop_one pop_user\"><input type=\"password\" placeholder=\"비밀번호를 입력하세요\"></span>\r\n");
      out.write("                    <div class=\"pop_sub_flex_box\">\r\n");
      out.write("                        <input type=\"checkbox\"><strong id=\"check_span\">이메일 저장</strong>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <span class=\"pop_one pop_sign_in\"><input type=\"submit\" value=\"로그인\"></span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"pop_sec_footer\">\r\n");
      out.write("                    <button class=\"pop_user\"><strong><a class=\"su2\" href=\"../../sign_up.html\">회원가입</a></strong></button>\r\n");
      out.write("                    <button class=\"pop_user\"><strong>비밀번호 찾기</strong></button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"semi_wrap\">\r\n");
      out.write("        <header>\r\n");
      out.write("            <!-- <div id=\"header_wrap\"> -->\r\n");
      out.write("            <div class=\"header_first_line\">\r\n");
      out.write("                <div class=\"logo_box\">\r\n");
      out.write("                    <img src=\"img/logo.png\" alt=\"logo\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"header_top_menu\">\r\n");
      out.write("                    <button class=\"sign_in\">로그인</button>\r\n");
      out.write("                    <button class=\"sign_up\"><a class=\"su\" href=\"sign_up.html\">회원가입</a></button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"header_second_line\">\r\n");
      out.write("                <div class=\"drop_down hd_drop\">\r\n");
      out.write("                    <ul class=\"main_menu\">\r\n");
      out.write("                        <li><a href=\"product_list.html\">아크릴굿즈</a></li>\r\n");
      out.write("                        <li><a href=\"#\">우드굿즈</a></li>\r\n");
      out.write("                        <li><a href=\"#\">일러스트굿즈</a></li>\r\n");
      out.write("                        <li><a href=\"#\">고객센터</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"header_tool\">\r\n");
      out.write("                    <div class=\"left_tool hd_left_t\">\r\n");
      out.write("                        <input type=\"text\" placeholder=\"검색어를 입력하세요..\">\r\n");
      out.write("                        <div class=\"search_icon\"><img src=\"img/search_icon.png\" alt=\"search_icon\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"right_tool hd_right_t\">\r\n");
      out.write("                        <div class=\"user_icon\">\r\n");
      out.write("                            <img src=\"img/user_icon.png\" alt=\"user_icon\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"bucket_icon\">\r\n");
      out.write("                            <img src=\"img/cart_icon.png\" alt=\"cart_icon\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- </div> -->\r\n");
      out.write("        </header>\r\n");
      out.write("        <div id=\"header_bottom_line\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <section class=\"sec_area\">\r\n");
      out.write("        <div class=\"order-container\">\r\n");
      out.write("            <div class=\"order-header\">\r\n");
      out.write("                <h3>주문서</h3>\r\n");
      out.write("                <div class=\"progress-bar\">\r\n");
      out.write("                    <span>1. 장바구니 </span>>\r\n");
      out.write("                    <span class=\"active\"> 2. 주문서작성 </span> >\r\n");
      out.write("                    <span>3. 주문완료 </span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"delivery_title\">\r\n");
      out.write("                <strong>배송지</strong>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"delivery_address\">\r\n");
      out.write("                <p><strong>안종수</strong></p>\r\n");
      out.write("                <p>010-1234-5678</p>\r\n");
      out.write("                <p>주소:서울시 강남구</p>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <strong>주문 상품</strong>\r\n");
      out.write("            <div class=\"product_section\">\r\n");
      out.write("                <div class=\"order-item\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <span>오둥이 키링</span>\r\n");
      out.write("                        <p>수량: 2개</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <p><strong>총 주문금액: ₩3,000원</strong></p>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <button type=\"submit\" class=\"pay\">결제하기</button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <footer class=\"footer\">\r\n");
      out.write("        <div class=\"footer_box\">\r\n");
      out.write("            <ul class=\"footer_menu\">\r\n");
      out.write("                <li><a href=\"#\">이용후기</a></li>\r\n");
      out.write("                <li><a href=\"#\">마이페이지</a></li>\r\n");
      out.write("                <li><a href=\"#\">이용약관</a></li>\r\n");
      out.write("                <li><a href=\"#\">개인정보처리방침</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"line\">\r\n");
      out.write("                <div class=\"line_top\">\r\n");
      out.write("                    <p class=\"line_top_p\">(주)링커 | 서울시 강남구 | 미니플젝 : 링커 | 개인정보관리책임자 : 손유경 | 사업자등록번호 : 123-45-67890\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p class=\"line_top_p\"> : 2025-서울강남-1234 | 유료직업소개사업등록번 호 : 제2025-1234567-89-0-12345호 | 고객센터 :\r\n");
      out.write("                        1234-5678 | 호스팅 사업자: Amazon Web Service(AWS)</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"line_bottom\">\r\n");
      out.write("                    <p class=\"line_bottom_p\">(주)링커는 통신판매중개자이며, 통신판매의 당사자가 아닙니다. 상품, 상품정보, 거래에 관한 의무와 책임은 판매회원에게\r\n");
      out.write("                        있습니다.</p>\r\n");
      out.write("                    <p class=\"line_bottom_p\">(주)링커 사이트의 상품/전문가/이벤트 정보, 디자인 및 화면의 구성, UI 등의 무단복제, 배포, 방송 또는 전송,\r\n");
      out.write("                        스크래핑 등의 행위는 저작권법, 콘텐츠산업 진흥법 등 관련법령에 의하여 엄격히 금지됩니다.</p>\r\n");
      out.write("                    <p class=\"line_bottom_p\">Copyright © 2025 Jongsu Macne. All rights reserved.</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
