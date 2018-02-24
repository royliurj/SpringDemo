package com.roy.spring.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("bookShopService")
public class BookShopServiceImpl implements BookShopService {

	@Autowired
	public BookShopDao bookShopDao;
		
	@Override
	@Transactional(propagation= Propagation.REQUIRES_NEW, isolation=Isolation.READ_COMMITTED,noRollbackFor= {UserAccountException.class})
	public void purchase(String username, String isbn) {
		
		int price = bookShopDao.findBookPriceByIsbn(isbn);
		
		bookShopDao.updateBookStock(isbn);
		
		bookShopDao.updateUserAccount(username, price);		
		
		System.out.println("aaa");
	}

}
