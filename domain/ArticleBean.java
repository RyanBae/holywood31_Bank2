package domain;

public class ArticleBean {
	private int seq; // 글번호
	private String title, content, writer, redDate, pass;
	
	public int getSeq() {
		return seq; //1000부터 1씩 증가
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getRedDate() {
		return redDate;
	}
	public void setRedDate(String redDate) {
		this.redDate = redDate;
	}
	@Override
	public String toString() {
		return String.format("게시글 번호: %s\n" 
				+ "제목: %s\n"
				+ "내용: %s\n"
				+ "작성자: %s\n"
				+ "작성일: %s\n",seq,title,content,writer);
	}
	
}
