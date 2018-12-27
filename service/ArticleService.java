package service;

import java.util.HashMap;

import domain.ArticleBean;

public interface ArticleService {
	/*
	 * private int seq; // 글번호 private String title, content, writer, redDate;
	 */
	/**
	 * CREATE
	 */
	public void createArticle(String title, String content, String writer, String pass);

	/**
	 * READ
	 */
	public HashMap<String, ArticleBean> list();
	public HashMap<String, ArticleBean> findByWriter(String writer);
	public ArticleBean findBytitle(int seq);
	public String createDate();
	public int countSeq();
	public boolean existContent(String content, String writer, String pass);

	/**
	 * UPDATE
	 */
	public void updateContent(String title, String writer, int seq, String pass);

	/**
	 * DELETE
	 */
	public void deletecontent(String title, String pass);
}
