package exam.ojdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("unchecked")
@WebServlet(name = "ProductViewServlet", urlPatterns = { "/productView" })
public class ProductViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		ArrayList<ProductVO> prdList = (ArrayList<ProductVO>)request.getAttribute("prdList");
		
		// 응답처리
		out.print("<html><head></head><body>");
		out.print("<table border=1><tr align='center' bgcolor='gold'>");
		out.print("<td>제품번호</td><td>제품명</td><td>가격</td><td>재고</td><td>삭제</td>");
		
		for(int i=0; i<prdList.size(); i++) {
			ProductVO vo = prdList.get(i);
			String no = vo.getPrdNo();
			String name = vo.getPrdName();
			int price = vo.getPrdPrice();
			int stock = vo.getPrdStock();
			
			// 한행씩 테이블에 포함
			out.print("<tr><td>" + no + "</td><td>" + name + "</td><td>" + price + "</td><td>" + stock + "</td><td>" + "<a href = '/Servlet01/memberDelete?id=" + no + "'>삭제</a></td></tr>");
		}
		
		out.print("</table></body></html>");
		out.close();
	}
}
