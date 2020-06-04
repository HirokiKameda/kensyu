package kensyu;

public class HandyPhone extends Phone {

	String mailAddress;

	String mail(String to) {
		return this.mailAddress + "から" + to + "へメールしました。";
	}

	String info() {
		return "電話番号=" + this.no + ", メールアドレス=" + this.mailAddress;
	}

}
