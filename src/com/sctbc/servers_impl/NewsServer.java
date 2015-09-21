package com.sctbc.servers_impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sctbc.dao.NewsDao;
import com.sctbc.entity.News;
import com.sctbc.server_i.INews;
@Service
public class NewsServer implements INews {

	@Autowired
	NewsDao newsDao;
	@Override
	public News getById(int id) {
		// TODO Auto-generated method stub
		return newsDao.getById(id);
	}

	@Override
	public List<News> getList() {
		// TODO Auto-generated method stub
		return newsDao.getNewsAll();
	}

	@Override
	public boolean delById(int id) {
		// TODO Auto-generated method stub
		return newsDao.del(id);
	}

	@Override
	public boolean upData(News t) {
		// TODO Auto-generated method stub
		return newsDao.updateNews(t);
	}

	@Override
	public List<News> getListFoPage(String EntityName,
 Integer nowpage,
			String searchname) {
		// TODO Auto-generated method stub
		String where = "";
		return newsDao.getListFoPage(EntityName, nowpage, where);
	}

	@Override
	public Integer getCount(String EntityName) {
		// TODO Auto-generated method stub
		return newsDao.getCount(EntityName);
	}

	@Override
	public boolean addNews(News news) {
		// TODO Auto-generated method stub
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat(
				"yyyy/MM/dd");// 可以方便地修改日期格式
		news.setTime(dateFormat.format(now));
		dateFormat.format(now);
		return newsDao.insertNews(news);
	}
}
