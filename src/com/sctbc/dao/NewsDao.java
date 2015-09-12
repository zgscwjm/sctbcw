package com.sctbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sctbc.entity.News;

@Repository
public class NewsDao extends BaseDao {
	@Autowired
	HibernateTemplate hibernateTemplate;

	boolean result = true;

	public List<News> getNewsAll() {
		String hql = "from News";
		return hibernateTemplate.find(hql);
	}
	public News getById(int id) {
		News news = hibernateTemplate.get(News.class, id);
		return news;
	}
	public boolean insertNews(News news){
		try{
			hibernateTemplate.save(news);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
	public boolean updateNews(News news) {
		try {
			hibernateTemplate.update(news);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
	public boolean del(int id){
		News news = hibernateTemplate.get(News.class, id);
		try{
			hibernateTemplate.delete(news);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
}
