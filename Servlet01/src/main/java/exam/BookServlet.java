package exam;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 클라이언트가 form 태그 통해 전송한 데이터(파라미터)를 추출해서 처리
 */
@WebServlet("/bookInsert")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void init() throws ServletException {
		System.out.print("객체 생성:");
	}
	
	/**
	 * form 메소드 포스트 요청 처리
	 * 1개의 파라미터 value를 추출할 때 사용 : getParameter (input type text password, radio 1개 값 전송/checkbox같은 여러개 가능할땐 첫 값 하나만 반환)
	 * 동일 파라미터명으로 여러개의 파라미터가 전송되면 getParameter는 처음 보이는 파라미터 값만 반환
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		//클라이언트가 전송한 데이터 추출 HttpServletRequest.getParameter(name);
		String book_no = request.getParameter("book_no");
		String book_title = request.getParameter("book_title");
		String book_author = request.getParameter("book_author");
		String book_price = request.getParameter("book_price");
		String book_year = request.getParameter("book_year");
		String book_month = request.getParameter("book_month");
		String book_day = request.getParameter("book_day");
		String book_stock = request.getParameter("book_stock");
		String pub_no = request.getParameter("pub_no");
		
		System.out.println("도서번호 : " + book_no);
		System.out.println("도서명 : " + book_title);
		System.out.println("저자 : " + book_author);
		System.out.println("가격 : " + book_price);
		System.out.println("발행일 : " + book_year + "-" + book_month + "-" + book_day);
		System.out.println("재고 : " + book_stock);
		System.out.println("출판사 번호 : " + pub_no);
	}

}
