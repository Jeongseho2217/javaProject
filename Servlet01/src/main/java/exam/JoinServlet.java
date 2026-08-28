package exam;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JoinServlet
 */
@WebServlet("/insertMember")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JoinServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String user_name = request.getParameter("user_name");
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		String phoneNumF = request.getParameter("user_phone_frt");
		String phoneNumM = request.getParameter("user_phone_mid");
		String phoneNumE = request.getParameter("user_phone_end");
		
		String grade = request.getParameter("grade");
		
		String[] subject = request.getParameterValues("subject");
		
		String dept = request.getParameter("dept");
		
		System.out.println("이름 : " + user_name);
		System.out.println("아이디 : " + user_id);
		System.out.println("비번 : " + user_pw);
		System.out.println("학년 : " + grade);
		System.out.print("관심 분야 : ");
		for(String sub : subject) {
			System.out.print(sub + " ");
		}
		System.out.print("학과 : " + dept);
	}

}
