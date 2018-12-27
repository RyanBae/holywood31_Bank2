package domain;

/**
 * @author JeongUk-Bae
 * @date 2018. 12. 26.
 * @desc 은행계좌 빈객체
 */
public class AccountBean {
	private String accountNum, today;
	private int money;
	

	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	
	public String getToday() {
		return today;
	}
	public void setToday(String today) {
		this.today = today;
	}

	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	@Override
		public String toString() {
			return String.format("\n[계좌정보]\n"
					+ "계좌번호: %s\n"
					+ "생성일: %s\n"
					+ "계좌잔액: %s",accountNum,today,money);
		}
}
