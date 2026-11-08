package com.kodewala01.Bean;

import java.time.LocalDateTime;

public class ClassWhoseObjetcCreated {
     
	
	static {
		System.out.println("\n\nWishMessageGenerator.class file is loading...");
	}
  
	// HAS-A[Inbuilt type]
	private LocalDateTime ldt;
	private String user;
	
	public ClassWhoseObjetcCreated(LocalDateTime ldt , String user) {
		super();
		// if we forget to do this this will cause null pointer exception 
		this.ldt=ldt;
		this.user=user;
		System.out.println("WishMessageGenerator Object created using Constructor..");
		//wishMessage(user);
	}

	
	//private LocalDateTime ldt;

	public LocalDateTime getLdt() {
		return ldt;
	}

	// Business logic
	public String wishMessage() {
		System.out.println("WishMessageGenerator.wishMessage()");
		int hour = ldt.getHour();
		String msg = "";

		if (hour < 12) {
			msg += "Good Morning ::" + user;
		} else if (hour < 16) {
			msg += "Good Afternoon :: " + user;
		} else if (hour < 20) {
			msg += "Good Evening :: " + user;
		} else {
			msg += "Good Night :: " + user;
		}
		return msg;
	}

	@Override
	public String toString() {
		return "WishMessageGenerator [ldt=" + ldt + "]";
	}
	
}
