package com.roy.spring.assemblingBean;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.roy.spring.assemblingBean.Test.TestBean;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {
		
	@Autowired
	private CompactDisc cd;
	
	@Autowired
	private TestBean tb;
	
	@Autowired
	private MediaPlayer player;
	
	@Test
	public void player() {
		player.play();
	}
	
	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);
	}
	
	@Test
	public void tbShouldBeNull() {
		assertNotNull(tb);
	}
}
