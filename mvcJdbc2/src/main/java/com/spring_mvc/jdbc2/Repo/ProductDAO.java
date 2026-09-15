package com.spring_mvc.jdbc2.Repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring_mvc.jdbc2.dto.ProductDTO;

@Repository
public class ProductDAO {
	
	private DataSource dataFactory;
	
	@Autowired
	public ProductDAO(DataSource dataSource) {
		try {
			this.dataFactory = dataSource; //dbcp가 연동
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// 회원정보 조회 : 전체 회원정보 select해서 반환
	public ArrayList<ProductDTO> memberSelect() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		// 데이터 저장해서 반환할 ArrayList 객체
		ArrayList<ProductDTO> prdList = new ArrayList<ProductDTO>();
		
		try {
			System.out.println("Check");
			con = dataFactory.getConnection(); // db con 객체 connection pool로부터 할당
			
			String sql = "select * from product";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String prdNo = rs.getString("prdNo");
				String prdName = rs.getString("prdName");
				int prdPrice = rs.getInt("prdPrice");
				int prdStock = rs.getInt("prdStock");
				
				ProductDTO dto = new ProductDTO();
				dto.setPrdNo(prdNo);
				dto.setPrdName(prdName);
				dto.setPrdPrice(prdPrice);
				dto.setPrdStock(prdStock);
				prdList.add(dto);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				System.out.println("con : " + con);
				rs.close();
				pstmt.close();
				con.close();
			} catch(Exception e) {
				
			}
		}
		return prdList;
	}
}
