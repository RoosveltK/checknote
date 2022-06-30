package com.servlet.checknote_final;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SendSMS {
	public static final String ACCOUNT_SID = "AC9be83ce7e83abd400d2336be823d4a54";
	public static final String AUTH_TOKEN = "7b6a22b764d20657792e06e3f3ab712d";
	String delano_key="+18125062855";
	

	static String phone_ken ="+19855099156";
	public static final String ACCOUNT_SID_K = "AC4816ffd1fb2551bcd83ca216a31f5cf2";
	public static final String AUTH_TOKEN_K = "c9997f83081ea70aa19696756c1a5ea3";
	public static void sendSms(String number, String msg) {
		Twilio.init(ACCOUNT_SID_K, AUTH_TOKEN_K);

		Message message = Message.creator(new PhoneNumber(number), new PhoneNumber(phone_ken), msg).create();
	}
}

