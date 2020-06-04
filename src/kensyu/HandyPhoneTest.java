package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HandyPhoneTest extends HandyPhone {

	@Test
	void test1() {
		HandyPhone handy = new HandyPhone();
		handy.mailAddress = "abc@aaa.com";
		Assertions.assertEquals("abc@aaa.com", handy.mailAddress);

	}

	@Test
	void test2() {
		HandyPhone handy = new HandyPhone();
		handy.mailAddress = "abc@aaa.com";
		Assertions.assertEquals("abc@aaa.comからmyfriend@zzz.yyy.comへメールしました。", handy.mail("myfriend@zzz.yyy.com"));

	}

	@Test
	void test3() {
		HandyPhone handy = new HandyPhone();
		handy.no = "111-111-1111";
		handy.mailAddress = "abc@aaa.com";
		Assertions.assertEquals("電話番号=111-111-1111, メールアドレス=abc@aaa.com", handy.info());

	}

}
