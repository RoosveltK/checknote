package com.servlet.checknote_final;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SendSMS {
	public static final String ACCOUNT_SID = "AC9be83ce7e83abd400d2336be823d4a54";
	public static final String AUTH_TOKEN = "7b6a22b764d20657792e06e3f3ab712d";

	public static void sendSms(String number, String msg) {
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

		Message message = Message.creator(new PhoneNumber(number), new PhoneNumber("+18125062855"), msg).create();
	}
}

