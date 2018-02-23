package com.roy.spring.assemblingBean;

import org.springframework.stereotype.Component;

@Component("loneylyHeartsClub")
public class SgtPeppers implements CompactDisc {

	private String title = "aaa";
	private String artist = "bbb";
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing " + title + " by " + artist);	
		
	}

}
