package exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JoinServlet
 */
@WebServlet("/insertMember2")
public class JoinServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String user_name = request.getParameter("user_name");
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		String phoneNumF = request.getParameter("user_phone_frt");
		String phoneNumM = request.getParameter("user_phone_mid");
		String phoneNumE = request.getParameter("user_phone_end");
		
		String grade = request.getParameter("grade");
		
		String[] interest = request.getParameterValues("interest");
		
		String dept = request.getParameter("dept");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html><head></head><body>");
		
		out.println("<h3>회원 가입 내용</h3>");
		
		out.println("이름 : " + user_name + "<br>");
		out.println("아이디 : " + user_id + "<br>");
		out.println("비번 : " + user_pw + "<br>");
		out.println("학년 : " + grade + "<br>");
		out.print("관심 분야 : ");
		for(String inter : interest) {
			System.out.print(inter + " ");
		}
		out.println("<br>");
		out.println("학과 : " + dept);
		out.println("</body></html>");
	}

}
