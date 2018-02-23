package com.roy.spring.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("bookShopDao")
public class BookShopDaoImpl implements BookShopDao {

	@Autowired
	private JdbcTemplate JdbcTemplate;
	
	@Override
	public int findBookPriceByIsbn(String isbn) {
		String sql = "select price from book where isbn = ?";
		return JdbcTemplate.queryForObject(sql, Integer.class, isbn);
	}

	@Override
	public void updateBookStock(String isbn) {
		//¼ì²éÊéµÄ¿â´æ
		String sqlCheck = "select stock from book_stock where isbn = ?";
		int stock = JdbcTemplate.queryForObject(sqlCheck, Integer.class, isbn);
		if(stock == 0)
		{
			throw new BookStockException("¿â´æ²»×ã£¡");
		}		
		String sql = "update book_stock set stock = stock - 1 where isbn = ?";
		JdbcTemplate.update(sql, isbn);		
	}

	@Override
	public void updateUserAccount(String username, int price) {
		String sqlCheck = "select balance from account where username = ?";
		int balance = JdbcTemplate.queryForObject(sqlCheck, Integer.class, username);
		if(balance < price)
		{
			throw new UserAccountException("Óà¶î²»×ã");
		}
		
		String sql = "update account set balance = balance - ? where username = ?";
		
		JdbcTemplate.update(sql, price, username);		
	}

}
