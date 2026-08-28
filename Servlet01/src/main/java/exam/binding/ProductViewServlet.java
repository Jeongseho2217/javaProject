package exam.binding;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 처리된 데이터를 Attribute로 전송 받아서 응답데이터로 변환 후 응답 처리
 */
@SuppressWarnings("unchecked")
@WebServlet("/prdview")
public class ProductViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		ArrayList<ProductVo> prdList = (ArrayList<ProductVo>)request.getAttribute("prdList");
		
		// 응답처리
		out.print("<html><head></head><body>");
		out.print("<table border=1><tr align='center' bgcolor='gold'>");
		out.print("<td>제품번호</td><td>제품명</td><td>가격</td><td>수량</td><td>삭제</td>");
		
		for(int i=0; i<prdList.size(); i++) {
			ProductVo vo = prdList.get(i);
			String no = vo.getPrdNo();
			String name = vo.getPrdName();
			int price = vo.getPrdPrice();
			int stock = vo.getPrdStock();
			
			out.print("<tr><td>" + no + "</td><td>" + name + "</td><td>" + price + "</td><td>" + stock + "</td><td>" + "<a href = '/Servlet01/prductDelete?id=" + no + "'>삭제</a></td></tr>");
		}
		
		out.print("</body></html>");
	}

}
