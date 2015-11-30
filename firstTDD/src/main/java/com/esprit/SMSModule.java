package com.esprit;

/**
 * cette interface decrit un sms
 * @author PC-HP
 *
 */

public interface SMSModule {
	
	
	/**
	 * send an sms
	 * 
	 * @param number
	 * <p>phone number
	 * @param message
	 */
	void send(String number,String message);
    Boolean isReady();

}
