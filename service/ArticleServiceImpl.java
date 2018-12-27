package service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

import domain.ArticleBean;

public class ArticleServiceImpl implements ArticleService {
	private HashMap<String, ArticleBean> map;
	private int seq;
	public ArticleServiceImpl() {
		map = new HashMap<>();
		seq = 0;
	}
	
	@Override
	public void createArticle( String title, String content, String writer,String pass) {
		ArticleBean articleBean = new ArticleBean();
		articleBean.setTitle(title);
		articleBean.setContent(content);
		articleBean.setWriter(writer);
		articleBean.setPass(pass);
		articleBean.setSeq(seq);
		articleBean.setRedDate(this.createDate());
		map.put(articleBean.getTitle(), articleBean);
		seq++;
	}


	@Override
	public HashMap<String, ArticleBean> list() {
		return  (HashMap<String, ArticleBean>) map.values();
	}

	@Override
	public HashMap<String, ArticleBean> findByWriter(String writer) {
		HashMap<String, ArticleBean> whiters = new HashMap<>();
		Set<String> set = map.keySet();
		for(String key : set) {
			if(writer.equals(map.get(key).getWriter())) {
				whiters.put(key, map.get(writer));
			}
		}
		return whiters;
	}

	@Override
	public ArticleBean findBytitle(int seq) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String createDate() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date);
	}
	
	@Override
	public int countSeq() {
		// TODO Auto-generated method stub
		return map.size();
	}

	@Override
	public boolean existContent(String content, String writer, String pass) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateContent(String title, String writer, int seq, String pass) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletecontent(String title, String pass) {
		// TODO Auto-generated method stub

	}



}
