package controller;

import javax.swing.JOptionPane;

import domain.AccountBean;
import domain.ArticleBean;
import domain.MemberBean;
import service.AccountService;
import service.AccountServiceImpl;
import service.ArticleService;
import service.ArticleServiceImpl;
import service.MemberService;
import service.MemberServiceImpl;

public class BankController {
	public void start() {
		MemberBean memberBean = null;
		MemberService memberService = new MemberServiceImpl();
		AccountBean accountBean = null;
		AccountService accountService = new AccountServiceImpl();
		ArticleBean articleBean = null;
		ArticleService articleservice = new ArticleServiceImpl();
		
		while (true) {
			switch (JOptionPane.showInputDialog("[메뉴] 0.종료 \n" + "1.회원가입 2.회원목록조회 3.이름으로 ID찾기 4.ID로 가입자 찾기\n"
					+ "5.이름과 주민번호로 찾기 6.로그인 7.비밀번호변경 8.회원탈퇴\n\n" + "9.계좌생성 10.계좌확인 11.계좌확인 12.출금 13.입금"
							+ "14.게시글작성 15.게시글찾기 16.작성자로 찾기 17.게시글수정 18.게시글삭제")) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료합니다.");
				return;
			case "1":
				memberService.createMember(JOptionPane.showInputDialog("ID입력"), JOptionPane.showInputDialog("이름입력"),
						JOptionPane.showInputDialog("주민번호입력"), JOptionPane.showInputDialog("비밀번호입력"));
				JOptionPane.showMessageDialog(null, "가입이 완료 되었습니다.");
				break;
			case "2":
				JOptionPane.showMessageDialog(null, memberService.findByAll());
				break;
			case "3":
				JOptionPane.showMessageDialog(null,
						memberService.findByName(JOptionPane.showInputDialog("찾으실 이름을 입력하세요. ")));
				break;
			case "4":
				JOptionPane.showMessageDialog(null,
						memberService.findById(JOptionPane.showInputDialog("찾으실 ID를 입력하세요.")));
				break;
			case "5":
				JOptionPane.showMessageDialog(null, memberService.findBySsn(JOptionPane.showInputDialog("이름을 입력하세요."),
						JOptionPane.showInputDialog("주민번호를 입력하세요")));
				break;
			case "6":
				boolean ch = memberService.existMember(JOptionPane.showInputDialog("ID입력"),
						JOptionPane.showInputDialog("비밀번호입력"));
				JOptionPane.showMessageDialog(null, (ch) ? "로그인성공" : "로그인실패");
				break;
			case "7":
				memberService.changePass(JOptionPane.showInputDialog("아이디입력"), JOptionPane.showInputDialog("비밀번호입력"),
						JOptionPane.showInputDialog("새로운 비밀번호 입력"));
				break;
			case "8":
				memberService.deleteMember(JOptionPane.showInputDialog("아이디입력"), JOptionPane.showInputDialog("비밀번호입력"));

				break;
			case "9":
				accountService.createAccountNum(Integer.parseInt(JOptionPane.showInputDialog("금액입력")));
				JOptionPane.showMessageDialog(null, "계좌가 생성되었습니다.");
				break;
			case "10":
				JOptionPane.showMessageDialog(null, accountService.findByAll());
				break;
			case "11":
				JOptionPane.showMessageDialog(null,
						accountService.existAccountNum(JOptionPane.showInputDialog("계좌번호 입력")));
				break;
			case "12":
				String accountNum = JOptionPane.showInputDialog("계좌입력");
				String money = JOptionPane.showInputDialog("출금액을 입력해주세요.");
				accountService.withdrawMoney(accountNum, Integer.parseInt(money));
				break;
			case "13":break;
			case "14":
				articleservice.createArticle(JOptionPane.showInputDialog("제목입력"),
						JOptionPane.showInputDialog("내용입력"),
						JOptionPane.showInputDialog("작성자입력"),
						JOptionPane.showInputDialog("비밀번호입력"));
				JOptionPane.showMessageDialog(null,"작성되었습니다.");
				break;
			case "15":
				JOptionPane.showMessageDialog(null,articleservice.list());
				
				break;
			case "16" :
				JOptionPane.showMessageDialog(null,
						articleservice.findByWriter(JOptionPane.showInputDialog("작성자 이름")));
				break;
			}
		}
	}// area
}// field
