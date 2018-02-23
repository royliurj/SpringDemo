package com.roy.spring.tx;

import static org.hamcrest.CoreMatchers.nullValue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("bookShopService")
public class BookShopServiceImpl implements BookShopService {

	@Autowired
	public BookShopDao bookShopDao;
	
	@Override
	@Transactional
	public void purchase(String username, String isbn) {
		
		int price = bookShopDao.findBookPriceByIsbn(isbn);
		
		bookShopDao.updateBookStock(isbn);
		
		bookShopDao.updateUserAccount(username, price);
		
	}

}
