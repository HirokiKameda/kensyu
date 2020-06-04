package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PhoneTest extends Phone {

	@Test
	void test1() {
		Phone phone = new Phone();
		phone.no = "03-1234-5555";
		Assertions.assertEquals("03-1234-5555", phone.no);
	}

	@Test
	void test2() {
		Phone phone = new Phone();
		phone.no = "03-1234-5555";
		Assertions.assertEquals("03-1234-5555から0120-777-999へ電話しました。", phone.tell("0120-777-999"));
	}

}
