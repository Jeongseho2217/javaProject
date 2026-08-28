package servlet01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
    }

	/**
	 * 객체 생성 시 한번 호출
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("두번째 서블릿 init");
	}

	/**
	 * 코드 업데이트 또는 서버 종료시 한번 호출
	 */
	public void destroy() {
		System.out.println("두번째 서블릿 destroy");
	}

	/**
	 * 클라이언트 get 요청이 올때마다 호출
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("두번째 서블릿 doGet");
	}

}
