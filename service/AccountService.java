package service;

import java.util.ArrayList;

import domain.AccountBean;


/**
 * @author JeongUk-Bae
 * @date 2018. 12. 26.
 * @desc 은행계좌 
 */
public interface AccountService {
	//String accountNum, today;
	//int money;
	
	/**
	 * CREATE
	 * */
	public void createAccountNum(int money); //신규생성
	public String createAccountNum(); //계좌번호
	
	/**
	 * READ
	 * */
	public ArrayList<AccountBean> findByAll(); //계좌 금액 확인
	public AccountBean findByAccountNem(String accountNum); //계좌 금액 확인
	public int countAccount();
	public boolean existAccountNum(String accountNum);
	public String findDate();//날짜
	public AccountBean today(); 
	
	
	/**
	 * UPDATE
	 * */
	public void withdrawMoney(String accountNum,int money); //출금
	public void depositMoney(String accountNum,int money); //입금
	
	/**
	 * DELETE
	 * */
	public void deleteAccountNum(String accountNum);
	
	
}
