package exam;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class bookServlet
 */
@WebServlet("/bookInsert")
public class bookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
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
