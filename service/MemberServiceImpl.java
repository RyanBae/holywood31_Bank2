package service;

import domain.MemberBean;

/**
 * @author JeongUk-Bae
 * @date 2018. 12. 26.
 * @desc 맴버기능구현
 */
public class MemberServiceImpl implements MemberService {
	private MemberBean[] members;
	private int count;
	
	public MemberServiceImpl(){
		members = new MemberBean[10];
		count = 0;
	}
	/**
	 * CREATE
	 * */
	@Override
	public void createMember(String id, String name, String ssn, String pass) {
		MemberBean memberBean = new MemberBean();
		memberBean.setId(id);
		memberBean.setName(name);
		memberBean.setSsn(ssn);
		memberBean.setPass(pass);
		members[count] = memberBean;
		count++;
		
	}
	@Override
	public MemberBean[] findByAll() {
		return members;
	}
	@Override
	public MemberBean[] findByName(String name) {
		int j=0;
		for(int i=0; i<count; i++) {
			if(members[i].getName().equals(name)) {
				j++;
			}
		}
//		MemberBean memberBean = new MemberBean();
		MemberBean[] beans = new MemberBean[j];
		j = 0;
		for(int i=0; i<count; i++) {
			if(members[i].getName().equals(name)) {
				beans[j] = members[i];
				j++;
				if(j==beans.length) {
					break;
				}
			}
		}
		return beans;
	}
	@Override
	public MemberBean findById(String id) {
		MemberBean memberBean = new MemberBean();
		for(int i=0; i<count; i++) {
			if(members[i].getId().equals(id)) {
				memberBean = members[i];
				break;
			}
		}
		return memberBean;
	}
	@Override
	public boolean findBySsn(String name, String ssn) {
	/*	boolean checkssn = false;
		for(int i=0; i<count; i++) {
			if(members[i].getName().equals(name)&&
					members[i].getSsn().equals(ssn)) {
				checkssn = true;
				break;
			}
		}*/
		return false;
	}
	@Override
	public MemberBean checkPass(String id, String pass) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int countMember() {
		// TODO Auto-generated method stub
		return count;
	}
	@Override
	public boolean existMember(String id, String pass) {
		MemberBean memberBean = new MemberBean();
		boolean ch = false;
		for(int i=0; i<count; i++) {
			if(memberBean.getId().equals(id) 
					&& memberBean.getPass().equals(pass)) {
				ch = true;
				break;
			}
		}
		
		return ch;
	}
	@Override
	public void changePass(String id, String pass, String newpass) {
		for(int i = 0;i<count;i++) {
			if(existMember(id, pass)) {
				members[i].setPass(newpass);
			}
		}
		
	}
	@Override
	public void deleteMember(String id, String pass) {
		for(int i=0;i<count;i++) {
			if(existMember(id, pass)) {
				members[i] = members[count-1];
				members[count-1] = null;
				count--;
				break;
			}
		}
		
	}

}
