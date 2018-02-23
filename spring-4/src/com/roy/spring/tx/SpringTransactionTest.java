package com.roy.spring.tx;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class SpringTransactionTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	private ApplicationContext ctx = null;
	private BookShopDao bookShopDao = null;
	private BookShopService bookShopService = null;
	
	{
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		bookShopDao = (BookShopDao) ctx.getBean("bookShopDao");
		bookShopService = ctx.getBean(BookShopService.class);
	}
	
	@Test
	public void testBookShopDaoFindPriceByIsbn() {
		System.out.println(bookShopDao.findBookPriceByIsbn("1001"));
	}

	@Test
	public void testBookShopDaoUpdateBookStock() {
		bookShopDao.updateBookStock("1001");
	}
	
	@Test
	public void testBookShopDaoUpdateUserAccount() {
		bookShopDao.updateUserAccount("aa", 160);
	}
	
	@Test
	public void testBookShopService() {
		bookShopService.purchase("aa", "1001");
	}
}
