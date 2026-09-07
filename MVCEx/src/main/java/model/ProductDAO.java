package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.Util;

public class ProductDAO {
	public ArrayList<ProductDTO> productSelect() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<ProductDTO> prdList = new ArrayList<ProductDTO>();
		
		try {
			con = Util.getConn();
			String query = "select * from member";
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				String no = rs.getString("prdNo");
				String name = rs.getString("prdName");
				int price = rs.getInt("prdPrice");
				int stock = rs.getInt("prdStock"); 
				String pNo = rs.getString("pubNo"); 
				
				ProductDTO vo = new ProductDTO();
				vo.setPrdNo(no);
				vo.setPrdName(name);
				vo.setPrdPrice(price);
				vo.setPrdStock(stock);
				vo.setPubNo(pNo);
				
				prdList.add(vo);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return prdList;
	}
}
