package exam.binding;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductBindingServlet
 */
@WebServlet("/prdbinding")
public class ProductBindingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductVo vo1 = new ProductVo("1", "TV", 1000, 3);
		ProductVo vo2 = new ProductVo("2", "노트북", 3000, 5);
		
		ArrayList<ProductVo> prdList = new ArrayList<>();
		prdList.add(vo1);
		prdList.add(vo2);
		
		request.setAttribute("prdList", prdList);
		
		RequestDispatcher dispatch = request.getRequestDispatcher("prdview");
		dispatch.forward(request, response);
	}
}
