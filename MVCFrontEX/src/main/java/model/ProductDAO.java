package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ProductDAO {
	private DataSource dataFactory;

	public ProductDAO() {
		try {
			Context ctx = new InitialContext();
			Context envCtx = (Context) ctx.lookup("java:/comp/env");
			this.dataFactory = (DataSource) envCtx.lookup("jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 상품 목록 조회
	public List<ProductVO> listProducts() {
		List<ProductVO> productList = new ArrayList<>();
		String query = "SELECT * FROM product ORDER BY prdno";

		try (Connection conn = dataFactory.getConnection();
			 PreparedStatement pstmt = conn.prepareStatement(query);
			 ResultSet rs = pstmt.executeQuery()) {

			while (rs.next()) {
				String prdNo = rs.getString("prdno");
				String prdName = rs.getString("prdname");
				int prdPrice = rs.getInt("prdprice");
				int prdStock = rs.getInt("prdstock");

				ProductVO vo = new ProductVO(prdNo, prdName, prdPrice, prdStock);
				productList.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return productList;
	}

	// 단일 상품 조회
	public ProductVO findProduct(String _prdNo) {
		ProductVO vo = null;
		String query = "SELECT * FROM product WHERE prdno = ?";

		try (Connection conn = dataFactory.getConnection();
			 PreparedStatement pstmt = conn.prepareStatement(query)) {

			pstmt.setString(1, _prdNo);

			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					String prdNo = rs.getString("prdno");
					String prdName = rs.getString("prdname");
					int prdPrice = rs.getInt("prdprice");
					int prdStock = rs.getInt("prdstock");

					vo = new ProductVO(prdNo, prdName, prdPrice, prdStock);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;
	}

	// 상품 등록
	public void addProduct(ProductVO vo) {
		String query = "INSERT INTO product (prdno, prdname, prdprice, prdstock) VALUES (?, ?, ?, ?)";

		try (Connection conn = dataFactory.getConnection();
			 PreparedStatement pstmt = conn.prepareStatement(query)) {

			pstmt.setString(1, vo.getPrdNo());
			pstmt.setString(2, vo.getPrdName());
			pstmt.setInt(3, vo.getPrdPrice());
			pstmt.setInt(4, vo.getPrdStock());

			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 상품 정보 수정
	public void modProduct(ProductVO vo) {
		String query = "UPDATE product SET prdname = ?, prdprice = ?, prdstock = ? WHERE prdno = ?";

		try (Connection conn = dataFactory.getConnection();
			 PreparedStatement pstmt = conn.prepareStatement(query)) {

			pstmt.setString(1, vo.getPrdName());
			pstmt.setInt(2, vo.getPrdPrice());
			pstmt.setInt(3, vo.getPrdStock());
			pstmt.setString(4, vo.getPrdNo());

			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 상품 삭제
	public void delProduct(String prdNo) {
		String query = "DELETE FROM product WHERE prdno = ?";

		try (Connection conn = dataFactory.getConnection();
			 PreparedStatement pstmt = conn.prepareStatement(query)) {

			pstmt.setString(1, prdNo);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}