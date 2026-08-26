package servlet01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * https://도메인:포트/context/파일명/(매핑된 url)
 * 자바Http 패키지) 제공 어노테이션 통해서 현재 서블릿 클래스를 요청할 때 사용할 이름 결정함
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 * Service()메서드에 자동으로 호출되는 메서드
	 * 메모리에 올라올 때 한번 호출
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Init 메소드 호출 수정");
	}

	/**
	 * @see Servlet#destroy()
	 * 메모리에서 삭제될 때 한번 호출
	 * 서블릿 업데이트 되는 경우 destroy 메소드 호출하고 서블릿 업데이트 후 객체 생성
	 */
	public void destroy() {
		System.out.println("Destroy 메소드 호출 수정");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * service() 메소드에 의해 호출 됨
	 * service() : main() 메소드와 같은 역할 web container에 의해 자동 호출
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 메소드 호출");
	}
}
