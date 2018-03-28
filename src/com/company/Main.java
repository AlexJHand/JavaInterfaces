package com.company;

public class Main {

    public static void main(String[] args) {
	    ITelephone alexsPhone;
	    alexsPhone = new DeskPhone(55512345);
	    alexsPhone.powerOn();
	    alexsPhone.callPhone(55512345);
	    alexsPhone.answer();

	    alexsPhone = new MobilePhone(24545);
	    alexsPhone.powerOn();
	    alexsPhone.callPhone(24545);
        alexsPhone.answer();
    }
}
