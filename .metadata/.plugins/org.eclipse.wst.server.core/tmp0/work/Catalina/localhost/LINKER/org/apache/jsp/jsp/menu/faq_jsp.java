/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.100
 * Generated at: 2025-03-24 02:27:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.menu;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class faq_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/include/footer.jsp", Long.valueOf(1742774907990L));
    _jspx_dependants.put("/jsp/sidebar/sidebar_user_center.jsp", Long.valueOf(1742778190827L));
    _jspx_dependants.put("/include/header.jsp", Long.valueOf(1742778954866L));
  }

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
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("  <title>자주하는질문</title>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"../../css/faq.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"../../css/common.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"../../css/writeBtn.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"../../css/sidebar.css\">\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"../../js/jquery-3.7.1.js\"></script>\r\n");
      out.write("    <script src=\"../../js/script.js\"></script>\r\n");
      out.write("    <script src=\"../../js/faq.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("<div id=\"semi_wrap\">\r\n");
      out.write("	<header>\r\n");
      out.write("		<!-- <div id=\"header_wrap\"> -->\r\n");
      out.write("		<div class=\"header_first_line\">\r\n");
      out.write("			<div class=\"logo_box\">\r\n");
      out.write("				<a href=\"/LINKER/jsp/main/mains.jsp.users\"><img src=\"../../img/logo.png\" alt=\"logo\"></a>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"header_top_menu\">\r\n");
      out.write("				<button class=\"sign_in\">로그인</button>\r\n");
      out.write("				<button class=\"sign_up\">\r\n");
      out.write("					<a class=\"su\" href=\"/LINKER/jsp/main/signUp.jsp.users\">회원가입</a>\r\n");
      out.write("				</button>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"header_second_line\">\r\n");
      out.write("			<div class=\"drop_down\">\r\n");
      out.write("				<ul class=\"main_menu\">\r\n");
      out.write("					<li><a href=\"/LINKER/jsp/menu/menu1.jsp.users\">아크릴굿즈</a></li>\r\n");
      out.write("					<li><a href=\"/LINKER/jsp/menu/menu2.jsp.users\">우드굿즈</a></li>\r\n");
      out.write("					<li><a href=\"/LINKER/jsp/menu/menu3.jsp.users\">일러스트굿즈</a></li>\r\n");
      out.write("					<li><a href=\"/LINKER/jsp/menu/faq.jsp.users\">고객센터</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"header_tool\">\r\n");
      out.write("				<div class=\"left_tool\">\r\n");
      out.write("					<input type=\"text\" placeholder=\"검색어를 입력하세요..\">\r\n");
      out.write("					<div class=\"search_icon\">\r\n");
      out.write("						<img src=\"../../img/search_icon.png\" alt=\"search_icon\">\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"right_tool\">\r\n");
      out.write("					<div class=\"user_icon\">\r\n");
      out.write("						<a href=\"/LINKER/jsp/order/order.jsp.users\"><img src=\"../../img/user_icon.png\" alt=\"user_icon\"></a>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"bucket_icon\">\r\n");
      out.write("						<a href=\"/LINKER/jsp/cart/cart.jsp.users\"><img src=\"../../img/cart_icon.png\" alt=\"cart_icon\"></a>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- </div> -->\r\n");
      out.write("	</header>\r\n");
      out.write("	<div id=\"header_bottom_line\"></div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("  <section>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>고객센터 사이드바</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../../css/sidebar.css\">\r\n");
      out.write("        \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"side_inner_body\">\r\n");
      out.write("        <div class=\"side_bar\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><strong>고객센터</strong></li>\r\n");
      out.write("                <li><a href=\"/LINKER/jsp/menu/faq.jsp.users\">FAQ</a></li>\r\n");
      out.write("                <li><a href=\"#\">1:1 문의</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"faq-container\">\r\n");
      out.write("    <h3>자주하는 질문 (FAQ)</h3>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"faq-section\">\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li>\r\n");
      out.write("          <button class=\"faq-question\">키링 주문은 어떻게 하나요?\r\n");
      out.write("            <span class=\"faq-date\">2025-03-18</span>\r\n");
      out.write("          </button>\r\n");
      out.write("          <p class=\"faq-answer\">상품을 선택하고, 디자인 옵션을 선택한 후, 장바구니에 담고 결제를 완료하면 주문이 완료됩니다.</p>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("          <button class=\"faq-question\">맞춤형 디자인도 가능한가요?\r\n");
      out.write("            <span class=\"faq-date\">2025-03-18</span>\r\n");
      out.write("          </button>\r\n");
      out.write("          <p class=\"faq-answer\">네, 고객님이 원하는 디자인을 업로드하여 맞춤형 키링을 제작할 수 있습니다.</p>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <button class=\"faq-question\">배송은 얼마나 걸리나요?\r\n");
      out.write("                <span class=\"faq-date\">2025-03-18</span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <p class=\"faq-answer\">일반적으로 제작 후 3~5일 이내에 배송됩니다. 단, 맞춤형 디자인의 경우 제작 시간이 더 걸릴 수 있습니다.</p>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <button class=\"faq-question\">키링이 손상되었어요, 어떻게 해야 하나요?\r\n");
      out.write("                <span class=\"faq-date\">2025-03-18</span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <p class=\"faq-answer\">상품을 수령하신 후 7일 이내에 교환 요청을 해주시면, 상태를 확인 후 교환이 가능합니다.</p>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <button class=\"faq-question\">디자인이 마음에 들지 않으면 환불 가능한가요?\r\n");
      out.write("                <span class=\"faq-date\">2025-03-18</span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <p class=\"faq-answer\">맞춤형 제품은 주문 후 제작되기 때문에 환불이 어려운 점 양해 부탁드립니다. 다만, 불량품은 교환 가능합니다.</p>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <button class=\"faq-question\">도매 주문도 가능한가요?\r\n");
      out.write("                <span class=\"faq-date\">2025-03-18</span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <p class=\"faq-answer\">네, 대량 주문에 대해서는 할인 혜택이 제공됩니다. 문의하기 페이지를 통해 자세한 사항을 확인해주세요.</p>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<footer class=\"footer\">\r\n");
      out.write("                <div class=\"footer_box\">\r\n");
      out.write("                    <ul class=\"footer_menu\">\r\n");
      out.write("                        <li><a href=\"#\">이용후기</a></li>\r\n");
      out.write("                        <li><a href=\"#\">마이페이지</a></li>\r\n");
      out.write("                        <li><a href=\"#\">이용약관</a></li>\r\n");
      out.write("                        <li><a href=\"#\">개인정보처리방침</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"line\">\r\n");
      out.write("                        <div class=\"line_top\">\r\n");
      out.write("                            <p class=\"line_top_p\">(주)링커 | 서울시 강남구 | 미니플젝 : 링커 | 개인정보관리책임자 : 손유경 | 사업자등록번호 : 123-45-67890\r\n");
      out.write("                            </p>\r\n");
      out.write("                            <p class=\"line_top_p\"> : 2025-서울강남-1234 | 유료직업소개사업등록번 호 : 제2025-1234567-89-0-12345호 | 고객센터 :\r\n");
      out.write("                                1234-5678 | 호스팅 사업자: Amazon Web Service(AWS)</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"line_bottom\">\r\n");
      out.write("                            <p class=\"line_bottom_p\">(주)링커는 통신판매중개자이며, 통신판매의 당사자가 아닙니다. 상품, 상품정보, 거래에 관한 의무와 책임은 판매회원에게\r\n");
      out.write("                                있습니다.</p>\r\n");
      out.write("                            <p class=\"line_bottom_p\">(주)링커 사이트의 상품/전문가/이벤트 정보, 디자인 및 화면의 구성, UI 등의 무단복제, 배포, 방송 또는 전송,\r\n");
      out.write("                                스크래핑 등의 행위는 저작권법, 콘텐츠산업 진흥법 등 관련법령에 의하여 엄격히 금지됩니다.</p>\r\n");
      out.write("                            <p class=\"line_bottom_p\">Copyright © 2025 Jongsu Macne. All rights reserved.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </footer>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
