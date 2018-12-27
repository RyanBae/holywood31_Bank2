package service;
import domain.MemberBean;

public interface MemberService {
	//String id, name, ssn, pass
	
	/**
	 * CREATE
	 * */
	public void createMember(String id, String name, String ssn, String pass);
	
	/**
	 * READ
	 * */
	
	public MemberBean[] findByAll(); //전체 회원
	public MemberBean[] findByName(String name); //이름으로 찾기
	public MemberBean findById(String id); //아이디 보기
	public boolean findBySsn(String name, String ssn); // 이름, 주민번호로 가입된 id 찾기
	public MemberBean checkPass(String id, String pass); //비밀번호 확인
	public int countMember();  // 가입수
	public boolean existMember(String id, String pass); //로그인
	
	/**
	 * UPDATE
	 * */
	public void changePass(String id, String pass, String newpass); //비번변경
	
	/**
	 * DELETE
	 * */
	public void deleteMember(String id, String pass); 
	
	
}
