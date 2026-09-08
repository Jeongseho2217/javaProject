package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.ProductDAO;
import model.ProductVO;

@WebServlet("/product/*")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductDAO productDAO;

	public void init() throws ServletException {
		productDAO = new ProductDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		// 1. 로그인 인증 검증 (세션 체크)
		HttpSession session = request.getSession(false);
		Boolean isLogOn = (session != null) ? (Boolean) session.getAttribute("isLogOn") : null;

		if (isLogOn == null || !isLogOn) {
			response.sendRedirect(request.getContextPath() + "/member/listMembers.do");
			return;
		}
		
		String action = request.getPathInfo();
		System.out.println("Product action : " + action);

		String nextPage = null;

		if (action == null || action.equals("/listProduct.do")) {
			List<ProductVO> productList = productDAO.listProducts();
			request.setAttribute("productList", productList);
			nextPage = "/view/listProduct.jsp";

		} else if (action.equals("/prdForm.do")) {
			nextPage = "/view/prdForm.jsp";

		} else if (action.equals("/addProduct.do")) {
			String prdNo = request.getParameter("prdNo");
			String prdName = request.getParameter("prdName");
			int prdPrice = Integer.parseInt(request.getParameter("prdPrice"));
			int prdStock = Integer.parseInt(request.getParameter("prdStock"));

			ProductVO vo = new ProductVO(prdNo, prdName, prdPrice, prdStock);
			productDAO.addProduct(vo);

			response.sendRedirect(request.getContextPath() + "/product/listProduct.do");
			return;

		} else if (action.equals("/prdView.do")) {
			String prdNo = request.getParameter("prdNo");
			ProductVO vo = productDAO.findProduct(prdNo);

			request.setAttribute("product", vo);
			nextPage = "/view/prdView.jsp";
			
		} else if (action.equals("/modProduct.do")) {
			String prdNo = request.getParameter("prdNo");
			String prdName = request.getParameter("prdName");
			int prdPrice = Integer.parseInt(request.getParameter("prdPrice"));
			int prdStock = Integer.parseInt(request.getParameter("prdStock"));

			ProductVO vo = new ProductVO(prdNo, prdName, prdPrice, prdStock);
			productDAO.modProduct(vo);

			response.sendRedirect(request.getContextPath() + "/product/listProduct.do");
			return;

		} else if (action.equals("/delProduct.do")) {
			String prdNo = request.getParameter("prdNo");
			productDAO.delProduct(prdNo);

			response.sendRedirect(request.getContextPath() + "/product/listProduct.do");
			return;

		} else {
			List<ProductVO> productList = productDAO.listProducts();
			request.setAttribute("productList", productList);
			nextPage = "/view/listProduct.jsp";
		}

		RequestDispatcher dispatch = request.getRequestDispatcher(nextPage);
		dispatch.forward(request, response);
	}
}